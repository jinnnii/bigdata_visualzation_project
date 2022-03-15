package com.kej.webboard.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.java.Log;

@Log
@Controller
@RequestMapping("/files/")
public class FileUploadController {
	@GetMapping("uploadForm")
	public void fileUploadForm() {
		
	}
	
	//form name과 동일하게 파라미터 이름 지정
	@PostMapping("uploadFormAction")
//	@ResponseBody
	public String uploadFormAction(MultipartFile[] uploads, HttpSession session,Model model) {
		String uploadFolder = session.getServletContext().getRealPath("/resources/upload");
		String today=new SimpleDateFormat("yyMMdd").format(new Date());
		String saveFolder=uploadFolder+File.separator+today;
		
		List<String> mfile = new ArrayList<String>();
		for(MultipartFile multipartFile:uploads) {
			String orifile=multipartFile.getOriginalFilename();
			UUID uuid=UUID.randomUUID();
			String uploadfileName = uuid.toString()+"_"+orifile;
			log.info("---------------------------------");
			log.info("origin file name : "+ multipartFile.getOriginalFilename());
			log.info("uploadfile name : "+uploadfileName);
			File saveFile = new File(saveFolder,uploadfileName);
			log.info(saveFolder);
			mfile.add(orifile);
			
			try {
				multipartFile.transferTo(saveFile);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		model.addAttribute("uploadFiles", mfile);
		return "/files/fileResult";
		
	}
}

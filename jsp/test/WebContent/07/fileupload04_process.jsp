<%@page import="org.apache.commons.fileupload.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String path="D:\\kej\\pj\\jsp\\test\\src\\main\\img";
		DiskFileUpload upload = new DiskFileUpload();
		
		upload.setSizeMax(1000000);//이미지 최대 크기
		upload.setSizeThreshold(4096);//저장 메모리 최대 크기
		upload.setRepositoryPath(path);//저장할 경로
		
		List items = upload.parseRequest(request);
		Iterator params = items.iterator();
		
		while(params.hasNext()){
			FileItem item = (FileItem) params.next();
			if(item.isFormField()){
				String name = item.getFieldName();
				String value = item.getString("utf-8");
				out.println(name+"="+value+"<br>");
			}else{
				String fileFieldName = item.getFieldName();
				String fileName = item.getName();
				String contentType = item.getContentType();
				
				fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
				long fileSize = item.getSize();
				
				File file = new File(path+"/"+fileName);
				item.write(file);
				
				out.println("-------------------------------------<br>");
				out.println("요청 파라미터 이름: "+fileFieldName+"<br>");
				out.println("저장 파일 이름: "+fileName+"<br>");
				out.println("저장 콘텐츠 유형: "+contentType+"<br>");
				out.println("파일 크기: "+fileSize+"<br>");
			}
		}
	%>
</body>
</html>
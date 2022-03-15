package com.kej.webboard.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // ==SampleVO(mno, firstName, lastName)
@NoArgsConstructor // ==SampleVO()
public class SampleVO {
	private int mno;
	private String firstName;
	private String lastName;
}

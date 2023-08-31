package com.bms.bmsspringbootrestjdbcmaven.model;

public class StudentDto {
	private int studId;
	private String studName;
	private int studScore;
	
	public StudentDto(int studId, String studName, int studScore) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studScore = studScore;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudScore() {
		return studScore;
	}

	public void setStudScore(int studScore) {
		this.studScore = studScore;
	}

	@Override
	public String toString() {
		return "StudentDto [studId=" + studId + ", studName=" + studName + ", studScore=" + studScore + "]";
	}
	
	
	
}

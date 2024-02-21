package com.saswath.telspiel.serviceResponse;

public class SmsResponse {

	private String code;
	private String desc;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "SmsResponse [code=" + code + ", desc=" + desc + "]";
	}

}

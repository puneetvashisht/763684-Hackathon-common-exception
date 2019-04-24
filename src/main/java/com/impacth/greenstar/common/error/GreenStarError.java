package com.impacth.greenstar.common.error;

public enum GreenStarError implements GreenStarResponseCode {

	APPLICATION_ERROR("GS01", "Internal Error occured, Plesase try again later"),
	NO_VALUE_FOUND_ERROR("GS02", "Value not found");
	
	private final String code;
	private final String description;

	private GreenStarError(String code, String description) {
		this.code = code;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public String getCode() {
		return code;
	}

}

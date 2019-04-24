package com.impacth.greenstar.common.exception;

import com.impacth.greenstar.common.error.GreenStarResponseCode;

public class GreenStarRuntimeException extends RuntimeException {

	private static final long serialVersionUID = -6831885879484178894L;

	private final String errorCode;
	private final String errorMessage;

	public GreenStarRuntimeException(GreenStarResponseCode error) {
		super(error.getDescription());
		this.errorMessage = error.getDescription();
		this.errorCode = error.getCode();
	}

	public GreenStarRuntimeException(GreenStarResponseCode error, String message) {
		super(message);
		this.errorMessage = message;
		this.errorCode = error.getCode();
	}

	public GreenStarRuntimeException(GreenStarResponseCode error, Exception exception) {
		super(error.getDescription(), exception);
		this.errorMessage = error.getDescription();
		this.errorCode = error.getCode();
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}

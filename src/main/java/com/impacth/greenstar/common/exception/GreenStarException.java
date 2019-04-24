package com.impacth.greenstar.common.exception;

import java.io.Serializable;

import com.impacth.greenstar.common.error.GreenStarResponseCode;

public class GreenStarException extends Exception implements Serializable {
	
	private static final long serialVersionUID = -2590069565200027537L;
	private final String errorCode;
	private final String errorMessage;
	private final String[] varArgs;
	
	public String getErrorCode() {
		return errorCode;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public String[] getVarArgs() {
		return varArgs;
	}
	
	public GreenStarException(GreenStarResponseCode error) {
		super(error.getDescription());
		this.errorMessage=error.getDescription();
		this.errorCode = error.getCode();
		this.varArgs=null;
	}
	
	public GreenStarException(GreenStarResponseCode error, String... values) {
		super(String.format(error.getDescription(),values));
		this.errorCode = error.getCode();
		this.errorMessage=error.getDescription();
		this.varArgs=values;
	}

	public GreenStarException(GreenStarResponseCode error, Exception exception) {
		super(error.getDescription(),exception);
		this.errorMessage=exception.getMessage();
		this.errorCode= error.getCode();
		this.varArgs=null;
	}
	
	public GreenStarException(String errorCode) {
		super();
		this.errorMessage=getMessage();
		this.errorCode= errorCode;
		this.varArgs=null;
	}
	
	public GreenStarException(String errorCode, String errorMessage) {
		super(errorMessage);
		this.errorMessage=errorMessage;
		this.errorCode= errorCode;
		this.varArgs=null;
	}
}

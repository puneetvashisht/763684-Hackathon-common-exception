package com.impacth.greenstar.common.exception;

import java.util.ArrayList;
import java.util.List;

import com.impacth.greenstar.common.error.GreenStarResponseCode;

public class GreenStarMessageFormatException extends GreenStarException {


	private static final long serialVersionUID = -2034919755847906603L;
	private final List<String> errorFields= new ArrayList<>();
	
	public GreenStarMessageFormatException(GreenStarResponseCode error, Exception exception) {
		super(error, exception);
	}
	
	public GreenStarMessageFormatException(GreenStarResponseCode error, Exception exception, String fieldName) {
		super(error, exception);
		errorFields.add(fieldName);
	}

	public List<String> getErrorFields() {
		return errorFields;
	}
	
	public void setErrorFields(List<String> errorFields) {
		this.errorFields.addAll(errorFields);
	}
	
	public String getErrorFieldList() {
		String fieldList="";
		if(errorFields.size()>1) {
			for(String each:errorFields) {
				fieldList="["+each+", ";
			}
			fieldList=fieldList+"]";
		}else if(errorFields.size()==1){
			fieldList="["+errorFields.get(0)+"]";
		}
		
		return fieldList;
	}
	
}

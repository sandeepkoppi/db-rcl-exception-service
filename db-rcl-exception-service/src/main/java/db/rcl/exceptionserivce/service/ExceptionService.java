package db.rcl.exceptionserivce.service;

import java.util.List;

import db.rcl.exceptionserivce.dto.ExceptionDTO;

public interface ExceptionService {

	public List<ExceptionDTO> getException();

	public List<ExceptionDTO> getExceptionByRuleId(ExceptionDTO exceptionDTO);
	
	public List<ExceptionDTO> exceptionByAttributes(List<ExceptionDTO> exceptionDTOs);
}

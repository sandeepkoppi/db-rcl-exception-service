package db.rcl.exceptionserivce.dao;

import java.util.List;

import db.rcl.exceptionserivce.bo.ExceptionBO;
import db.rcl.exceptionserivce.dto.ExceptionDTO;

public interface ExceptionDAO {

	public List<ExceptionBO> getExceptions();

	public List<ExceptionBO> getExceptionByRuleId(ExceptionBO exceptionBO);

	public List<ExceptionBO> exceptionByAttributes(List<ExceptionBO> exceptionBOs);

}

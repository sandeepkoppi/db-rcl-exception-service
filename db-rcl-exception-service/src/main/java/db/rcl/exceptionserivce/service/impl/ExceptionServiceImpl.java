package db.rcl.exceptionserivce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import db.rcl.exceptionserivce.bo.ExceptionBO;
import db.rcl.exceptionserivce.dao.ExceptionDAO;
import db.rcl.exceptionserivce.dto.ExceptionDTO;
import db.rcl.exceptionserivce.service.ExceptionService;
import db.rcl.exceptionserivce.translator.ExceptionTranslator;

@Service
public class ExceptionServiceImpl implements ExceptionService {

	@Autowired
	ExceptionDAO exceptionDAO;

	@Override
	public List<ExceptionDTO> getException() {
		ExceptionTranslator exceptionTranslator = new ExceptionTranslator();

		List<ExceptionBO> exceptionBOs = exceptionDAO.getExceptions();
		List<ExceptionDTO> exceptionDTOs = exceptionTranslator.transferExceptionBOTODTOList(exceptionBOs);

		return exceptionDTOs;
	}

	@Override
	public List<ExceptionDTO> getExceptionByRuleId(ExceptionDTO exceptionDTO) {

		ExceptionTranslator exceptionTranslator = new ExceptionTranslator();
		ExceptionBO exceptionBO = exceptionTranslator.transferExceptionDTOTOBO(exceptionDTO);

		List<ExceptionBO> exceptionBOs = exceptionDAO.getExceptionByRuleId(exceptionBO);
		List<ExceptionDTO> exceptionDTOs = exceptionTranslator.transferExceptionBOTODTOList(exceptionBOs);
		return exceptionDTOs;
	}

	@Override
	public List<ExceptionDTO> exceptionByAttributes(List<ExceptionDTO> exceptionDTOs) {

		ExceptionTranslator exceptionTranslator = new ExceptionTranslator();

		List<ExceptionBO> exceptionBOs = exceptionTranslator.transferExceptionDTOTOBOList(exceptionDTOs);

		List<ExceptionBO> exceptionBOS = exceptionDAO.exceptionByAttributes(exceptionBOs);

		List<ExceptionDTO> exceptionDTOS = exceptionTranslator.transferExceptionBOTODTOList(exceptionBOS);

		return exceptionDTOS;
	}

}

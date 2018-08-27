package db.rcl.exceptionserivce.translator;

import java.util.ArrayList;
import java.util.List;

import db.rcl.exceptionserivce.bo.ExceptionBO;
import db.rcl.exceptionserivce.dto.ExceptionDTO;

public class ExceptionTranslator {

	public ExceptionBO transferExceptionDTOTOBO(ExceptionDTO exceptionDTO) {

		ExceptionBO exceptionBO = new ExceptionBO();
		exceptionBO.setID(exceptionDTO.getId());
		exceptionBO.setLABEL_NAME(exceptionDTO.getLabel_Name());
		exceptionBO.setDQ_ATTRIBUTE(exceptionDTO.getDq_Atrribute());
		exceptionBO.setDQ_ATTRIBUTE_VALUE(exceptionDTO.getDq_Attribute_Value());
		exceptionBO.setAS_OF_DATE(exceptionDTO.getAs_Of_Date());
		exceptionBO.setDQ_ENTITY(exceptionDTO.getDq_Entity());
		exceptionBO.setDQ_EXCEPTION_MSG(exceptionDTO.getDq_Exception_Msg());
		exceptionBO.setDQ_RULE_ID(exceptionDTO.getDq_Rule_Id());
		exceptionBO.setPRIMARY_KEY(exceptionDTO.getPrimary_Key());

		return exceptionBO;

	}

	public List<ExceptionBO> transferExceptionDTOTOBOList(List<ExceptionDTO> exceptionDTOs) {

		List<ExceptionBO> exceptionBOs = new ArrayList<ExceptionBO>();
		for (ExceptionDTO exceptionDTO : exceptionDTOs) {
			ExceptionBO exceptionBO = new ExceptionBO();
			exceptionBO.setID(exceptionDTO.getId());
			exceptionBO.setLABEL_NAME(exceptionDTO.getLabel_Name());
			exceptionBO.setDQ_ATTRIBUTE(exceptionDTO.getDq_Atrribute());
			exceptionBO.setDQ_ATTRIBUTE_VALUE(exceptionDTO.getDq_Attribute_Value());
			exceptionBO.setAS_OF_DATE(exceptionDTO.getAs_Of_Date());
			exceptionBO.setDQ_ENTITY(exceptionDTO.getDq_Entity());
			exceptionBO.setDQ_EXCEPTION_MSG(exceptionDTO.getDq_Exception_Msg());
			exceptionBO.setDQ_RULE_ID(exceptionDTO.getDq_Rule_Id());
			exceptionBO.setPRIMARY_KEY(exceptionDTO.getPrimary_Key());
			exceptionBOs.add(exceptionBO);
		}
		return exceptionBOs;

	}

	public ExceptionDTO transferExceptionBOTODTO(ExceptionBO exceptionBO) {

		ExceptionDTO exceptionDTO = new ExceptionDTO();
		exceptionDTO.setId(exceptionBO.getID());
		exceptionDTO.setLabel_Name(exceptionBO.getLABEL_NAME());
		exceptionDTO.setDq_Atrribute(exceptionBO.getDQ_ATTRIBUTE());
		exceptionDTO.setDq_Attribute_Value(exceptionBO.getDQ_ATTRIBUTE_VALUE());
		exceptionDTO.setAs_Of_Date(exceptionBO.getAS_OF_DATE());
		exceptionDTO.setDq_Entity(exceptionBO.getDQ_ENTITY());
		exceptionDTO.setDq_Exception_Msg(exceptionBO.getDQ_EXCEPTION_MSG());
		exceptionDTO.setDq_Rule_Id(exceptionBO.getDQ_RULE_ID());
		exceptionDTO.setPrimary_Key(exceptionBO.getPRIMARY_KEY());

		return exceptionDTO;

	}

	public List<ExceptionDTO> transferExceptionBOTODTOList(List<ExceptionBO> exceptionBOs) {

		List<ExceptionDTO> exceptionDtos = new ArrayList<ExceptionDTO>();

		for (ExceptionBO exceptionBO : exceptionBOs) {
			ExceptionDTO exceptionDTO = new ExceptionDTO();
			exceptionDTO.setId(exceptionBO.getID());
			exceptionDTO.setLabel_Name(exceptionBO.getLABEL_NAME());
			exceptionDTO.setDq_Atrribute(exceptionBO.getDQ_ATTRIBUTE());
			exceptionDTO.setDq_Attribute_Value(exceptionBO.getDQ_ATTRIBUTE_VALUE());
			exceptionDTO.setAs_Of_Date(exceptionBO.getAS_OF_DATE());
			exceptionDTO.setDq_Entity(exceptionBO.getDQ_ENTITY());
			exceptionDTO.setDq_Exception_Msg(exceptionBO.getDQ_EXCEPTION_MSG());
			exceptionDTO.setDq_Rule_Id(exceptionBO.getDQ_RULE_ID());
			exceptionDTO.setPrimary_Key(exceptionBO.getPRIMARY_KEY());
			exceptionDtos.add(exceptionDTO);
		}
		return exceptionDtos;

	}
}

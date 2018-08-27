package db.rcl.exceptionserivce.resource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import db.rcl.exceptionserivce.dto.ExceptionDTO;
import db.rcl.exceptionserivce.service.ExceptionService;

@RestController
@RequestMapping(value="/exceptions")
public class ExceptionResource {
	
	@Autowired
	ExceptionService exceptionService;
	
	//@RequestMapping(value = "/getAllExceptions", method = RequestMethod.GET)
	@GetMapping(value="/getAllExceptions")
	public List<ExceptionDTO> Exceptions(){
		
		List<ExceptionDTO> exceptions = exceptionService.getException();
		
		return exceptions;
	}

	@PostMapping(value = "/byRule")
	public List<ExceptionDTO> Exception(@RequestBody ExceptionDTO exceptionDTO) {
		
		System.out.println("rule id "+ exceptionDTO.getDq_Rule_Id());
		List<ExceptionDTO> exceptionList = new ArrayList<ExceptionDTO>();
		exceptionList = exceptionService.getExceptionByRuleId(exceptionDTO);
		
		System.out.println("The list of the exceptions" + exceptionList);
		
		return exceptionList;
		
	}
	
//	@PostMapping(value = "/")
//	public List<ExceptionDTO> Exception(@RequestBody ExceptionDTO exceptionDTO){
//		
//	}
	
	@PostMapping(value = "/byAttributes")
	public List<ExceptionDTO> ExceptionByAttributes(@RequestBody List<ExceptionDTO> exceptionDTOs) {
		
		List<ExceptionDTO> exceptionList = new ArrayList<ExceptionDTO>();
		exceptionList = exceptionService.exceptionByAttributes(exceptionDTOs);
		
		return exceptionList;
		
	}
}


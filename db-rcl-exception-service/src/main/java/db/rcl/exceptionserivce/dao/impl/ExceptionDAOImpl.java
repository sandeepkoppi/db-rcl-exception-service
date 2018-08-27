package db.rcl.exceptionserivce.dao.impl;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import db.rcl.exceptionserivce.bo.ExceptionBO;
import db.rcl.exceptionserivce.bo.PartyBO;
import db.rcl.exceptionserivce.bo.RuleBO;
import db.rcl.exceptionserivce.constants.DBConstants;
import db.rcl.exceptionserivce.dao.ExceptionDAO;
import db.rcl.exceptionserivce.dto.ExceptionData;

@Component
public class ExceptionDAOImpl implements ExceptionDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<ExceptionBO> getExceptions() {

		List<ExceptionBO> exceptions = jdbcTemplate.query(DBConstants.GET_ALL_EXCEPTION,
				new BeanPropertyRowMapper(ExceptionBO.class));
		runRule();

		return exceptions;
	}

	@Override
	public List<ExceptionBO> getExceptionByRuleId(ExceptionBO exceptionBO) {

		List<ExceptionBO> exceptionsOnRuleId = (List<ExceptionBO>) jdbcTemplate.query(
				DBConstants.GET_EXCEPTION_BASED_ON_RULE, new Object[] { exceptionBO.getDQ_RULE_ID() },
				new BeanPropertyRowMapper(ExceptionBO.class));
		return exceptionsOnRuleId;
	}

	public List<ExceptionBO> exceptionByAttributes(List<ExceptionBO> exceptions) {

		String query = DBConstants.GET_EXCEPTION_BASED_ON_MULTIPLE_ATTRIBUTES;
		List<String> attributes = new ArrayList<String>();

		for (int i = 0; i < exceptions.size(); i++) {
			attributes.add(exceptions.get(i).getDQ_ATTRIBUTE());

			if (i == exceptions.size() - 1)
				query = query + " ? )";
			else
				query = query + " ? ,";
		}

		Object[] objects = attributes.toArray(new String[exceptions.size()]);

		System.out.println("QUERY " + query + "  PArams " + objects.length);
		List<ExceptionBO> exceptionsOnRuleId = (List<ExceptionBO>) jdbcTemplate.query(query, objects,
				new BeanPropertyRowMapper(ExceptionBO.class));

		return exceptionsOnRuleId;
	}

	public void runRule() {
	

		List<RuleBO> rules = jdbcTemplate.query(DBConstants.GET_RULES, new BeanPropertyRowMapper(RuleBO.class));

		System.out.println("Rules Size " + rules.size());

		rules.stream().forEach(c -> {

			List<ExceptionData> parties = jdbcTemplate.query(c.getRule(),
					new BeanPropertyRowMapper(ExceptionData.class));
			//LABEL_NAME, AS_OF_DATE, DQ_RULE_ID, DQ_ENTITY, DQ_ATTRIBUTE, DQ_ATTRIBUTE_VALUE, DQ_EXCEPTION_MSG
			

			parties.stream().forEach(record -> {
				String lableName = record.getLabel_name();
				String as_of_date = record.getAs_of_date();
				String rule_id = c.getRule_id();
				String entityName = c.getEntity();
				String attributeName = c.getAttribute();
				String attributeValue = record.getAttribute_value();
				String exceptionDescription = c.getRule_description();
				
				Object[] objects = {lableName, as_of_date, rule_id, entityName, attributeName, attributeValue, exceptionDescription};
			     int r =   jdbcTemplate.update(DBConstants.INSERT_EXCEPTION, objects);
			     System.out.println("Rows Effecred " + r);

				
			});

		});

	}

}

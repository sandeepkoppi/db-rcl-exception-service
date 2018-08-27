package db.rcl.exceptionserivce.constants;

public class DBConstants {

	public static final String GET_ALL_EXCEPTION = "SELECT * FROM exception";

	public static final String GET_EXCEPTION_BASED_ON_RULE = "SELECT * FROM exception WHERE DQ_RULE_ID=?";

	public static final String GET_EXCEPTION_BASED_ON_TABLE = "SELECT * FROM exception WHERE DQ_ENTITY=?";

	public static final String GET_EXCEPTION_BASED_ON_ATTRIBUTE = "SELECT * FROM exception WHERE DQ_ATTRIBUTE=?";

	public static final String GET_EXCEPTION_BASED_ON_MULTIPLE_ATTRIBUTES = "SELECT * FROM exception WHERE DQ_ATTRIBUTE IN (";

	public static final String GET_RULES = "SELECT * FROM rule";
	
	public static final String INSERT_EXCEPTION = "insert into exception(LABEL_NAME, AS_OF_DATE, DQ_RULE_ID, DQ_ENTITY, DQ_ATTRIBUTE, DQ_ATTRIBUTE_VALUE, DQ_EXCEPTION_MSG) VALUES(?, ?, ?, ?, ?, ?, ?)";

}

package db.rcl.exceptionserivce.bo;

import java.util.Date;

public class ExceptionBO {

	private String ID;
	private String LABEL_NAME;
	private Date AS_OF_DATE;
	private String DQ_RULE_ID;
	private String DQ_ENTITY;
	private String DQ_ATTRIBUTE;
	private String DQ_ATTRIBUTE_VALUE;
	private String DQ_EXCEPTION_MSG;
	private String PRIMARY_KEY;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getLABEL_NAME() {
		return LABEL_NAME;
	}
	public void setLABEL_NAME(String lABEL_NAME) {
		LABEL_NAME = lABEL_NAME;
	}
	public Date getAS_OF_DATE() {
		return AS_OF_DATE;
	}
	public void setAS_OF_DATE(Date aS_OF_DATE) {
		AS_OF_DATE = aS_OF_DATE;
	}
	public String getDQ_RULE_ID() {
		return DQ_RULE_ID;
	}
	public void setDQ_RULE_ID(String dQ_RULE_ID) {
		DQ_RULE_ID = dQ_RULE_ID;
	}
	public String getDQ_ENTITY() {
		return DQ_ENTITY;
	}
	public void setDQ_ENTITY(String dQ_ENTITY) {
		DQ_ENTITY = dQ_ENTITY;
	}
	public String getDQ_ATTRIBUTE() {
		return DQ_ATTRIBUTE;
	}
	public void setDQ_ATTRIBUTE(String dQ_ATTRIBUTE) {
		DQ_ATTRIBUTE = dQ_ATTRIBUTE;
	}
	public String getDQ_ATTRIBUTE_VALUE() {
		return DQ_ATTRIBUTE_VALUE;
	}
	public void setDQ_ATTRIBUTE_VALUE(String dQ_ATTRIBUTE_VALUE) {
		DQ_ATTRIBUTE_VALUE = dQ_ATTRIBUTE_VALUE;
	}
	public String getDQ_EXCEPTION_MSG() {
		return DQ_EXCEPTION_MSG;
	}
	public void setDQ_EXCEPTION_MSG(String dQ_EXCEPTION_MSG) {
		DQ_EXCEPTION_MSG = dQ_EXCEPTION_MSG;
	}
	public String getPRIMARY_KEY() {
		return PRIMARY_KEY;
	}
	public void setPRIMARY_KEY(String pRIMARY_KEY) {
		PRIMARY_KEY = pRIMARY_KEY;
	}
	
	@Override
	public String toString() {
		return "ExceptionBO [ID=" + ID + ", LABEL_NAME=" + LABEL_NAME + ", AS_OF_DATE=" + AS_OF_DATE + ", DQ_RULE_ID="
				+ DQ_RULE_ID + ", DQ_ENTITY=" + DQ_ENTITY + ", DQ_ATTRIBUTE=" + DQ_ATTRIBUTE + ", DQ_ATTRIBUTE_VALUE="
				+ DQ_ATTRIBUTE_VALUE + ", DQ_EXCEPTION_MSG=" + DQ_EXCEPTION_MSG + ", PRIMARY_KEY=" + PRIMARY_KEY + "]";
	}
	
	
}

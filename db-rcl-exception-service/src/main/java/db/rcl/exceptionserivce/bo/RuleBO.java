package db.rcl.exceptionserivce.bo;

public class RuleBO {

	private String rule_id;
	private String rule_description;
	private String rule;
	private String entity;
	private String attribute;
	private String entity_bo;
	
	public String getEntity_bo() {
		return entity_bo;
	}
	public void setEntity_bo(String entity_bo) {
		this.entity_bo = entity_bo;
	}
	public String getRule_id() {
		return rule_id;
	}
	public void setRule_id(String rule_id) {
		this.rule_id = rule_id;
	}
	public String getRule_description() {
		return rule_description;
	}
	public void setRule_description(String rule_description) {
		this.rule_description = rule_description;
	}
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	public String getEntity() {
		return entity;
	}
	public void setEntity(String entity) {
		this.entity = entity;
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
	
	
	
	
}

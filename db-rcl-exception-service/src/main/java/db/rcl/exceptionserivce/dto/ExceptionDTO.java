package db.rcl.exceptionserivce.dto;

import java.io.Serializable;
import java.util.Date;

public class ExceptionDTO implements Serializable{

	private String id;
	private String label_Name;
	private Date as_Of_Date;
	private String dq_Rule_Id;
	private String dq_Entity;
	private String dq_Atrribute;
	private String dq_Attribute_Value;
	private String dq_Exception_Msg;
	private String primary_Key;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLabel_Name() {
		return label_Name;
	}
	public void setLabel_Name(String label_Name) {
		this.label_Name = label_Name;
	}
	public Date getAs_Of_Date() {
		return as_Of_Date;
	}
	public void setAs_Of_Date(Date as_Of_Date) {
		this.as_Of_Date = as_Of_Date;
	}
	public String getDq_Rule_Id() {
		return dq_Rule_Id;
	}
	public void setDq_Rule_Id(String dq_Rule_Id) {
		this.dq_Rule_Id = dq_Rule_Id;
	}
	public String getDq_Entity() {
		return dq_Entity;
	}
	public void setDq_Entity(String dq_Entity) {
		this.dq_Entity = dq_Entity;
	}
	public String getDq_Atrribute() {
		return dq_Atrribute;
	}
	public void setDq_Atrribute(String dq_Atrribute) {
		this.dq_Atrribute = dq_Atrribute;
	}
	public String getDq_Attribute_Value() {
		return dq_Attribute_Value;
	}
	public void setDq_Attribute_Value(String dq_Attribute_Value) {
		this.dq_Attribute_Value = dq_Attribute_Value;
	}
	public String getDq_Exception_Msg() {
		return dq_Exception_Msg;
	}
	public void setDq_Exception_Msg(String dq_Exception_Msg) {
		this.dq_Exception_Msg = dq_Exception_Msg;
	}
	public String getPrimary_Key() {
		return primary_Key;
	}
	public void setPrimary_Key(String primary_Key) {
		this.primary_Key = primary_Key;
	} 
	
	
	
}
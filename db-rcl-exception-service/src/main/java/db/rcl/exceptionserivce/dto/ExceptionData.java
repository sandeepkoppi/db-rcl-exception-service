package db.rcl.exceptionserivce.dto;

import java.io.Serializable;

public class ExceptionData implements Serializable {

	private String attribute_value;
	private String label_name;
	private String as_of_date;

	public String getAttribute_value() {
		return attribute_value;
	}

	public void setAttribute_value(String attribute_value) {
		this.attribute_value = attribute_value;
	}

	public String getLabel_name() {
		return label_name;
	}

	public void setLabel_name(String label_name) {
		this.label_name = label_name;
	}

	public String getAs_of_date() {
		return as_of_date;
	}

	public void setAs_of_date(String as_of_date) {
		this.as_of_date = as_of_date;
	}

	@Override
	public String toString() {
		return "ExceptionData [attribute_value=" + attribute_value + ", label_name=" + label_name + ", as_of_date="
				+ as_of_date + "]";
	}

	
	

}

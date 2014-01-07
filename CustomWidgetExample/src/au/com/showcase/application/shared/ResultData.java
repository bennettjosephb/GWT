package au.com.showcase.application.shared;

import java.io.Serializable;
import java.util.Date;

public class ResultData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2243202185343762001L;

	private String name;

	private String rollNo;

	private String value;

	private Date date;

	private Integer no;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

}

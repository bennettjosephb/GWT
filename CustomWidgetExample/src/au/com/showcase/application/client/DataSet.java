package au.com.showcase.application.client;

import java.io.Serializable;
import java.util.Date;

public class DataSet implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6063205451890109020L;

	private String one;

	private Date date;

	private Integer i;

	private Float flfl;

	public String getOne() {
		return one;
	}

	public void setOne(String one) {
		this.one = one;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getI() {
		return i;
	}

	public void setI(Integer i) {
		this.i = i;
	}

	public Float getFlfl() {
		return flfl;
	}

	public void setFlfl(Float flfl) {
		this.flfl = flfl;
	}

}

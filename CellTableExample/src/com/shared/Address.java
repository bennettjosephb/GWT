package com.shared;

public class Address {

	private String houseNo;
	private Integer familyCount;
	private Integer area;

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public Integer getFamilyCount() {
		return familyCount;
	}

	public void setFamilyCount(Integer familyCount) {
		this.familyCount = familyCount;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public String getStreet1() {
		return Street1;
	}

	public void setStreet1(String street1) {
		Street1 = street1;
	}

	public String getStreet2() {
		return Street2;
	}

	public void setStreet2(String street2) {
		Street2 = street2;
	}

	private String Street1;
	private String Street2;

}

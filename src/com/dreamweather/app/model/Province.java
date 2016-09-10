package com.dreamweather.app.model;

/**
 * province实体类
 * 
 * @author Shur
 *
 */
public class Province {

	private int id;// id
	private String provinceName;// province名字
	private String provinceCode;// province代码

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
}

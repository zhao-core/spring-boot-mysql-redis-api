package com.test.springboot.sys.entity;

import java.io.Serializable;

/**
 *
 **/
public class Dict implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String code;
	private String text;
	private String type;
	private String value;
	private String isLoad;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getIsLoad() {
		return isLoad;
	}

	public void setIsLoad(String isLoad) {
		this.isLoad = isLoad;
	}

}
/**
 * 
 */
package com.learning.spring.uc1.springlearninguc1.domain;

import javax.persistence.*;

/**
 * @author saritha
 *
 */
@Entity
public class TourPackage {
	
	@Id
	private String code;
	
	
	@Column
	private String name;
	
	protected TourPackage() {}
	
	public TourPackage(String code, String name)
	
	{
		this.code= code;
		
		this.name = name;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
}

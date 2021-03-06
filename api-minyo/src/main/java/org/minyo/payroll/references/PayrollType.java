package org.minyo.payroll.references;

import javax.persistence.*;

@Entity
@Table(name="ref_payroll_type")
public class PayrollType {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="payroll_type_id")
	private long id;
	
	@Column(name="payroll_type_name")
	private String name;
	
	@Column(name="payroll_type_description")
	private String description;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
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

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}

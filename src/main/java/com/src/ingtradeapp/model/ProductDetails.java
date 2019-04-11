package com.src.ingtradeapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ProductDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long id;

	private Boolean status;
	
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Column
	private Long productId;

	@Column
	private String name;

	@Column
	private Integer percentage;

	@Column
	private String special;

	@Column
	private String withdrawl;

	@Column
	private String minleg;

	@Column
	private String language;

	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Column
	private String maxleg;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPercentage() {
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		this.percentage = percentage;
	}

	public String getSpecial() {
		return special;
	}

	public void setSpecial(String special) {
		this.special = special;
	}

	public String getWithdrawl() {
		return withdrawl;
	}

	public void setWithdrawl(String withdrawl) {
		this.withdrawl = withdrawl;
	}

	public String getMinleg() {
		return minleg;
	}

	public void setMinleg(String minleg) {
		this.minleg = minleg;
	}

	public String getMaxleg() {
		return maxleg;
	}

	public void setMaxleg(String maxleg) {
		this.maxleg = maxleg;
	}
}
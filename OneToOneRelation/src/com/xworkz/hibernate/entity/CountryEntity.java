package com.xworkz.hibernate.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="country")
public class CountryEntity implements Serializable{

	@Id
	@GenericGenerator(name="abc",strategy="increment")
	@GeneratedValue(generator="abc")
	@Column(name="C_id")
	private Integer cid;
	@Column(name="C_name")
	private String name;
	@Column(name="C_capital")
	private String capital;
	@Column(name="C_currency")
	private String currency;
	@Column(name="C_democratic")
	private boolean democratic;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private FlagEntity flagEntity;
	
	public CountryEntity() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public boolean isDemocratic() {
		return democratic;
	}

	public void setDemocratic(boolean democratic) {
		this.democratic = democratic;
	}

	public FlagEntity getFlagEntity() {
		return flagEntity;
	}

	public void setFlagEntity(FlagEntity flagEntity) {
		this.flagEntity = flagEntity;
	}

	@Override
	public String toString() {
		return "CountryEntity [cid=" + cid + ", name=" + name + ", capital=" + capital + ", currency=" + currency
				+ ", democratic=" + democratic + ", flagEntity=" + flagEntity + "]";
	}

	
	
}

package com.xworkz.hibernate.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "flag")
public class FlagEntity implements Serializable {

	@Id
	@GenericGenerator(name = "abc", strategy = "increment")
	@GeneratedValue(generator = "abc")
	@Column(name = "F_id")
	private Integer fid;
	@Column(name = "F_name")
	private String name;
	@Column(name = "F_designedBy")
	private String designedBy;
	@Column(name = "F_noOfColor")
	private int noOfColor;
	@Column(name = "F_adaptedYear")
	private Date adaptedYear;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "F_countryEntity")
	private CountryEntity countryEntity;

	public FlagEntity() {
		System.out.println("created.....\t" + this.getClass().getSimpleName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignedBy() {
		return designedBy;
	}

	public void setDesignedBy(String designedBy) {
		this.designedBy = designedBy;
	}

	public int getNoOfColor() {
		return noOfColor;
	}

	public void setNoOfColor(int noOfColor) {
		this.noOfColor = noOfColor;
	}

	public Date getAdaptedYear() {
		return adaptedYear;
	}

	public void setAdaptedYear(Date adaptedYear) {
		this.adaptedYear = adaptedYear;
	}

	public CountryEntity getCountryEntity() {
		return countryEntity;
	}

	public void setCountryEntity(CountryEntity countryEntity) {
		this.countryEntity = countryEntity;
	}

	@Override
	public String toString() {
		return "FlagEntity [fid=" + fid + ", name=" + name + ", designedBy=" + designedBy + ", noOfColor=" + noOfColor
				+ ", adaptedYear=" + adaptedYear + ", countryEntity=" + countryEntity + "]";
	}

}

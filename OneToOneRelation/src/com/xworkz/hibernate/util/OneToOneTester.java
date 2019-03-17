package com.xworkz.hibernate.util;

import java.util.Date;

import com.xworkz.hibernate.entity.CountryEntity;
import com.xworkz.hibernate.entity.FlagEntity;
import com.xworkz.hibernate.repositary.CountryRepositary;

public class OneToOneTester {

	public static void main(String[] args) {
		// Create an obj of country
		// init prop's of country
		// create an obj of flag
		// init prop's of flag
		// relate country and flag

		CountryEntity countryEntity = new CountryEntity();
		countryEntity.setName("india");
		countryEntity.setCapital("newDelhi");
		countryEntity.setCurrency("rupees");
		countryEntity.setDemocratic(true);
		
		FlagEntity flagEntity = new FlagEntity();
		flagEntity.setName("tiranga");
		flagEntity.setAdaptedYear(new Date());
		flagEntity.setDesignedBy("Pingali Venkayya");
		flagEntity.setNoOfColor(3);
		
		
		countryEntity.setFlagEntity(flagEntity);
		flagEntity.setCountryEntity(countryEntity);
		
		CountryRepositary countryRepositary=new CountryRepositary();
		countryRepositary.save(countryEntity);

	}

}

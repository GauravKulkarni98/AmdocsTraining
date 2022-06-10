package com.training.amdocs.dao;

import java.util.List;

import com.training.amdocs.pojo.CovidCentre;

public interface ICentreDAo {
	
	List<CovidCentre> getAllCentres();
	
	CovidCentre getCovidCentre(int pincode);
	
	CovidCentre addCovidCentre(CovidCentre c);

}

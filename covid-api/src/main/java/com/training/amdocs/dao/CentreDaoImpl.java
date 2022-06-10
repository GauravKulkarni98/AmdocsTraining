package com.training.amdocs.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.training.amdocs.pojo.CovidCentre;

@Component
public class CentreDaoImpl  implements ICentreDAo{
	
	List<CovidCentre> centres = new ArrayList<CovidCentre>();
	
	public CentreDaoImpl() {
		// TODO Auto-generated constructor stub
		
		centres.add(new CovidCentre(1, "Sancheti", "Pune", 411041));
		centres.add(new CovidCentre(2, "Cooper", "Mumbai", 123456));
		centres.add(new CovidCentre(3, "Ruby", "Pune",411007));
		
	}
	
	public List<CovidCentre> getAllCentres(){
		return centres;
	}
	
	public CovidCentre getCovidCentre(int pincode) {
		
		CovidCentre cc = null;
		
		for(CovidCentre c : centres) {
			if(c.getPincode()==pincode) {
				cc=c;
				break;
			}
		}
		
		return cc;
	}

	@Override
	public CovidCentre addCovidCentre(CovidCentre c) {
		// TODO Auto-generated method stub
		CovidCentre newCentre = new CovidCentre(c.getId(), c.getName(), c.getAddress(), c.getPincode());
		return newCentre;
	}
	
	


}

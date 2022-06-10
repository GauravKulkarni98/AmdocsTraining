package com.training.amdocs.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.amdocs.dao.CentreDaoImpl;
import com.training.amdocs.pojo.CovidCentre;

@RestController
public class CovidController {
	@Autowired
	private CentreDaoImpl centreDao;
	
	public CovidController() {
		System.out.println("in ctor of " + getClass());
	}
	
	@GetMapping("/allCentres")
	public ResponseEntity<?> getAllCentres() {
		System.out.println("in get all centres");
		return new ResponseEntity<>(centreDao.getAllCentres(), HttpStatus.OK);
	}
	
	@GetMapping("/allCentres/{pincode}")
	public ResponseEntity<?> getCentreByPincode(@PathVariable int pincode) {
		System.out.println("in get  centre by pincode");
		return new ResponseEntity<>(centreDao.getCovidCentre(pincode), HttpStatus.OK);
	}
	
	@PostMapping("/addCentre")
	public ResponseEntity<?> addCentre(@RequestBody CovidCentre cc ){
		System.out.println("in add new Centre");
		return new ResponseEntity<>(centreDao.addCovidCentre(cc), HttpStatus.CREATED);
	}
	
	

}


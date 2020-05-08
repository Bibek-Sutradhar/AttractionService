package com.ibm.AttractionService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.AttractionService.dto.AttractionServiceDTO;
import com.ibm.AttractionService.service.AttractionPlannerService;

@CrossOrigin(origins = "*")
@RestController
public class AttractionServiceController {

	@Autowired
	AttractionPlannerService attractionPlannerService;
	
	@PostMapping(value = "/attraction")
	public void getAttractions(@RequestBody AttractionServiceDTO attractionServiceDTO) {
		
	}
}

package com.emart.hibernet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.emart.hibernet.model.Emart ;
import com.emart.hibernet.service.EmartService;
@Component
@RestController
public class EmartController {
	
	/*@Autowired
	private EmartService Emartservice;
	
	@RequestMapping(value="/getAllItems",method=RequestMethod.GET)
	public @ResponseBody List<Emart> getAllItems(){
		try {
			return Emartservice.getAllItems();
		} catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}*/

}

package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Data;
import com.springboot.model.NeuralNetwork;
import com.springboot.model.Node;
import com.springboot.service.DataService;

@RestController
@RequestMapping("/api/Data")
public class DataController {

	@Autowired
	DataService service;
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addFC(@RequestBody Data d)
	{
		service.addData(d);;
	}
	@CrossOrigin
	@RequestMapping(path = "/all",method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Data> findAll() 
	{
		return service.findAllData();
	}

	@RequestMapping(path = "/instance",method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Data> instance() 
	{
		List<Data> d = findAll(); 
		NeuralNetwork n = new NeuralNetwork();
		n.head = n.push(n.head,"GGGAAA","((()))");
		n.printList();
		return d;
	}
	
}

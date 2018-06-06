package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
	NeuralNetwork n = new NeuralNetwork();
	@Autowired
	DataService service;
	@CrossOrigin
	@RequestMapping(method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addFC(@RequestBody Data d)
	{
		service.addData(d);
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
		n.head = n.push(n.head,"test","head");
		n.printList();
		return d;
	}
	@RequestMapping(path = "/add2nn",method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE)
	public void add2nn() 
	{
	
	
		n.head = n.push(n.head,"test","head");
		n.head.dot = n.push(n.head,"G",".");
		int i;
		List<Data> data = service.findAllData();
		for(i=0;i<data.size();i++)
		{
			n.head=n.push(n.head, data.get(i).getAnswer(), data.get(i).getPuzzleSequence());
		}
//		n.printList();
	}
	/*neural network works but cannot retrive?*/
	@RequestMapping(path = "/solve/{Sequence}",method = RequestMethod.GET,  produces=MediaType.APPLICATION_JSON_VALUE)
	public String solve(@PathVariable(value="Sequence") String s) 
	{
	
		int i;
		Node temp = n.head;
		for(i=0;i<s.length();i++)
		{
				if(s.charAt(i)=='.')
				{
					temp = temp.dot;
				}
				if(s.charAt(i)=='('||s.charAt(i)==')')
				{
					temp = temp.line;
				}
		}
		return temp.ans;
	}
}

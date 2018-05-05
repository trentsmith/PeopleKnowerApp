package com.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.model.Data;
import com.springboot.repository.DataRepository;

@Service
@Transactional
public class DataServiceImpl implements DataService
{

	@Autowired
	private DataRepository dRepo;

	public void addData(Data d) 
	{
		// TODO Auto-generated method stub
		dRepo.save(d);
	}

	public List<Data> findAllData() 
	{
		// TODO Auto-generated method stub
		return dRepo.findAll();
	}
	public void updateData(Data d) 
	{
		// TODO Auto-generated method stub
		dRepo.save(d);
	}
	public Data findById(int Id) 
	{
		Data d1 = new Data();
		ArrayList<Data> d = new ArrayList<Data>();
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<d.size();i++)
		{
		}
		return d1;
	}
}

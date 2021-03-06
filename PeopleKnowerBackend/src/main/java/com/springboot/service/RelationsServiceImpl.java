package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.model.Relations;
import com.springboot.repository.RelationsRepository;

@Service
@Transactional
public class RelationsServiceImpl implements RelationsService
{
	@Autowired
	private RelationsRepository pRepo;

	public void addPeopleKnowerUser(Relations p) 
	{
		// TODO Auto-generated method stub
		 pRepo.save(p);

	}

	public List<Relations> findAllPeopleKnower() {
		// TODO Auto-generated method stub
	
		return pRepo.findAll();

	}

	@Override
	public Relations findRelationById(int id) {
		// TODO Auto-generated method stub
		return pRepo.findRelationById(id);
	}
	

	
	
}

package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CurdDTO;
import com.example.demo.entity.Curd;
import com.example.demo.repository.CurdRepository;
import com.example.demo.service.CurdService;

@Service
public class CurdServiceImpl implements CurdService{

	@Autowired
	 
	CurdRepository curdRepository;
	
	@Override
	public List<Curd> getallcurd() {
		// TODO Auto-generated method stub
		return curdRepository.findAll();
	}


	
	@Override
	public Curd createdata(Curd curd) {
		
		return curdRepository.save(curd);
	}

	

	
}

package com.example.demo.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CurdDTO;
import com.example.demo.service.CurdService;

@Service
public class CurdServiceImpl implements CurdService{

	@Override
	public List<CurdDTO> getall() {
		// TODO Auto-generated method stub
		List<CurdDTO> cruddtolist = new ArrayList<>();
		cruddtolist.add(new CurdDTO("test", "123"));
		cruddtolist.add(new CurdDTO("test1", "1234"));
		return cruddtolist;
	}


}

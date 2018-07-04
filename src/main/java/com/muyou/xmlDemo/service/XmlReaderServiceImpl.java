package com.muyou.xmlDemo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.muyou.xmlDemo.entity.Tower;
import com.muyou.xmlDemo.repository.TowerRepository;

@Service
public class XmlReaderServiceImpl implements XmlReaderService {

	@Resource
	private TowerRepository repository;

	@Override
	public void save(List<Tower> xDemos) {
		repository.saveAll(xDemos);
	}
	
	
}

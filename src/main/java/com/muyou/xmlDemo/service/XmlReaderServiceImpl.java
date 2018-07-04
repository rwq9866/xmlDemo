package com.muyou.xmlDemo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.muyou.xmlDemo.entity.Line;
import com.muyou.xmlDemo.entity.Tower;
import com.muyou.xmlDemo.repository.LineRepository;
import com.muyou.xmlDemo.repository.TowerRepository;

@Service
public class XmlReaderServiceImpl implements XmlReaderService {

	@Resource
	private TowerRepository trepository;
	@Resource
	private LineRepository lrepository;

	@Override
	public void save(List<Tower> xDemos) {
		trepository.saveAll(xDemos);
	}

	@Override
	public void saveLine(Line line) {
		lrepository.save(line);
	}

	@Override
	public Line findByName(String lineName) {
		return lrepository.findByName(lineName);
	}

	
	
}

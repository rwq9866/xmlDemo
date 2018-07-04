package com.muyou.xmlDemo.service;

import java.util.List;

import com.muyou.xmlDemo.entity.Line;
import com.muyou.xmlDemo.entity.Tower;

public interface XmlReaderService {

	void save(List<Tower> xDemos);

	void saveLine(Line line);

	Line findByName(String lineName);


}

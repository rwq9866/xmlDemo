package com.muyou.xmlDemo.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muyou.xmlDemo.entity.Tower;
import com.muyou.xmlDemo.service.XmlReaderService;

@RestController
public class XmlReaderController {

	@Resource
	private XmlReaderService readerService;
	
	@RequestMapping("xmlr")
	public void xmlReader() {
		String url = "aaaa.xml";
		try {
			List<Element> list = new SAXReader().read(new File(url)).getRootElement().element("Document").element("Folder").elements("Placemark");
			List<Tower> xDemos = new ArrayList<>();
			int num = 1;
			for(Element e : list) {
				String name = e.elementText("name");
				String remark = e.elementText("description");
				String icon = e.element("Style").element("IconStyle").element("Icon").elementText("href");
				String isbegin = e.element("Style").element("IconStyle").elementText("scale");
				String tagstyle = e.element("Style").element("LabelStyle").elementText("scale");
				String coordinates = e.element("Point").elementText("coordinates");
				Double longitude = Double.parseDouble(coordinates.substring(0, coordinates.indexOf(",")));
				Double latitude = Double.parseDouble(coordinates.substring(coordinates.indexOf(",") + 1,coordinates.lastIndexOf(",")));
				Integer torder = num;
				num++;
				Tower tower = new Tower(name,torder,longitude,latitude,isbegin,tagstyle,remark,icon);
				xDemos.add(tower);
				System.out.println(tower);
			}
			readerService.save(xDemos);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
	}
}

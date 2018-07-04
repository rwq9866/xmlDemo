package com.muyou.xmlDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muyou.xmlDemo.entity.Line;

public interface LineRepository extends JpaRepository<Line, String> {

	Line findByName(String lineName);

}

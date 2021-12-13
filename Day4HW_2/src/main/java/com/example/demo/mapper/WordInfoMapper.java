package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.WordInfo;

@Mapper
public interface WordInfoMapper{
	List<WordInfo> selectAll();
}


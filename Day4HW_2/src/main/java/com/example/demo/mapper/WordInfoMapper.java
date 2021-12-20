package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.WordInfo;
import com.example.demo.form.SearchForm;

@Mapper
public interface WordInfoMapper{
	//List<WordInfo> selectAll();
	List<WordInfo> findBySearchForm(SearchForm searchForm);
}


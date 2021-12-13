package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.WordInfo;
import com.example.demo.mapper.WordInfoMapper;

@Controller
public class IndexController{
	
	@Autowired
	WordInfoMapper wordInfoMapper;
	
	@RequestMapping("/index")
	public String index(Model model) {
		List<WordInfo> list=wordInfoMapper.selectAll();
		model.addAttribute("wordInfo",list);
		return "index";
	}
}

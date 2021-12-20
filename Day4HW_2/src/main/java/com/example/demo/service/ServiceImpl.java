package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.WordInfo;
import com.example.demo.form.Form;
import com.example.demo.form.SearchForm;
import com.example.demo.mapper.WordInfoMapper;

@Service
public class ServiceImpl implements Service{
	
	//わからん言葉テーブルにアクセスするマッパー
	@Autowired
	private WordInfoMapper mapper;
	
	@Override
	public List<Form> formList(SearchForm searchForm){
		List<Form> formList = new ArrayList<>();
		//検索条件に合うデータを取得する
		List<WordInfo> wordInfoList = mapper.findBySearchForm(searchForm);
		for (WordInfo wordInfo : wordInfoList) {
			formList.add(getForm(wordInfo));
		}
		return formList;
	}
	
	//Formオブジェクトに引数のデータの各値を設定する
	private Form getForm(WordInfo wordnfo) {
		if(wordInfo==null) {
			return null;
		}
		Form form=new Form();
		form.setWord(wordInfo.getWord());
		form.setStatus(String.valueOf(wordInfo.getStatus()));
		form.setComment(wordInfo.getComment());
		return form;
	}
}
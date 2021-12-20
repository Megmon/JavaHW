package com.example.demo.service;

import java.util.List;

import com.example.demo.form.Form;
import com.example.demo.form.SearchForm;

public interface Service{
	//わからん言葉リストを取得
	List<Form> formList(SearchForm searchForm);
}
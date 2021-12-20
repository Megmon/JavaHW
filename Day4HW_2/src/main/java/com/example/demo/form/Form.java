package com.example.demo.form;

import lombok.Data;

//Formオブジェクトのクラス
@Data
public class Form{
	private String word;
	private int status;
	private String comment;
}
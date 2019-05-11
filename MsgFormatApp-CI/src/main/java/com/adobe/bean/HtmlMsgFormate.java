package com.adobe.bean;

public class HtmlMsgFormate implements IMsgFormatter {

	public HtmlMsgFormate() {

	System.out.println("Html msgFormate::Constructor");
	}

	public String formate(String s) {
		return "Html msg Format called";
	}

}

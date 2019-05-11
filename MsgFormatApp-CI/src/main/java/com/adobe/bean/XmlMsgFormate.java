package com.adobe.bean;

public class XmlMsgFormate implements IMsgFormatter {

	public XmlMsgFormate() {
		System.out.println("xml msg formate:: constructor");
	}

	public String formate(String s) {
		return "xml msg formate called";
	}

}

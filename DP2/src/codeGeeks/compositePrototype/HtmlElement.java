package codeGeeks.compositePrototype;

import java.util.ArrayList;

public class HtmlElement extends HtmlTag{

	private String tagName;
	private String startTag; 
	private String endTag;
	private String tagBody;
	
	public HtmlElement(String tagName){
		this.tagName = tagName;
		this.tagBody = "";
		this.startTag = "";
		this.endTag = "";
	}
	
	@Override
	public HtmlElement clone() {
		HtmlElement t = new HtmlElement(this.tagName);
		// t.tagName = this.tagName;
		t.startTag = this.startTag;
		t.endTag = this.endTag;
		t.tagBody = this.tagBody;
		return t;
	}
	
	@Override
	public String getTagName() {
		return tagName;
	}

	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
	}

	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}
	
	@Override
	public void setTagBody(String tagBody){
		this.tagBody = tagBody;
	}
	
	@Override
	public void generateHtml() {
		System.out.println(startTag+""+tagBody+""+endTag);
	}

}

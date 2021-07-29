package codeGeeks.compositePrototype;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {

	private String tagName;
	private String startTag; 
	private String endTag;
	private List<HtmlTag>childrenTag;
	
	@Override
	public HtmlParentElement clone() {
		HtmlParentElement t = new HtmlParentElement(this.tagName);
		// t.tagName = this.tagName;
		t.startTag = this.startTag;
		t.endTag = this.endTag;
		t.childrenTag = new ArrayList<>();
		for (int k=0; k < childrenTag.size(); k++)
			t.childrenTag.add((childrenTag.get(k)).clone());
		    //t.childrenTag.add((HtmlTag)(childrenTag.get(k)).clone());
		return t;
	}
	public HtmlParentElement(String tagName){
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.childrenTag = new ArrayList<>();
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
	public void addChildTag(HtmlTag htmlTag){
		childrenTag.add(htmlTag);
	}
	
	@Override
	public void removeChildTag(HtmlTag htmlTag){
		childrenTag.remove(htmlTag);
	}
	
	@Override
	public List<HtmlTag>getChildren(){
		return childrenTag;
	}

	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for(HtmlTag tag : childrenTag){
			tag.generateHtml();
		}
		System.out.println(endTag);
		
	}

}

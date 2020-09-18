package com.study.charts;
/*var legend = {
		layout : 'vertical',
		align : 'right',
		verticalAlign : 'middle',
		borderWidth : 0
	};*/
public class Legend {
	private String align;
	private Integer borderWidth;
	private String layout;
	private String verticalAlign;
	public Legend() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Legend(String layout, String align, String verticalAlign, Integer borderWidth) {
		super();
		this.layout = layout;
		this.align = align;
		this.verticalAlign = verticalAlign;
		this.borderWidth = borderWidth;
	}
	public String getAlign() {
		return align;
	}
	public Integer getBorderWidth() {
		return borderWidth;
	}
	public String getLayout() {
		return layout;
	}
	public String getVerticalAlign() {
		return verticalAlign;
	}
	public void setAlign(String align) {
		this.align = align;
	}
	public void setBorderWidth(Integer borderWidth) {
		this.borderWidth = borderWidth;
	}
	public void setLayout(String layout) {
		this.layout = layout;
	}
	public void setVerticalAlign(String verticalAlign) {
		this.verticalAlign = verticalAlign;
	}
}

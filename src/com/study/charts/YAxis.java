package com.study.charts;
/*var yAxis = {
		title : {
			text : 'Temperature (\xB0C)'
		},
		plotLines : [ {
			value : 0,
			width : 1,
			color : '#808080'
		} ]
	};*/
public class YAxis {
	public class PlotLine{
		private String color;
		private Integer value;
		private Integer width;
		public String getColor() {
			return color;
		}
		public Integer getValue() {
			return value;
		}
		public Integer getWidth() {
			return width;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public void setValue(Integer value) {
			this.value = value;
		}
		public void setWidth(Integer width) {
			this.width = width;
		}
	}
	public class Title{
		private String text;
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
	}
	private PlotLine[] plotLines;
	private Title title;
	public YAxis() {
		super();
		// TODO Auto-generated constructor stub
	}
	public YAxis(Title title, PlotLine[] plotLines) {
		super();
		this.title = title;
		this.plotLines = plotLines;
	}
	public PlotLine[] getPlotLines() {
		return plotLines;
	}
	public Title getTitle() {
		return title;
	}
	
	public void setPlotLines(PlotLine[] plotLines) {
		this.plotLines = plotLines;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
}

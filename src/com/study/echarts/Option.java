package com.study.echarts;

public class Option {
	private Title title;
	private Tooltip tooltip;
	private Legend legend;
	private XAxis xAxis;
	private YAxis yAxis;
	private Series [] series;
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public Tooltip getTooltip() {
		return tooltip;
	}
	public void setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
	}
	public Legend getLegend() {
		return legend;
	}
	public void setLegend(Legend legend) {
		this.legend = legend;
	}
	public XAxis getxAxis() {
		return xAxis;
	}
	public void setxAxis(XAxis xAxis) {
		this.xAxis = xAxis;
	}
	public YAxis getyAxis() {
		return yAxis;
	}
	public void setyAxis(YAxis yAxis) {
		this.yAxis = yAxis;
	}
	public Series[] getSeries() {
		return series;
	}
	public void setSeries(Series[] series) {
		this.series = series;
	}
	
}

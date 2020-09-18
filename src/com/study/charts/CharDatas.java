package com.study.charts;

public class CharDatas {
	private Title title;
	private SubTitle subtitle;
	private XAxis xAxis;
	private YAxis yAxis;
	private Tooltip tooltip;
	private Legend legend;
	private Serie[] series;
	public CharDatas() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CharDatas(Title title, SubTitle subtitle, XAxis xAxis, YAxis yAxis, Tooltip tooltip, Legend legend,
			Serie[] series) {
		super();
		this.title = title;
		this.subtitle = subtitle;
		this.xAxis = xAxis;
		this.yAxis = yAxis;
		this.tooltip = tooltip;
		this.legend = legend;
		this.series = series;
	}
	public Title getTitle() {
		return title;
	}
	public SubTitle getSubtitle() {
		return subtitle;
	}
	public XAxis getxAxis() {
		return xAxis;
	}
	public YAxis getyAxis() {
		return yAxis;
	}
	public Tooltip getTooltip() {
		return tooltip;
	}public Legend getLegend() {
		return legend;
	}
	public Serie[] getSeries() {
		return series;
	}
	public void setLegend(Legend legend) {
		this.legend = legend;
	}
	public void setSeries(Serie[] series) {
		this.series = series;
	}
	public void setSubtitle(SubTitle subtitle) {
		this.subtitle = subtitle;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public void setTooltip(Tooltip tooltip) {
		this.tooltip = tooltip;
	}
	public void setxAxis(XAxis xAxis) {
		this.xAxis = xAxis;
	}
	public void setyAxis(YAxis yAxis) {
		this.yAxis = yAxis;
	}
}

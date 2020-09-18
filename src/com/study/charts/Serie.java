package com.study.charts;
/*{
	name : 'Tokyo',
	data : [ 7.0, 6.9, 9.5, 14.5, 18.2,
			21.5, 25.2, 26.5, 23.3, 18.3,
			13.9, 9.6 ]
}*/
public class Serie {
	private Double[] data;
	private String name;
	public Serie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Serie(String name, Double[] data) {
		super();
		this.name = name;
		this.data = data;
	}
	public Double[] getData() {
		return data;
	}
	public String getName() {
		return name;
	}
	public void setData(Double[] data) {
		this.data = data;
	}
	public void setName(String name) {
		this.name = name;
	}
}

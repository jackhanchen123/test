package com.study.charts;
/*var xAxis = {
		categories : [ 'Jan', 'Feb', 'Mar', 'Apr',
				'May', 'Jun', 'Jul', 'Aug', 'Sep',
				'Oct', 'Nov', 'Dec' ]
	};*/
public class XAxis {
	private String[] categories;

	public XAxis() {
		super();
	}

	public XAxis(String[] categories) {
		super();
		this.categories = categories;
	}

	public String[] getCategories() {
		return categories;
	}

	public void setCategories(String[] categories) {
		this.categories = categories;
	}
}

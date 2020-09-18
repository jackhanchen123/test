package com.study.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.echarts.Legend;
import com.study.echarts.Option;
import com.study.echarts.Series;
import com.study.echarts.Title;
import com.study.echarts.Tooltip;
import com.study.echarts.XAxis;
import com.study.echarts.YAxis;

import net.sf.json.JSONObject;
@WebServlet("/loadjson")
public class EChartController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf8");
		req.setCharacterEncoding("utf8");
		PrintWriter out =resp.getWriter();
		
		Title title=new Title();
		title.setText("第一个ECharts实例");
		Tooltip tooltip=new Tooltip();
		Legend legend=new Legend();
		legend.setData(new String [] {"销量"});
		XAxis xAxis=new XAxis();
		xAxis.setData(new String [] {
			"衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"	
		});
		YAxis yAxis=new YAxis();
		
		Series series =new Series();		
		series.setName("销量");
		series.setType("bar");
		series.setData(new Integer[]{5,20,36,10,10,20});
		
		
		//组装
		Option option=new Option();
		option.setLegend(legend);
		option.setTitle(title);
		option.setTooltip(tooltip);
		option.setxAxis(xAxis);
		option.setyAxis(yAxis);
		option.setSeries(new Series[]{series});
		
		JSONObject jsonObject=JSONObject.fromObject(option);
		out.print(jsonObject.toString());
		out.flush();
		out.close();
	}
}

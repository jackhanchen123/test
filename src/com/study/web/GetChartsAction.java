package com.study.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.study.charts.CharDatas;
import com.study.charts.Legend;
import com.study.charts.Serie;
import com.study.charts.SubTitle;
import com.study.charts.Title;
import com.study.charts.Tooltip;
import com.study.charts.XAxis;
import com.study.charts.YAxis;

import net.sf.json.JSONObject;
@WebServlet("/getcharts")
public class GetChartsAction extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		PrintWriter out=resp.getWriter();
		CharDatas charDatas=new CharDatas();
		//创建子对象
		Title title=new Title("城市平均气温");
		
		SubTitle subtitle=new SubTitle("数据来源:runoob.com");
		
		XAxis xAxis=new XAxis();
		String[] categories=new String[]{"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十一月"};
		xAxis.setCategories(categories);
		
		YAxis yAxis=new YAxis();
		YAxis.Title yt=yAxis.new Title();
		yt.setText("摄氏度");
		yAxis.setTitle(yt);
		YAxis.PlotLine plotLine=yAxis.new PlotLine();
		plotLine.setColor("#808080");
		plotLine.setValue(0);
		plotLine.setWidth(1);
		YAxis.PlotLine[] plotLines=new YAxis.PlotLine[1];
		plotLines[0]=plotLine;
		yAxis.setPlotLines(plotLines);
		
		Tooltip tooltip=new Tooltip("°C");
		
		Legend legend=new Legend();
		legend.setAlign("right");
		legend.setBorderWidth(0);
		legend.setLayout("vertical");
		legend.setVerticalAlign("middle");
		
		Serie[] series=new Serie[2];
		Serie tokyoSerie=new Serie();
		tokyoSerie.setName("东京");
		tokyoSerie.setData(new Double[]{7.0, 6.9, 9.5, 14.5, 18.2,21.5, 25.2, 26.5, 23.3, 18.3,13.9, 9.6});
		Serie londonSerie=new Serie();
		londonSerie.setName("伦敦");
		londonSerie.setData(new Double[]{3.9, 4.2, 5.7, 8.5, 11.9,15.2, 17.0, 16.6, 14.2, 10.3,6.6, 4.8});
		series[0]=tokyoSerie;
		series[1]=londonSerie;
		
		//组装数据
		charDatas.setTitle(title);
		charDatas.setSubtitle(subtitle);
		charDatas.setxAxis(xAxis);
		charDatas.setyAxis(yAxis);
		charDatas.setTooltip(tooltip);
		charDatas.setLegend(legend);
		charDatas.setSeries(series);
		
		JSONObject jsonObject=JSONObject.fromObject(charDatas);
		out.print(jsonObject.toString());
		out.flush();
		out.close();
	}
}

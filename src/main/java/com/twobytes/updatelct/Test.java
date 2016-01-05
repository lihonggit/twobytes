package com.twobytes.updatelct;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) throws Exception {
		// 需要更新location的数据
		String sql = "select distinct b.REGION_CODE as code,a.AREA_NAME as area_a,b.AREA_NAME as area_b from system_area as a,system_area as b where a.REGION_CODE = b.PARENT_CODE and a.REGION_CODE is not null and a.REGION_CODE != '000000' limit 800,10000 "
				+ "UNION select s.REGION_CODE,\"\",s.AREA_NAME from system_area as s where s.REGION_CODE in ('710000','810000','820000')";

		List<Map<String, Object>> values = JdbcUtils.findModeResult(sql, null);
		for (Map<String, Object> map : values) {
			String id = map.get("code").toString();
			String area_a = map.get("area_a").toString();
			String area_b = map.get("area_b").toString();

			if ("市辖区".equals(area_a) || "县".equals(area_a)) {
				area_a = "";
			}
			if ("市辖区".equals(area_b) || "县".equals(area_b)) {
				area_b = "";
			}

			String serarchArea = area_a + area_b;

			String jsonString = "";
			jsonString = HttpUtils.do_get("http://api.map.baidu.com/geocoder/v2/?address=" + serarchArea + ("".equals(area_a) ? "" : "&city=" + area_a)
					+ "&output=json&ak=7d9d3ffc88ad8cf08a80f50a66a4625b");

			BeanLocation bean = JsonUtils.getObject(jsonString, BeanLocation.class);
			// 效果：北京市朝阳区 35.25668854874,135.23666555547
			System.out.println(serarchArea + "\t\t" + bean.getResult().getLocation().getLng() + "," + bean.getResult().getLocation().getLat() + "\t\t"
					+ bean.getResult().getConfidence() + "\t\t" + bean.getResult().getPrecise() + "\t\t" + URLDecoder.decode(bean.getResult().getLevel(), "utf-8"));
		}
	}
}

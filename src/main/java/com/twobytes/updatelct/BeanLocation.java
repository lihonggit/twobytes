package com.twobytes.updatelct;

/**
 * 坐标信息的json vo
 * API文档：http://developer.baidu.com/map/index.php?title=webapi/guide
 * /webservice-geocoding
 * 
 * @author 成都易科远见有限公司
 * 
 */
public class BeanLocation {
	private Integer status;// 返回结果状态值， 成功返回0，其他值请查看下方返回码状态表。
	private Result result;

	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	class Location {
		private Float lat;
		private Float lng;

		public Float getLat() {
			return lat;
		}

		public void setLat(Float lat) {
			this.lat = lat;
		}

		public Float getLng() {
			return lng;
		}

		public void setLng(Float lng) {
			this.lng = lng;
		}

	}
	class Result{
		private Location location;// 经纬度坐标:包含Float lat纬度值,和Float lng经度值;
		private Integer precise;// 位置的附加信息，是否精确查找。1为精确查找，即准确打点；0为不精确，即模糊打点。
		private Integer confidence;// 可信度，描述打点准确度
		private String level;// 地址类型
		public Location getLocation() {
			return location;
		}
		public void setLocation(Location location) {
			this.location = location;
		}
		public Integer getPrecise() {
			return precise;
		}
		public void setPrecise(Integer precise) {
			this.precise = precise;
		}
		public Integer getConfidence() {
			return confidence;
		}
		public void setConfidence(Integer confidence) {
			this.confidence = confidence;
		}
		public String getLevel() {
			return level;
		}
		public void setLevel(String level) {
			this.level = level;
		}
		
	}
}

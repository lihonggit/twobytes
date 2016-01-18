package basic.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 时间帮助类
 * 
 */
public class TimeUtils {
	public static final String PATTERN_DAY = "yyyy-MM-dd";
	public static final String PATTERN_DEFAULT = "yyyy-MM-dd HH:mm:ss";

	/**
	 * 当前系统时间，格式为yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String getCurrentTime() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(PATTERN_DEFAULT);
		return simpleDateFormat.format(System.currentTimeMillis());
	}
	
	/**
	 * 获取传入时间和系统时间的天数差
	 * @param calcTime 传入时间
	 * @return 相差天数，当结果为负时，表示系统时间较小
	 * @throws ParseException
	 */
	public static int getDaysBetweenSys(String calcTime) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date bDate = format.parse(calcTime);
		// 传入时间
		Calendar d1 = new GregorianCalendar();
		d1.setTime(bDate);
		// 系统时间
		Calendar d2 = new GregorianCalendar();

		// 是否取负数
		boolean isNegate = false;
		// 把大点的时间排在后面，不然用下面的算法会出错
		if (d1.after(d2)) {
			isNegate = true;
			Calendar temp = (Calendar) d1.clone();
			d1 = d2;
			d2 = temp;
		}

		int days = d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);
		int y2 = d2.get(Calendar.YEAR);
		if (d1.get(Calendar.YEAR) != y2) {
			d1 = (Calendar) d1.clone();
			do {
				days += d1.getActualMaximum(Calendar.DAY_OF_YEAR);// 得到当年的实际天数
				d1.add(Calendar.YEAR, 1);
			} while (d1.get(Calendar.YEAR) != y2);
		}

		return isNegate ? -1 * days : days;
	}

	/**
	 * 获取两个时间的天数差
	 * 
	 * @return 相差天数，当结果为负时，表示结束时间较小
	 */
	public static int getDaysBetween(String beginDate, String endDate) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date bDate = format.parse(beginDate);
		Date eDate = format.parse(endDate);
		Calendar d1 = new GregorianCalendar();
		d1.setTime(bDate);
		Calendar d2 = new GregorianCalendar();
		d2.setTime(eDate);

		// 是否取负数
		boolean isNegate = false;
		// 把大点的时间排在后面，不然用下面的算法会出错
		if (d1.after(d2)) {
			isNegate = true;
			Calendar temp = (Calendar) d1.clone();
			d1 = d2;
			d2 = temp;
		}

		int days = d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);
		int y2 = d2.get(Calendar.YEAR);
		if (d1.get(Calendar.YEAR) != y2) {
			d1 = (Calendar) d1.clone();
			do {
				days += d1.getActualMaximum(Calendar.DAY_OF_YEAR);// 得到当年的实际天数
				d1.add(Calendar.YEAR, 1);
			} while (d1.get(Calendar.YEAR) != y2);
		}

		return isNegate ? -1 * days : days;
	}

}

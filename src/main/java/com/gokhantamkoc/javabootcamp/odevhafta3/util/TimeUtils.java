package com.gokhantamkoc.javabootcamp.odevhafta3.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class TimeUtils {
	private final static SimpleDateFormat UTC_DATE = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	public static long convertToMillisTime(String time) {
		long timeMillis = 0;
		long hours = Long.parseLong(time.substring(0, 2));
		long minutes = Long.parseLong(time.substring(3, 5));
		long seconds = Long.parseLong(time.substring(6, 8));
		long millis = 0;
		if (time.length() == 12) {
			millis = Long.parseLong(time.substring(9, 12));
		}
		timeMillis = (hours * 60 + minutes) * 60 * 1000 + seconds * 1000 + millis;
		return timeMillis;
	}

	@SuppressWarnings("deprecation")
	public static Date convertToDate(long millis) {
		
		Date date=new Date(millis);		// Gelen Milisaniyeyi tarihe çevirdik..

		// Bu metodu doldurmanizi bekliyoruz.

		return date;

	
	}
}

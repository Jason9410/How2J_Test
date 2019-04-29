package Util_Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SS");
		System.out.println("当前时间(年月日)："+d);
		System.out.println("当前时间(毫秒)：" + d.getTime());//等同于System.currentTimeMillis()
		System.out.println("当前时间(格式化)：" + df.format(d));
		
		Calendar c = Calendar.getInstance();
		System.out.println("当前日历："+df.format(c.getTime()));
		c.add(Calendar.YEAR, -1);//c.set(Calendar.YEAR, 2018) 或者 c.set(2018, 0, 11);
		c.set(Calendar.MONTH, 5);
		c.set(Calendar.DAY_OF_MONTH, 11);
		System.out.println("去年六月十一号："+df.format(c.getTime()));
		
		c.setTime(new Date());
		c.add(Calendar.MONTH, 2);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.DAY_OF_MONTH, -3);
		System.out.println("当前日历："+df.format(c.getTime()));
	}

}

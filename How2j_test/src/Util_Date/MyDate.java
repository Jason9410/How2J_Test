package Util_Date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SS");
		System.out.println("��ǰʱ��(������)��"+d);
		System.out.println("��ǰʱ��(����)��" + d.getTime());//��ͬ��System.currentTimeMillis()
		System.out.println("��ǰʱ��(��ʽ��)��" + df.format(d));
		
		Calendar c = Calendar.getInstance();
		System.out.println("��ǰ������"+df.format(c.getTime()));
		c.add(Calendar.YEAR, -1);//c.set(Calendar.YEAR, 2018) ���� c.set(2018, 0, 11);
		c.set(Calendar.MONTH, 5);
		c.set(Calendar.DAY_OF_MONTH, 11);
		System.out.println("ȥ������ʮһ�ţ�"+df.format(c.getTime()));
		
		c.setTime(new Date());
		c.add(Calendar.MONTH, 2);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.DAY_OF_MONTH, -3);
		System.out.println("��ǰ������"+df.format(c.getTime()));
	}

}

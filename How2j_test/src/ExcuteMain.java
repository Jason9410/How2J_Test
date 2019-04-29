import java.util.Arrays;
import java.util.Date;

import javax.xml.crypto.Data;

import LOL_hero.*;
import SingletonMode.*;
public class ExcuteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hero.copyright = "版权归拳头公司所有！！！\r\n";
		System.out.print(Hero.copyright);
		Hero Timo = new Hero("Timo",98,52,"提莫带前冲锋！！！");
		System.out.print(Timo.lanuge+"\r\n");
		
		Hero.copyright = "版权归拳头公司所有\r\n";
		System.out.print(Hero.copyright);
		EZ ez = new EZ();
		ez.physicAttack();
		ez.attack();
		
		GiantDragon Dragon = GiantDragon.getInstance1();
		Dragon.printInfomation();
		String str = "let there be light";
		String str1 = "";
		String[] s = str.split(" ");
		for(int i = 0;i<s.length;i++){
			s[i] = s[i].replace(s[i].charAt(0), Character.toUpperCase(s[i].charAt(0)));
			str1 = str1 + s[i] + " ";
		}
		System.out.println(str1);
        
        String str2 = new String(str1);
        String str3 = "let there be light";
         
        //==用于判断是否是同一个字符串对象
        System.out.println( str  ==  str2);
        System.out.println( str  ==  str3);
        System.out.println((char)(Math.random() * 'z'));
        
        StringBuffer sb = new StringBuffer();
        String str4 = "";
        long start = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
        	str4 = str4+"1234";
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
        start = System.currentTimeMillis();
        for(int i=0;i<1000000;i++){
        	sb.append("1234");
        }
        end = System.currentTimeMillis();
        System.out.println(end-start);
        	
        char[] c = new char[]{'1','2','3'};
        String s1 = "123";
        System.out.println("" + c.length + s1.length() + s1.toCharArray().length);
	}
}

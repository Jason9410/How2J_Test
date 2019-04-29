package CollectionsTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class HashMap_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();//key唯一，value不唯一,null可作key和value，线程不安全
		Hashtable<String, String> ht = new Hashtable<String, String>();//null不可作key、value，线程安全
		System.out.println("HashMap是否存在Num1键："+hm.containsKey("Num1"));
		hm.put("Num1", "Hero1");
		hm.put("Num1", "Hero");//覆盖原值
		hm.put("Num2", "Hero2");
		hm.put("Num3", "Hero3");
		System.out.println("HashMap是否存在Num1键："+hm.containsKey("Num1"));
		System.out.println("HashMap："+hm);
		
		HashSet<String> hs = new HashSet<String>();//元素唯一，无顺序
		hs.add("Hero1");
		hs.add("Hero1");
		System.out.println("HashSet两次添加同一元素后，长度："+hs.size());
		hs.add("Hero2");
		hs.add("Hero3");
		hs.add("Hero4");
		System.out.println("HashSet："+hs);
		System.out.print("迭代HashSet：");
		for(Iterator<String> it = hs.iterator();it.hasNext();)
			System.out.print(it.next()+" ");
		
		String[] strs = new String[]{"as","ds","vx","qw","va","ds","yr","va","ge","qw"};
		HashSet<String> hs2 = new HashSet<String>();
		HashSet<String> hs3 = new HashSet<String>();
		for(String s:strs){
			if(!hs2.add(s))
				hs3.add(s);
		}
		System.out.printf("\r\n重复的字符串有%d个，分别是：",hs3.size());
		for(String s:hs3)
			System.out.print(s+" ");
	}

}

package CollectionsTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;

public class HashMap_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> hm = new HashMap<String, String>();//keyΨһ��value��Ψһ,null����key��value���̲߳���ȫ
		Hashtable<String, String> ht = new Hashtable<String, String>();//null������key��value���̰߳�ȫ
		System.out.println("HashMap�Ƿ����Num1����"+hm.containsKey("Num1"));
		hm.put("Num1", "Hero1");
		hm.put("Num1", "Hero");//����ԭֵ
		hm.put("Num2", "Hero2");
		hm.put("Num3", "Hero3");
		System.out.println("HashMap�Ƿ����Num1����"+hm.containsKey("Num1"));
		System.out.println("HashMap��"+hm);
		
		HashSet<String> hs = new HashSet<String>();//Ԫ��Ψһ����˳��
		hs.add("Hero1");
		hs.add("Hero1");
		System.out.println("HashSet�������ͬһԪ�غ󣬳��ȣ�"+hs.size());
		hs.add("Hero2");
		hs.add("Hero3");
		hs.add("Hero4");
		System.out.println("HashSet��"+hs);
		System.out.print("����HashSet��");
		for(Iterator<String> it = hs.iterator();it.hasNext();)
			System.out.print(it.next()+" ");
		
		String[] strs = new String[]{"as","ds","vx","qw","va","ds","yr","va","ge","qw"};
		HashSet<String> hs2 = new HashSet<String>();
		HashSet<String> hs3 = new HashSet<String>();
		for(String s:strs){
			if(!hs2.add(s))
				hs3.add(s);
		}
		System.out.printf("\r\n�ظ����ַ�����%d�����ֱ��ǣ�",hs3.size());
		for(String s:hs3)
			System.out.print(s+" ");
	}

}

package CollectionsTest;

import java.util.ArrayList;
import java.util.Iterator;

import LOL_hero.Hero;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Hero> l = new ArrayList<Hero>();
		for (int i = 0; i < 10; i++) {
			l.add(new Hero("Hero"+i));
		}
		System.out.println("ArrayListԪ�ظ�����"+l.size());
		System.out.println("���ϣ�"+l);//�Զ�����Hero��toString����
		
		//����������ArrayList
		System.out.print("����������ArrayList���÷���:");
		Iterator<Hero> it = l.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
		System.out.print("\r\n����������ArrayListͨ��For��ʽ:");
		for(Iterator<Hero> it2 = l.iterator();it2.hasNext();)
			System.out.print(it2.next()+",");
		System.out.println();
		
		Hero special = new Hero("SpecialHero");
		l.add(4, special);
		System.out.println("������������SpecialHero��"+l.toString());
		System.out.println("�����Ƿ�����½�����Hero1��"+l.contains(new Hero("Hero1")));
		System.out.println("�����Ƿ����ԭ����SpecialHero��"+l.contains(special));
		System.out.println("����SpecialHero�ڼ�����λ�ã�"+l.indexOf(special));
		System.out.println("�����±�Ϊ3��Ԫ��Ϊ��"+l.get(3));
		l.remove(0);
		System.out.println("�Ƴ������±�Ϊ0��Ԫ�أ�"+l.toString());
		l.set(3, new Hero("Special"));
		System.out.println("�������±�3Ԫ���滻��"+l.toString());
		Hero Heros[] = (Hero[])l.toArray(new Hero[]{});//toArray()ֻ��ת��ΪObject���飬����ʹ��toArray(new Type[])�ſ�תָ����������
		System.out.println("����Heros��"+Heros[0].name);
		l.clear();
		System.out.println("��ռ��ϣ�"+l.toString());
		
	}

}

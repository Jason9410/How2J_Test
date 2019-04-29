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
		System.out.println("ArrayList元素个数："+l.size());
		System.out.println("集合："+l);//自动调用Hero类toString方法
		
		//迭代器遍历ArrayList
		System.out.print("迭代器遍历ArrayList常用方法:");
		Iterator<Hero> it = l.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+",");
		}
		System.out.print("\r\n迭代器遍历ArrayList通过For方式:");
		for(Iterator<Hero> it2 = l.iterator();it2.hasNext();)
			System.out.print(it2.next()+",");
		System.out.println();
		
		Hero special = new Hero("SpecialHero");
		l.add(4, special);
		System.out.println("集合新增对象SpecialHero："+l.toString());
		System.out.println("集合是否包含新建对象Hero1："+l.contains(new Hero("Hero1")));
		System.out.println("集合是否包含原对象SpecialHero："+l.contains(special));
		System.out.println("对象SpecialHero在集合中位置："+l.indexOf(special));
		System.out.println("集合下标为3的元素为："+l.get(3));
		l.remove(0);
		System.out.println("移除集合下标为0的元素："+l.toString());
		l.set(3, new Hero("Special"));
		System.out.println("将集合下标3元素替换："+l.toString());
		Hero Heros[] = (Hero[])l.toArray(new Hero[]{});//toArray()只能转换为Object数组，必须使用toArray(new Type[])才可转指定类型数组
		System.out.println("数组Heros："+Heros[0].name);
		l.clear();
		System.out.println("清空集合："+l.toString());
		
	}

}

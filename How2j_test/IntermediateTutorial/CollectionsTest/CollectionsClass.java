package CollectionsTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			l.add(i);
		}

		System.out.println("List元素："+l);
		Collections.reverse(l);
		System.out.println("List元素反转："+l);
		Collections.sort(l);
		System.out.println("List元素排序："+l);
		Collections.shuffle(l);
		System.out.println("List元素混淆：	     "+l);
		Collections.swap(l, 3, 6);
		System.out.println("List元素下标3和6互换："+l);
		Collections.rotate(l, 3);
		System.out.println("List元素向右平移三个："+l);
	}

}

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

		System.out.println("ListԪ�أ�"+l);
		Collections.reverse(l);
		System.out.println("ListԪ�ط�ת��"+l);
		Collections.sort(l);
		System.out.println("ListԪ������"+l);
		Collections.shuffle(l);
		System.out.println("ListԪ�ػ�����	     "+l);
		Collections.swap(l, 3, 6);
		System.out.println("ListԪ���±�3��6������"+l);
		Collections.rotate(l, 3);
		System.out.println("ListԪ������ƽ��������"+l);
	}

}

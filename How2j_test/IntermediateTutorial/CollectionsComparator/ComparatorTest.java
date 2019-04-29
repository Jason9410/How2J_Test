package CollectionsComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Hero> l = new ArrayList<Hero>();
		for (int i = 0; i < 50; i++) {
			l.add(new Hero("Hero"+i, new Random().nextInt(100), new Random().nextInt(100)));
		}
		
		Comparator<Hero> c = new Comparator<Hero>() {
			@Override
			public int compare(Hero o1, Hero o2) {
				// TODO Auto-generated method stub
				if(o1.Hp >= o2.Hp)
					return 1;
				return -1;
			}
		};
		
		Collections.sort(l, c);
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println(l);
	}

}

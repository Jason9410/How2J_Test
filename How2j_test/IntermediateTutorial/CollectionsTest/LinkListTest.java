package CollectionsTest;

import java.util.LinkedList;

import LOL_hero.Hero;

public class LinkListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Hero> ll = new LinkedList<Hero>();
		ll.offer(new Hero("first"));
		ll.offer(new Hero("first2"));
		ll.offer(new Hero("first"));
		System.out.println(ll);
	}

}

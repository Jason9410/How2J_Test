package CollectionsTest;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hash_LinkedHash_Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> numberSet1 =new HashSet<Integer>();
        //HashSet�е����ݲ��ǰ��ղ���˳����
        numberSet1.add(88);
        numberSet1.add(8);
        numberSet1.add(888);
        System.out.println("HashSetԪ��:"+numberSet1);
          
        LinkedHashSet<Integer> numberSet2 =new LinkedHashSet<Integer>();
        //LinkedHashSet�е������ǰ��ղ���˳����
        numberSet2.add(88);
        numberSet2.add(8);
        numberSet2.add(888);
        System.out.println("LinkedHashSetԪ��:"+numberSet2);
        
        TreeSet<Integer> numberSet3 =new TreeSet<Integer>();
        //TreeSet �е������ǽ����������
        numberSet3.add(88);
        numberSet3.add(8);
        numberSet3.add(888);
        System.out.println("TreeSetԪ��:"+numberSet3);
	}

}

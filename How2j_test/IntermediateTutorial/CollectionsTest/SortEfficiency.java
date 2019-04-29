package CollectionsTest;

import java.util.ArrayList;

public class SortEfficiency {
	class Node{
		public Integer value;
		public Node leftNode;
		public Node rightNode;
		
		public void creatBinaryTree(int v){
			if(value == null)
				value = v;
			else{
				if(value <= v){
					if(leftNode == null)
						leftNode = new Node();
					leftNode.creatBinaryTree(v);
				}
				else{
					if(rightNode == null)
						rightNode = new Node();
					rightNode.creatBinaryTree(v);
				}
			}
		}
		public ArrayList<Integer> printTree(){
			ArrayList<Integer> al = new ArrayList<>();
			
			if(rightNode != null)
				al.addAll(rightNode.printTree());
			al.add(value);
			if(leftNode != null)
				al.addAll(leftNode.printTree());
			return al;
		}
	}
	
	public int[] SelectSort(int[] arrayIn){
		int a;
		int[] array = arrayIn.clone();
		for(int i = 0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>=array[j]){
					a = array[i];
					array[i] = array[j];
					array[j] = a;
				}
			}
		}
		return array;
	}
	public int[] BubbleSort(int[] arrayIn){
		int a;
		int[] array = arrayIn.clone();
		int index=array.length-1;
		while(index>0){
			for(int j=0;j<index;j++){
				if(array[j] > array[j+1]){
					a = array[j];
					array[j] = array[j+1];
					array[j+1] = a;
				}
			}
			index--;
		}
		return array;
	}
	public ArrayList<Integer> binaryTreeSort(int[] arrayIn){
		Node n = new Node();
		for(int v:arrayIn)
			n.creatBinaryTree(v);
		return n.printTree();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortEfficiency s = new SortEfficiency();
		SortEfficiency.Node n = s.new Node();
		int[] a = new int[40000];
		for(int i=0;i<a.length;i++){
			a[i] = (int)(Math.random()*10000);
		}
		long time1 = System.currentTimeMillis();
		int[] b = s.BubbleSort(a);
		long time2 = System.currentTimeMillis();
		System.out.printf("冒泡排序花费%d：",time2-time1);
		for(int x:b)
			System.out.print(x+",");
		
		time1 = System.currentTimeMillis();
		b = s.SelectSort(a);
		time2 = System.currentTimeMillis();
		System.out.printf("\r\n选择排序花费%d：",time2-time1);
		for(int x:b)
			System.out.print(x+",");
		
		time1 = System.currentTimeMillis();
		ArrayList<Integer> array = s.binaryTreeSort(a);
		time2 = System.currentTimeMillis();
		System.out.printf("\r\n二叉树排序花费%d：",time2-time1);
		for(int x:array)
			System.out.print(x+",");
	}

}

package ArraySort;

import java.util.Arrays;

public class ArraySortMain {
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
	public int[] sort(int[] arrayIn){
		if(!arrayIn.equals(null)){
			int[] array = arrayIn.clone();
			Arrays.sort(array);
			return array;
		}
		return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[]{12,6,84,25,34,84,13,79,61};
		int[] array2 = new int[]{13,6,84,25,34,84,12,79,61};
		ArraySortMain s = new ArraySortMain();
		System.out.println(Arrays.toString(s.BubbleSort(array)));
		System.out.println(Arrays.toString(s.SelectSort(array)));
		System.out.println(Arrays.toString(Arrays.copyOfRange(array, 0, 3)));
		System.out.println(Arrays.toString(Arrays.copyOf(array, 3)));
		System.out.println("数字 84出现的位置:"+Arrays.binarySearch(s.sort(array), 84));
		System.out.println(Arrays.equals(array, array2));
	}

}

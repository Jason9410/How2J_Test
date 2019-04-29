package CollectionsTest;

import java.util.LinkedList;

public class CreateHashMap<K,V> {
	class Node <K,V>{
		K key;
		V value;
		Node next;
		
		public Node(K key,V value){
			this.key = key;
			this.value = value;
		}
	}
	
	private LinkedList[] code;
	
	public CreateHashMap(){
		 code = new LinkedList[2000];
	}
	public int hashcode(K s) {
        int num=0;
		if(s instanceof String){
			String str = (String)s;
			if(str.length()>0)
			{char c[]=str.toCharArray();
			for(char ch:c) {
				num=num+ch;
			}num=num*23;}
        }
		if(s instanceof Integer){
			num = (Integer)s;
        }
        return num>1999?num%2000:num;
    }
	public V put(K key,V value){
		int hashValue = hashcode(key);
		LinkedList<Node> ll;
		if(code[hashValue] == null){
			ll = new LinkedList<>();
			ll.add(new Node(key,value));
		}else{
			ll = (LinkedList<Node>)code[hashValue];
			for(Node n:ll){
				if(n.key.equals(key)){
					V str = (V) n.value;
					n.value = value;
					return str;
				}
			}
			ll.add(new Node(key,value));
		}
		code[hashValue] = ll;
		return null;
	}
	public V get(K key){
		int hashValue = hashcode(key);
		if(code[hashValue] != null){
			LinkedList<Node> ll = (LinkedList<Node>)code[hashValue];
			for(Node n:ll){
				if(n.key.equals(key)){
					return (V) n.value;
				}
			}
		}
		return null;
	}
	public String toString(){
		String str = "[";
		for(int i=0;i<code.length;i++){
			if(code[i] != null){
				LinkedList<Node> ll = (LinkedList<Node>)code[i];
				for(Node n:ll){
					str = str + n.key + "=" + n.value + " ";
				}
			}
		}
		return str + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateHashMap<String, String> h = new CreateHashMap<String, String>();
		System.out.println(h.put("hw", "12"));
		System.out.println(h.put("hw", "34"));
		System.out.println(h.put("ad", "54"));
		System.out.println(h.get("hw"));
		System.out.println(h);
		
		CreateHashMap<Integer, String> h2 = new CreateHashMap<Integer, String>();
		System.out.println(h2.put(2, "12"));
		System.out.println(h2.put(2, "34"));
		System.out.println(h2.get(2));
	}

}

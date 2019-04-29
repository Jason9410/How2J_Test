package Equals_dengyu;

public class Equals_dengyu {
	public int a;
	public boolean equals(Object o){
		if(o instanceof Equals_dengyu){
			Equals_dengyu h = (Equals_dengyu)o;
			return h.a == this.a;
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equals_dengyu e = new Equals_dengyu();
		e.a = 1;
		Equals_dengyu e1 = new Equals_dengyu();
		e1.a = 2;
		Equals_dengyu e2 = new Equals_dengyu();
		e2.a = 1;
		System.out.print(e == e1);
		System.out.print(e == e2);

		System.out.print(e.equals(e1));
		System.out.print(e.equals(e2));
	}

}

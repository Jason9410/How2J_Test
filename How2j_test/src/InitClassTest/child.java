package InitClassTest;

public class child extends father{
	public child(){
		super("father");
		System.out.print("child\r\n");
	}
	{
		System.out.print("child not static\r\n");
	}
	static{
		System.out.print("child static\r\n");
	}
	public static void battleWin(){
		System.out.print("×ÓÀà±»Òþ²Ø");
	}
	public static void main(String[] args){
		father c = new child();
		father f = new father("123");
		System.out.print(c.name+"c\r\n");
		System.out.print(f.name+"f\r\n");
		c.name = "child";
		System.out.print(c.name+"1\r\n");
		System.out.print(f.name+"1\r\n");
		c.battleWin();
		System.out.print(c.toString());
	}
}

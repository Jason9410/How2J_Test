package InitClassTest;

public class father {
	public String name;
	public father(String name){
		this.name = name;
		System.out.print("father\r\n");
	}
	{
		System.out.print("father not static\r\n");
	}
	static{
		System.out.print("father static\r\n");
	}
	public static void battleWin(){
		System.out.print("¸¸ÀàÎ´Òş²Ø\r\n");
	}
}

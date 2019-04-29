package SingletonMode;

public class GiantDragon {
	private static String name;
	private static float HP;
	private static float MP;
	private GiantDragon(){
		this.name = "GiantDragon";
		this.HP = 100000;
		this.MP = 0;
	}
	
	private static GiantDragon instance1 = new GiantDragon();//饿汉式，在启动时，会占用时间
	private static GiantDragon instance2;//懒汉式，调用时，会占用时间（即运行中）
	
	public static GiantDragon getInstance1(){
		return instance1;
	}
	
	public static GiantDragon getInstance2(){
		if(instance2 == null)
			instance2 = new GiantDragon();
		return instance2;
	}
	
	public void printInfomation(){
		System.out.print("名字："+this.name+"，属性（HP："+this.HP+"，MP："+this.MP+")\r\n");
	}
}

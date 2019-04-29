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
	
	private static GiantDragon instance1 = new GiantDragon();//����ʽ��������ʱ����ռ��ʱ��
	private static GiantDragon instance2;//����ʽ������ʱ����ռ��ʱ�䣨�������У�
	
	public static GiantDragon getInstance1(){
		return instance1;
	}
	
	public static GiantDragon getInstance2(){
		if(instance2 == null)
			instance2 = new GiantDragon();
		return instance2;
	}
	
	public void printInfomation(){
		System.out.print("���֣�"+this.name+"�����ԣ�HP��"+this.HP+"��MP��"+this.MP+")\r\n");
	}
}

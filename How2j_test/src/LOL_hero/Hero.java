package LOL_hero;

public class Hero {
	public String name;
	public float HP;
	public float MP;
	public String lanuge;
	public static String copyright;
	public static float gameTime;
	
	public Hero(String name){
		this.name = name;
	}
	public Hero(String name,float HP,float MP,String lanuge){
		this.name = name;
		this.HP = HP;
		this.MP = MP;
		this.lanuge = lanuge;
	}
	public String toString(){
		return this.name;
	}
	
	public static void printGameTime(){
		System.out.print("”Œœ∑ ±≥§£∫"+gameTime+"\r\n");
	}
}

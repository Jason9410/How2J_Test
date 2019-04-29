package LOL_hero;

public class EZ extends Hero implements AD{
	public EZ(){
		super("EZ",100,100,"像我这么帅的人，已经很少了！！！");
	}
	public void physicAttack(){
		System.out.print("当前战斗信息（名字："+this.name+"，血量："+this.HP+"，蓝量："+this.MP+"，口头语："+this.lanuge+"\r\n");
		System.out.print("EZ开始输出...\r\n");
	}
}

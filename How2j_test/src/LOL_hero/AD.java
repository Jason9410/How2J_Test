package LOL_hero;

public interface AD {
	public void physicAttack();
	default public void attack(){
		System.out.print("���й���...\r\n");
	}
}

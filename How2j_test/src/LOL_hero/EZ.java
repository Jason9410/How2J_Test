package LOL_hero;

public class EZ extends Hero implements AD{
	public EZ(){
		super("EZ",100,100,"������ô˧���ˣ��Ѿ������ˣ�����");
	}
	public void physicAttack(){
		System.out.print("��ǰս����Ϣ�����֣�"+this.name+"��Ѫ����"+this.HP+"��������"+this.MP+"����ͷ�"+this.lanuge+"\r\n");
		System.out.print("EZ��ʼ���...\r\n");
	}
}

package CollectionsComparator;

public class Hero implements Comparable<Hero> {
	public String name;
	public int Hp;
	public int Mp;
	
	public Hero(String name,int Hp,int Mp){
		this.name = name;
		this.Hp = Hp;
		this.Mp = Mp;
	}
	
	public String toString(){
		return "name="+this.name+" Hp="+this.Hp+" Mp="+this.Mp;
	}

	@Override
	public int compareTo(Hero o) {
		// TODO Auto-generated method stub
		if(this.Hp >= o.Hp)
			return 1;
		return -1;
	}
}

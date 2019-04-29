package StringBuffer;

public class CreateStringBuffer implements IStringBuffer {
	int capacity = 16;
	int increment = 16;
	int length;
	char[] value;
	
	public CreateStringBuffer(){
		this.value = new char[this.capacity];
	}
	
	public CreateStringBuffer(String str){
		if(str == null)
			return;
		while(this.capacity < str.length()){
			this.capacity += this.increment;
		}
		this.value = new char[this.capacity];
		this.value = str.toCharArray();
		this.length = str.length();
	}
	
	public void append(String str){
		insert(this.length, str);
	}
    public void append(char c){
    	insert(this.length, String.valueOf(c));
    }
    public void insert(int pos,char b){
    	insert(pos, String.valueOf(b));
    }
    public void insert(int pos,String b){
    	if(b == null)
    		return;
    	if(pos < 0 || pos > this.length)
    		return;
    	while(this.capacity < this.length + b.length()){
    		this.capacity += this.increment;
    	}
    	char[] newValue = new char[this.capacity];
    	System.arraycopy(this.value, 0, newValue, 0, this.length);
    	this.value = newValue;

    	System.arraycopy(this.value, pos, this.value, pos + b.length(), this.length - pos);
    	System.arraycopy(b.toCharArray(), 0, this.value, pos, b.length());
    	
    	this.length += b.length();
    }
    public void delete(int start){
    	delete(start, this.length - 1);
    }
    public void delete(int start,int end){
    	if(start > end || end >= this.length || start < 0)
    		return;
    	char[] newValue = new char[this.length - end + start -1];
    	System.arraycopy(this.value, 0, newValue, 0, start);
    	if(end < this.length)
    		System.arraycopy(this.value, end + 1, newValue, start, this.length - end - 1);
    	this.value = newValue;
    	this.length = this.length - end + start - 1;
    }
    public void reverse(){
    	char c;
    	for(int i=0;i<this.length/2;i++){
    		c = this.value[i];
    		this.value[i] = this.value[this.length - 1 - i];
    		this.value[this.length - 1 - i] = c;
    	}
    }
    public int length(){
    	return this.length;
    }
    public String toString(){
    	char[] retStr = new char[this.length];
    	System.arraycopy(this.value, 0, retStr, 0, this.length);
    	return String.copyValueOf(retStr);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreateStringBuffer s = new CreateStringBuffer("qweq7945123345sad123");
		s.append('2');
		s.insert(3, "plm");
		s.append("nmbnm");
		System.out.println("追加：\t\t" +s.toString() + "," + s.toString().length());
		s.reverse();
		System.out.println("反转：\t\t" +s.toString() + "," + s.toString().length());
		s.delete(2, 5);
		System.out.println("删除X到Y：\t" +s.toString() + "," + s.toString().length());
		s.delete(24);
		System.out.println("从X删除：\t" +s.toString() + "," + s.toString().length());
		s.delete(23, 25);
		System.out.println("\t\t" +s.toString() + "," + s.toString().length());
//		s.delete(24);
//		System.out.println(s.toString() + "," + s.toString().length());
	}

}

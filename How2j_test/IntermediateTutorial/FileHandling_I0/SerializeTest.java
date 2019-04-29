package FileHandling_I0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeTest implements Serializable{
	public String name;
	static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		SerializeTest s = new SerializeTest();
		s.name = "garen";
		File f = new File(new File("").getCanonicalPath() + "\\TestFiles\\TestFilesPackage\\FileHandling\\garen.lol");
		try(//��ʹ�ö���������������л�������������ʽ���䣩ʱ������ʵ��ʵ��Serializable�ӿ�
				ObjectOutputStream oos  = new ObjectOutputStream(new FileOutputStream(f));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
				){
			oos.writeObject(s);
			SerializeTest s2 = (SerializeTest) ois.readObject();
			System.out.println(s2.name);
		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
	}

}

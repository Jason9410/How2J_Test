package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.NullPointerException;
import java.io.IOException;

public class test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			test t = new test();
			File f = new File("C:\\Users\\rony\\Desktop\\test2.txt");
			if (!f.exists()) {
				f.createNewFile();
			}
			System.out.println("�ļ��Ƿ���ڣ�"+f.exists());
			FileInputStream fs = new FileInputStream("C:\\Users\\rony\\Desktop\\test.txt");
			System.out.println(fs.read());
			if (t == null) {
				throw new NullPointerException();
			}
			else
				t.ada();
		}
		catch (FileNotFoundException e) {
			System.out.println("�ļ������ڣ�");
		}
		catch (NullPointerException e) {
			System.out.println("��ָ���쳣��");
		}
		catch (IOException e) {
			System.out.println("�ļ�����ʧ�ܣ�");
		}
		finally {
			System.out.println("ִ�гɹ���");
		}
	}

	public void ada() {
		// TODO Auto-generated method stub
		System.out.println("qazxcsqd");
	}

}

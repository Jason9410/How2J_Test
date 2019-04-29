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
			System.out.println("文件是否存在："+f.exists());
			FileInputStream fs = new FileInputStream("C:\\Users\\rony\\Desktop\\test.txt");
			System.out.println(fs.read());
			if (t == null) {
				throw new NullPointerException();
			}
			else
				t.ada();
		}
		catch (FileNotFoundException e) {
			System.out.println("文件不存在！");
		}
		catch (NullPointerException e) {
			System.out.println("空指针异常！");
		}
		catch (IOException e) {
			System.out.println("文件创建失败！");
		}
		finally {
			System.out.println("执行成功！");
		}
	}

	public void ada() {
		// TODO Auto-generated method stub
		System.out.println("qazxcsqd");
	}

}

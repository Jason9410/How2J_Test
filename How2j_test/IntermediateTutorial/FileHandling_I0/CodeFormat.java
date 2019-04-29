package FileHandling_I0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class CodeFormat {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File(new File("").getCanonicalPath() + "\\TestFiles\\TestFilesPackage\\FileHandling\\CodeFormat.txt");
		FileWriter fw = null;
		try {
			if(!f.exists()){
				f.createNewFile();
				fw = new FileWriter(f);
				fw.write("中");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if (fw != null) {
				try{
					fw.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}

		System.out.println("本机默认编码格式："+Charset.defaultCharset());
		//FileReader得到的是字符，所以一定是已经把字节根据某种编码识别成了字符了
		//而FileReader使用的编码方式是Charset.defaultCharset()的返回值，如果是中文的操作系统，就是GBK
		//FileReader是不能手动设置编码方式的，为了使用其他的编码方式，只能使用InputStreamReader来代替
		//并且使用new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8")); 这样的形式
		try(FileReader fr = new FileReader(f);InputStreamReader isr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"))) {
			char[] r1 = new char[(int)f.length()];
			fr.read(r1);
			System.out.printf("FileReader会使用默认的编码方式%s得到文本内容为：%s\r\n",Charset.defaultCharset(),new String(r1));
			char[] r2 = new char[(int)f.length()];
			isr.read(r2);
			System.out.printf("InputStreamReader指定编码方式UTF-8,得到文本内容为：%s\r\n",new String(r2));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

}

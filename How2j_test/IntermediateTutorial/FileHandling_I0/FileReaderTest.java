package FileHandling_I0;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {
	public String readFile(File f){
		char[] retC = new char[(int)f.length()];
		try(FileReader fr = new FileReader(f)){
			fr.read(retC);
//			System.out.println("文件内容："+new String(retC));
		}catch(FileNotFoundException e){
			System.out.println("文件不存在！");
		}catch(IOException e){
			System.out.println("文件读取失败！");
		}
		return new String(retC);
	}
	public void writeFile(File f,String str){
		try(FileWriter fw = new FileWriter(f)){
			fw.write(str.toCharArray());
		}catch(FileNotFoundException e){
			System.out.println("文件不存在！");
		}catch(IOException e){
			System.out.println("文件写入失败！");
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReaderTest fr = new FileReaderTest();
//		String path2 = URLDecoder.decode(fr.getClass().getResource("/").getFile() +"TestFilesPackage/FileHandling/FileReader.txt","UTF-8");
		String path = new File("").getCanonicalPath() + "\\TestFiles\\TestFilesPackage\\FileHandling\\FileReader.txt";
		File f = new File(path);
//		System.out.println("path1 : "+path);
//		System.out.println("path2 : "+path2);
		try {
			if(!f.exists())
				f.createNewFile();
		} catch (IOException e) {
			System.out.println("文件创建失败！");
		}
		System.out.println("文件未修改前内容："+fr.readFile(f));
		fr.writeFile(f, "修改成功111！");
		System.out.println("文件修改后内容："+fr.readFile(f));
	}

}

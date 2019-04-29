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
//			System.out.println("�ļ����ݣ�"+new String(retC));
		}catch(FileNotFoundException e){
			System.out.println("�ļ������ڣ�");
		}catch(IOException e){
			System.out.println("�ļ���ȡʧ�ܣ�");
		}
		return new String(retC);
	}
	public void writeFile(File f,String str){
		try(FileWriter fw = new FileWriter(f)){
			fw.write(str.toCharArray());
		}catch(FileNotFoundException e){
			System.out.println("�ļ������ڣ�");
		}catch(IOException e){
			System.out.println("�ļ�д��ʧ�ܣ�");
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
			System.out.println("�ļ�����ʧ�ܣ�");
		}
		System.out.println("�ļ�δ�޸�ǰ���ݣ�"+fr.readFile(f));
		fr.writeFile(f, "�޸ĳɹ�111��");
		System.out.println("�ļ��޸ĺ����ݣ�"+fr.readFile(f));
	}

}

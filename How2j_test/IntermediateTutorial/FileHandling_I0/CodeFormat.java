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
				fw.write("��");
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

		System.out.println("����Ĭ�ϱ����ʽ��"+Charset.defaultCharset());
		//FileReader�õ������ַ�������һ�����Ѿ����ֽڸ���ĳ�ֱ���ʶ������ַ���
		//��FileReaderʹ�õı��뷽ʽ��Charset.defaultCharset()�ķ���ֵ����������ĵĲ���ϵͳ������GBK
		//FileReader�ǲ����ֶ����ñ��뷽ʽ�ģ�Ϊ��ʹ�������ı��뷽ʽ��ֻ��ʹ��InputStreamReader������
		//����ʹ��new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8")); ��������ʽ
		try(FileReader fr = new FileReader(f);InputStreamReader isr = new InputStreamReader(new FileInputStream(f),Charset.forName("UTF-8"))) {
			char[] r1 = new char[(int)f.length()];
			fr.read(r1);
			System.out.printf("FileReader��ʹ��Ĭ�ϵı��뷽ʽ%s�õ��ı�����Ϊ��%s\r\n",Charset.defaultCharset(),new String(r1));
			char[] r2 = new char[(int)f.length()];
			isr.read(r2);
			System.out.printf("InputStreamReaderָ�����뷽ʽUTF-8,�õ��ı�����Ϊ��%s\r\n",new String(r2));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

}

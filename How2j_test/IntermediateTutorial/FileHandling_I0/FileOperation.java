package FileHandling_I0;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class FileOperation {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		String path = new File("").getCanonicalPath() + "\\TestFiles\\TestFilesPackage\\FileHandling\\test2.txt";
		String renamePath = new File("").getCanonicalPath() + "\\TestFiles\\TestFilesPackage\\FileHandling\\Modify.txt";
		File f = new File(path);
		try{
			if (!f.exists()) {
				f.createNewFile();
			}
			FileInputStream fis = new FileInputStream(f);
			FileOutputStream fos = new FileOutputStream(f);
			System.out.println("��ǰ�ļ����ǣ�" +f);
			if (f.length() == 0) {
				fos.write("123".getBytes());
//				fos.write(new byte[]{33,34});
			}
			System.out.println("�ļ����ݳ��ȣ�"+f.length());
			byte[] Output = new byte[(int) f.length()];
			fis.read(Output);//��ȡ�ļ����ݻ������ֽ����飬fis.read()���ֽڶ�ȡ
	        System.out.println("��ȡ�ļ����ݣ�" +new String(Output));
	        System.out.println("�ж��Ƿ����ļ��У�"+f.isDirectory());
	        System.out.println("�ж��Ƿ����ļ���"+f.isFile());
	        System.out.println("��ȡ�ļ�������޸�ʱ�䣺"+(new Date(f.lastModified())));
	        f.setLastModified(System.currentTimeMillis());
	        System.out.println("�ļ�������޸�ʱ���Ϊ��ǰʱ�䣺"+(new Date(f.lastModified())));
			fis.close();
			fos.close();
	        f.renameTo(new File(renamePath));
			System.out.println("�ļ�����Ϊ��" +f.getName());
			Thread.sleep(5000);
			System.out.println("ɾ���ļ���"+new File(renamePath).delete());
		}
		catch(IOException e){
			System.out.println("�ļ�����ʧ�ܣ�");
		}
	}

}

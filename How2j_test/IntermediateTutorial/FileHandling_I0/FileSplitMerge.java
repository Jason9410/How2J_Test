package FileHandling_I0;

import java.io.*;
import java.util.Arrays;
import java.util.regex.Pattern;

public class FileSplitMerge {
	public File[] SplitFile(File f,int size,int count){
		File[] retF = new File[count];
		byte[] date = new byte[(int)f.length()];
		String fileName = f.getName();
		FileInputStream fi = null;
		FileOutputStream fo = null;
		try{
			fi = new FileInputStream(f);
			fi.read(date);
//			fi.close();		���ַ�ʽ���ڱ׶ˣ����ļ��������쳣ʱ��������佫����ִ�У������޷��ر�
			for (int i = 0; i < count; i++) {
				File f2 = new File(f.getParent()+"\\"+Pattern.compile("\\.").matcher(fileName).replaceFirst("-"+i+"\\."));
				fo = new FileOutputStream(f2);
				if(i == count -1)
					fo.write(Arrays.copyOfRange(date, i*size, date.length));
				else
					fo.write(Arrays.copyOfRange(date, i*size, (i+1)*size));
//				fo.close();
				retF[i] = f2;
				System.out.println("������ļ�"+f2+"���䳤��Ϊ��"+f2.length()+"�ֽ�");
			}
		}catch(FileNotFoundException e){
			System.out.println("�ļ������ڣ�");
		}catch(IOException e){
			System.out.println("�ļ���дʧ�ܣ�");
		}finally {
			if (fi != null) {
				try{
					fi.close();
				}catch(IOException e){
					System.out.println("�ļ��������ر�ʧ�ܣ�");
				}
			}
			if (fo != null) {
				try{
					fo.close();
				}catch(IOException e){
					System.out.println("�ļ�д�����ر�ʧ�ܣ�");
				}
			}
		}
		return retF;
	}
	public File MergeFile(File[] f){
		File retF = new File(f[0].getParent() + "\\"+Pattern.compile(".*\\.").matcher(f[0].getName()).replaceFirst("TargetFile\\."));
//		FileOutputStream fo = null;
		FileInputStream fi = null;
		try(FileOutputStream fo = new FileOutputStream(retF);){//����������try���涨�壬�����ظ�ֵ
//			fo = new FileOutputStream(retF);
			for (int i = 0; i < f.length; i++) {
				byte[] date = new byte[(int)f[i].length()];
				fi = new FileInputStream(f[i]);
				fi.read(date);
				fo.write(date);
				System.out.println("���ļ�"+f[i]+"���䳤��Ϊ��"+f[i].length()+"�ֽ�\r\n�ϲ���Ŀ���ļ�"+retF+"���䳤��Ϊ��"+retF.length());
			}
		}
		catch(FileNotFoundException e){
			System.out.println("�ļ������ڣ�");
		}
		catch(IOException e){
			System.out.println("�ļ���дʧ�ܣ�");
		}finally {
			if (fi != null) {
				try{
					fi.close();
				}catch(IOException e){
					System.out.println("�ļ��������ر�ʧ�ܣ�");
				}
			}
		}
		return retF;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileSplitMerge sm = new FileSplitMerge();
		String path = new File("").getCanonicalPath() + "\\TestFiles\\TestFilesPackage\\FileHandling\\FileSplitMerge\\SourceFile.txt";
		File f = new File(path);
		File[] fs = new File[4];
		fs = sm.SplitFile(f, 100, 4);
		System.out.println();
		sm.MergeFile(fs);
	}

}

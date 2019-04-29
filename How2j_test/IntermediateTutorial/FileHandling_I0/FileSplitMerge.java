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
//			fi.close();		这种方式存在弊端，当文件流出现异常时，该条语句将不会执行，即流无法关闭
			for (int i = 0; i < count; i++) {
				File f2 = new File(f.getParent()+"\\"+Pattern.compile("\\.").matcher(fileName).replaceFirst("-"+i+"\\."));
				fo = new FileOutputStream(f2);
				if(i == count -1)
					fo.write(Arrays.copyOfRange(date, i*size, date.length));
				else
					fo.write(Arrays.copyOfRange(date, i*size, (i+1)*size));
//				fo.close();
				retF[i] = f2;
				System.out.println("输出子文件"+f2+"，其长度为："+f2.length()+"字节");
			}
		}catch(FileNotFoundException e){
			System.out.println("文件不存在！");
		}catch(IOException e){
			System.out.println("文件读写失败！");
		}finally {
			if (fi != null) {
				try{
					fi.close();
				}catch(IOException e){
					System.out.println("文件读入流关闭失败！");
				}
			}
			if (fo != null) {
				try{
					fo.close();
				}catch(IOException e){
					System.out.println("文件写入流关闭失败！");
				}
			}
		}
		return retF;
	}
	public File MergeFile(File[] f){
		File retF = new File(f[0].getParent() + "\\"+Pattern.compile(".*\\.").matcher(f[0].getName()).replaceFirst("TargetFile\\."));
//		FileOutputStream fo = null;
		FileInputStream fi = null;
		try(FileOutputStream fo = new FileOutputStream(retF);){//这种流放在try里面定义，不可重赋值
//			fo = new FileOutputStream(retF);
			for (int i = 0; i < f.length; i++) {
				byte[] date = new byte[(int)f[i].length()];
				fi = new FileInputStream(f[i]);
				fi.read(date);
				fo.write(date);
				System.out.println("子文件"+f[i]+"，其长度为："+f[i].length()+"字节\r\n合并后目标文件"+retF+"，其长度为："+retF.length());
			}
		}
		catch(FileNotFoundException e){
			System.out.println("文件不存在！");
		}
		catch(IOException e){
			System.out.println("文件读写失败！");
		}finally {
			if (fi != null) {
				try{
					fi.close();
				}catch(IOException e){
					System.out.println("文件读入流关闭失败！");
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

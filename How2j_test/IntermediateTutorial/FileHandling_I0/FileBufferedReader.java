package FileHandling_I0;

import java.io.*;

public class FileBufferedReader {
	public String BufferedRead(File f){
		String str = "";
		try(FileReader fr = new FileReader(f);BufferedReader br = new BufferedReader(fr)){
//			BufferedReader br = new BufferedReader(fr);
			while(true){
				String s = br.readLine();
				if(s == null)
					break;
				str = str + s;
			}
			System.out.printf("BufferedRead�ļ�%s��ȡ���ݣ�%s\r\n",f.getName(),str);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return str;
	}
	public String BufferedRead(File f,String ecode){
		String str = "";
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f), ecode))){
//			BufferedReader br = new BufferedReader(fr);
			while(true){
				String s = br.readLine();
				if(s == null)
					break;
				str = str + s;
			}
			System.out.printf("BufferedRead�ļ�%s�Ա���%s��ȡ���ݣ�%s\r\n",f.getName(),ecode,str);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		return str;
	}
	public void BufferedWrite(File f,String context){
		try(FileWriter fw = new FileWriter(f);BufferedWriter bw = new BufferedWriter(fw)){
//			BufferedWriter bw = new BufferedWriter(fr);
//			bw.newLine();
			bw.write(context);
			System.out.printf("BufferedWrite�ļ�%sд�����ݣ�%s\r\n",f.getName(),context);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void BufferedWrite(File f,String context,String ecode){
		try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(f), ecode))){
//			BufferedWriter bw = new BufferedWriter(fr);
//			bw.newLine();
			bw.write(context);
			System.out.printf("BufferedWrite�ļ�%s�Ա���%sд�����ݣ�%s\r\n",f.getName(),ecode,context);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void PrintWrite(File f,String context,String ecode){
		try(PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(f),ecode))){
			pw.println(context);
//			pw.write(context);
			System.out.printf("PrintWrite�ļ�%sд�����ݣ�%s\r\n",f.getName(),context);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileBufferedReader fb = new FileBufferedReader();
		File f = new File(new File("").getCanonicalPath() + "\\TestFiles\\TestFilesPackage\\FileHandling\\FileBuffered.txt");
		fb.BufferedRead(f);//Ĭ�ϲ���ϵͳ�����ʽ����
		fb.BufferedWrite(f, "��\r\n��","utf-8");
		fb.BufferedRead(f,"utf-8");
	}

}

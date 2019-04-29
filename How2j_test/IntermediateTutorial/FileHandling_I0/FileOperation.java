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
			System.out.println("当前文件名是：" +f);
			if (f.length() == 0) {
				fos.write("123".getBytes());
//				fos.write(new byte[]{33,34});
			}
			System.out.println("文件内容长度："+f.length());
			byte[] Output = new byte[(int) f.length()];
			fis.read(Output);//读取文件数据缓存至字节数组，fis.read()单字节读取
	        System.out.println("读取文件内容：" +new String(Output));
	        System.out.println("判断是否是文件夹："+f.isDirectory());
	        System.out.println("判断是否是文件："+f.isFile());
	        System.out.println("获取文件的最后修改时间："+(new Date(f.lastModified())));
	        f.setLastModified(System.currentTimeMillis());
	        System.out.println("文件的最后修改时间改为当前时间："+(new Date(f.lastModified())));
			fis.close();
			fos.close();
	        f.renameTo(new File(renamePath));
			System.out.println("文件名改为：" +f.getName());
			Thread.sleep(5000);
			System.out.println("删除文件："+new File(renamePath).delete());
		}
		catch(IOException e){
			System.out.println("文件创建失败！");
		}
	}

}

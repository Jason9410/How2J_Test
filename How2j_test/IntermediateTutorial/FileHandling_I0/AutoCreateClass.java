package FileHandling_I0;

import java.io.*;
import java.util.Scanner;

public class AutoCreateClass {
	public final String context = "public class @class@ {\r\n\tpublic @type@ @property@;\r\n\tpublic @class@() {\r\n\t}\r\n\tpublic void set@property@(@type@  @property@){\r\n\t\tthis.@property@ = @property@;\r\n\t}\r\n\tpublic @type@  get@property@(){\r\n\t\treturn this.@property@;\r\n\t}\r\n}";
	
	public File createClass (String className,String propertyType,String propertyName) throws IOException{
		String resultStr = new String(context);
		resultStr = resultStr.replaceAll("@class@", className);
		resultStr = resultStr.replaceAll("@type@", propertyType);
		resultStr = resultStr.replaceAll("@property@", propertyName);
		File f = new File(new File("").getCanonicalPath() + "\\TestFiles\\TestFilesPackage\\FileHandling\\"+className+".java");
		if (!f.exists()) {
			f.createNewFile();
		}
		try(PrintWriter pw = new PrintWriter(f)){
			pw.write(resultStr);
		}
		return f;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("请输入类名：");
		String className = s.nextLine();
		System.out.print("请输入属性类型：");
		String propertyType = s.nextLine();
		System.out.print("请输入属性名称：");
		String propertyName = s.nextLine();
		System.out.println("自动生成类：");
		AutoCreateClass ac = new AutoCreateClass();
		try {
			File f = ac.createClass(className, propertyType, propertyName);
			BufferedReader br = new BufferedReader(new FileReader(f));
			String str = null;
			while((str = br.readLine()) != null)
				System.out.println(str);
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s.close();
	}

}

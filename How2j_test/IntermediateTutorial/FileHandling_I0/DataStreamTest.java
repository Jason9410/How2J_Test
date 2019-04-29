package FileHandling_I0;

import java.io.*;
public class DataStreamTest {
	public void read(File f){
		try(DataInputStream dis = new DataInputStream(new FileInputStream(f))){
			dis.readBoolean();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public void write(File f){
		try(DataOutputStream dis = new DataOutputStream(new FileOutputStream(f))){
			dis.writeBoolean(true);
			dis.writeInt(5000);
			dis.writeUTF("This is a string");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataStreamTest fb = new DataStreamTest();
		File f = new File(new File("").getCanonicalPath() + "\\TestFiles\\TestFilesPackage\\FileHandling\\FileDataStream.txt");
		fb.write(f);
	}

}

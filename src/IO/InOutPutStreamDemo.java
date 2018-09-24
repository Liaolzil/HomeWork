package IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InOutPutStreamDemo implements Serializable{
	public static void main(String[] args) throws Exception {
		FileOutputStream fos=new FileOutputStream("mian.txt",true);
		FileInputStream fis=new FileInputStream("mian.txt");
		FileOutputStream fos1=new FileOutputStream("mian1.txt",true);
		fos.write("HelloWorld".getBytes());
		System.out.println("写入二完毕");
		int len=-1;
		while((len=fis.read())!=-1) {
			fos1.write(len);
			System.out.print((char)len);
		}
		System.out.println("读取完毕");
		fis.close();
		fos.close();
		
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("mian1.txt",true));
		bos.write("生活不止眼前的苟且，还有诗和远方...".getBytes());
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("mian1.txt"));
		int d=-1;
		while((d=bis.read())!=-1) {
			bos.write(d);
		}
		bos.flush();
		
		InOutPutStreamDemo ip=new InOutPutStreamDemo();
		ObjectOutputStream oos=new ObjectOutputStream(fos1);
		oos.writeObject(ip);
	}

}

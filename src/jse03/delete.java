package jse03;

import java.io.File;
import java.io.IOException;

public class delete {
	public static void main(String[] args) throws IOException {
		File file=new File("demo1");
		File file2=new File("demp");
		file2.mkdir();
		File file3=new File("demp","kjk");
		file3.createNewFile();
		File file4=new File("demp","ee.ppt");
		System.out.println(file4.length());
		if(file.exists()) {
			file.delete();
			System.out.println("文件已经删除");
				
		}else {
			System.out.println("文件不存在");
		}
		
		File file1=new File("demo");
		File [] subs=file1.listFiles();
		for(int i=0;i<subs.length;i++) {
			
			System.out.println(subs[i].getName());
		}
		
	}

}

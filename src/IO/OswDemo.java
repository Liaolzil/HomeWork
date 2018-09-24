package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OswDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("xiong1.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		String line = "你好，美女，你好，我好，大家好！";
		osw.write(line);
		osw.close();
		FileInputStream src = new FileInputStream("xiong1.txt");
		FileOutputStream desc = new FileOutputStream("xiong2.txt");

		int len = -1;
		byte[] data = new byte[1024 * 10];
		while ((len = src.read(data)) != -1) {
			desc.write(data, 0, len);
		}
		System.out.println("复制完毕!");
		src.close();
		desc.close();

		/**
		 * Error（错误）:是程序无法处理的错误，表示运行应用程序中较严重问题。大多数错误与代码编写者执行的操作无关，而表示代码运行时 JVM（Java
		 * 虚拟机）出现的问题。例如，Java虚拟机运行错误（Virtual MachineError），当 JVM 不再有继续执行操作所需的内存资源时，将出现
		 * OutOfMemoryError。这些异常发生时，Java虚拟机（JVM）一般会选择线程终止。
		 * 
		 * Exception（异常）:是程序本身可以处理的异常。
		 * 
		 * Exception可以分为checked exceptions和unchecked exceptions ：
		 * 
		 * 1，unchecked
		 * exceptions（运行时异常）都是RuntimeException类及其子类异常，就是我们在开发中测试功能时程序终止，控制台出现的异常，比如：
		 * NullPointerException(空指针异常)、 IndexOutOfBoundsException(下标越界异常)
		 * ClassCastException(类转换异常) ArrayStoreException(数据存储异常，操作数组时类型不一致)
		 * IO操作的BufferOverflowException异常
		 * 
		 * 2， checked exceptions，非运行时异常
		 * （编译异常）：是RuntimeException以外的异常，类型上都属于Exception类及其子类。从程序语法角度讲是必须进行处理的异常，如果不处理，程序就不能编译通过。如IOException、SQLException等以及用户自定义的Exception异常，一般情况下不自定义检查异常。
		 * 通俗的话说就是在写代码时出现红线，需要try catch或者throws时出现的异常。 运行异常
		 */
	

	}
}

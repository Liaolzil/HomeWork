package jse01;

import java.util.Arrays;

public class Day01 {

	public static void main(String[] args) {
		String emil="xiaoxiongxiong@com.cn";
		int a=emil.indexOf(".");
		int b=emil.indexOf("@");
		int c=emil.length();//等于0则无字符
		if(a==0||b==0) {
		System.out.println("在第一位错误");
		}
		System.out.println(emil.startsWith("xiao"));
		System.out.println(emil.endsWith("cn"));

		String emil1="liaolzili@qq.com";
		System.out.println(emil.equals(emil1));//是否一样

		int d=emil.indexOf("@")+1;
		int e=emil.indexOf(".");
		String str=emil.substring(d);
		String str1=emil.substring(d, e);
		System.out.println(str);
		System.out.println(str1);

		System.out.println(emil.charAt(5));//指定位置字符

		   emil=emil.trim();
		   emil=emil.toUpperCase();//转换为大写
		   System.out.println(emil);
		
		
		String str2="长沙达内有限公司abca  ";
		String str3="我的米名字叫熊文婷";
		System.out.println("str长度："+str2.length());
		System.out.println("大写："+str2.toUpperCase());
		System.out.println("a的位置"+str2.indexOf("a"));
		System.out.println("取出str里的空白"+str2.trim());
		char[] chs=str2.toCharArray();
		System.out.println("字符数组"+Arrays.toString(chs));
		System.out.println("第六个位置的字符："+str2.charAt(6));
	}

}

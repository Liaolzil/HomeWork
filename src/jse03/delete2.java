package jse03;

import java.io.File;

public class delete2 {
	public static void de(File f){
        File [] b = f.listFiles();//获取包含file对象对应的子目录或者文件
        for(int i =0;i<b.length;i++){
            if(b[i].isFile()&&b[i].getName().endsWith("txt")){//判断是否为文件
                b[i].delete();//如果是就删除
            }else{
                de(b[i]);//否则重新递归到方法中
            }
        }
       ;//最后删除该目录中所有文件后就删除该目录
    }    
    public static void main(String[] args){
        File a = new File("demo");
      de(a);

}}

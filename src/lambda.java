
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lambda {
public static void main(String[] args) {
	Runnable r1=new Runnable() {
		public void run() {
			System.out.println("hello!");
		}
		
	};
	Runnable r2=()->System.out.println("hi");
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();
	
	
	//用lambdar重写comparator
	List<String> list = new ArrayList<String>();
	list.add("传奇");
	list.add("小泽老师");
	list.add("苍老师");
	System.out.println(list);
	Comparator <String>vo=(o1,o2)->
		 o1.length()-o2.length();
		 Collections.sort(list,vo);
		 System.out.println(list);

		
			
			for(String str : list) {
				System.out.println(str);
			}
			//JDK8支持的新方式:
			list.forEach(
				(str)->System.out.println(str)
			);
			
			Map<String,Integer> map
				= new HashMap<String,Integer>();
			map.put("语文", 99);
			map.put("数学", 98);
			map.put("英语", 97);
			
			map.forEach(
				(k,v)->System.out.println(k+":"+v)	
			);
			list.forEach((s)->{
			System.out.println(s);
			});
			map.forEach((u,f)->
			System.out.println(u+f));
		}
}


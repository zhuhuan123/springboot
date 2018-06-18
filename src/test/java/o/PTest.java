package o;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

import o.mod.P;

public class PTest {
	@Test
	public void o() throws Exception {
		Class cl = Class.forName("o.mod.P");
		P p= (P)cl.newInstance();
		p.setAge("12");
		p.setName("namezhuhuanxiong ");
		Field [] s= cl.getDeclaredFields();
		Map<String,Object> map = new HashMap<String,Object>();
		for(Field fo:s) {
			System.out.println(fo.getName());
			Method mm= cl.getMethod("get"+fo.getName().substring(0, 1).toUpperCase()+fo.getName().substring(1));
			map.put(fo.getName(), mm.invoke(p));
		}
		
		Set<String> se= map.keySet();
		for(String o:se) {
			System.out.println("每个数据的值  "+o+" "+map.get(o));
		}
	}
	
	@Test
	public void l() {
		String s = URLEncoder.encode("http://www.baidu.com");
		System.out.println("得到编码后的值为  "+s);
				
		String b = URLDecoder.decode(s);
		System.out.println("解码后的值为  "+b);
		
		
	}
	
	@Test
	public void ll() {
//		http://news.163.com/
		
		String r = URLEncoder.encode("http://news.163.com/");
		System.out.println("编码 后的字符为  "+r);
		
	}
	
	@Test
	public void k() {
		
		System.out.println("starting ");
		System.out.println("running   启动另外一个线程进行执行");
		new Thread(new Runnable() {public void run() {
			System.out.println(" run  ");
		}}).start();
		System.out.println("ending ");
	
		BigDecimal big = new BigDecimal("123");
		System.out.println("取得值 "+big.doubleValue());
	}
	
//	@Test
}

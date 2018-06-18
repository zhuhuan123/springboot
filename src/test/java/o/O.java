package o;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;
import org.springframework.util.StringUtils;

import o.mod.St;
import java.util.*;
public class O {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void d() throws Exception{
		System.out.println(StringUtils.isEmpty(""));
		System.out.println(StringUtils.isEmpty("1"));
		
		Class cl = Class.forName("o.mod.St");
		St st = (St)cl.newInstance();
		Field [] fs = cl.getDeclaredFields();
		for(Field f:fs) {
			System.out.println("字段name 值为 "+f.getName());
		}
	}
	
	String p = "http://127.0.0.1";
	@Test
	public void up() {
		String pa = p+"/lo";
		System.out.println("路径值为 "+pa);
	
		HashMap<String,String> h = new HashMap<String,String>();
		h.put("name", "nam1");
		h.put("valu", "vam1");
		
		Set<String> s = h.keySet();
		StringBuilder str= new StringBuilder();
		for(String o:s) {
			str.append("&"+o+"="+h.get(o));
		}
		System.out.println("返回的string 类型值为  "+str.toString());
		
		System.out.println("取得去掉值后的东西为 "+str.toString().substring(1));
		
		new Thread(()->
		{
			System.out.println("hel");
			System.out.println("tar");
			
		}) .start();
	}
	
	
	@Test
	public void pr() {
	

int [] a= new int[]{1,2,3,4,5,6,7};
for(int u=0;u<a.length;u++){
    System.out.print(a[u]+" ");
}
System.out.println();
	}
	
	
}

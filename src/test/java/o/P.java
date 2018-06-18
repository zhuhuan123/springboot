package o;

import java.util.Stack;

import org.junit.Test;

public class P {

	@Test
	public void o() {
		System.out.println("out Êä³öÊý¾Ý");
		
		int a = 123;
		st(a);
	}
	void st(int a) {
		
		Stack<Integer> st = new Stack<>();
		while(a!=0) {
			st.push(a%10);
			System.out.print(a%10+" ");
			a = a/10;
		}
		
		System.out.println();
		
		while(!st.isEmpty()) {
			System.out.print(st.pop()+" ");
		}
		System.out.println();
	}
}

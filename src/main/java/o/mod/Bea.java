package o.mod;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Bea {
	public void se() {
		
	}
	public String ge() {
		return "geotherresult";
	}
	
	
	public Map<String,Object> ma(){
		HashMap<String,Object> ha = new HashMap<String,Object>();
		ha.put("s","sva");
		ha.put("t","stva");
		return ha;
	}
	
	public MyVa geMyVa() {
		MyVa myVa = new MyVa();
		myVa.setAge(12);
		myVa.setName("name");
		return myVa;	
	}
}


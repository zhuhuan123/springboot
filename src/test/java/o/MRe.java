package o;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class MRe {
	@Test
	public void T() {
		Jedis jed = new Jedis("127.0.0.1");
	
		System.out.println("ping "+jed.ping());
		
//		System.out.println(" resource ×ÊÔ´Îª "+jed.get("ro"));
		System.out.println(jed.get("tes"));
		
		System.out.println();
	}
}

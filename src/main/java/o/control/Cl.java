package o.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import o.service.MJedis;
import redis.clients.jedis.Jedis;

@Component
public class Cl {

	@Autowired
	private MJedis mJedis;
	
//	public
	
	public String d() {
		Jedis jedis = mJedis.get();
		String rs = jedis.get("foo");
		System.out.println("ja cod 类型值  "+rs);
		return "s";
	}
	
	public void j() {
		Jedis j = mJedis.get();
//		j.set(key, value)
		String l =j.get("ro");
		System.out.println("得到key "+l);
	}
}

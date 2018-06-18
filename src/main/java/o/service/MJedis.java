package o.service;

import org.springframework.stereotype.Component;

import redis.clients.jedis.Jedis;

@Component
public class MJedis {
	
	public MJedis(){
		jed = new Jedis("127.0.0.1");
	}
	Jedis jed = null;
	public Jedis get() {
		return jed;
	}
}

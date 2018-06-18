package o.control;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import o.service.MJedis;
import redis.clients.jedis.Jedis;

@RestController
public class CoTe {

	
	@RequestMapping(value="dt")
	public String d() {
		System.out.println("方法的执行");
		return "test";
	}
	
	@RequestMapping(value="oo")
	public JSONObject g() {
		JSONObject jso = new JSONObject();
		jso.put("k1", "v1");
		jso.put("k2", "v2");
		jso.put("k3", "v3");
		
		
		return jso;
		
	}
	
	@RequestMapping(value="oj")
	public JSONObject j() {
		JSONObject j = new JSONObject();
		JSONArray ja = new JSONArray();
		JSONObject j1 =  new JSONObject();
		j1.put("ag", 12);
		JSONObject j2 =  new JSONObject();
		j2.put("ll", "1234");
		ja.add(j1);
		ja.add(j2);
		j.put("size", 2);
		j.put("list", ja);
		return j;
	}
	
	@RequestMapping(value="res")
	public String res() {
	
//		mJedis.
		String r = cl.d();
		return "得到的结果为  "+r;
	}
	
	@Autowired
	private MJedis mJedis;
	
	private String key="key";
	@RequestMapping(value="sjed")
	public JSONObject s(String id) {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("code", "1");
		Jedis je = mJedis.get();
		String r = je.get(key+id);
		if(r==null) {
			je.set(key+id, "1");
			je.expire(key+id, 3);
		}else {
			jsonObject.put("code", "0");
			jsonObject.put("msg", "操作太频繁了");
			return jsonObject;
		}
		jsonObject.put("msg", "操作成功");
		return jsonObject;
	}
	
	@Autowired
	private Cl cl;
	
	@RequestMapping(value="va")
	public void v(@Valid String n) {
		System.out.println("取得name 值 "+n);
	}
}


package o.control;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import o.map.MusMapp;
import o.map.StMapp;
import o.mod.Muser;
import o.mod.Par;
import o.mod.St;
import java.util.HashMap;
@Controller
public class MC {
	@RequestMapping(value="index")
	public String in() {
		
		System.out.println("执行这里");
		return "index";
	}
	@RequestMapping(value="hello")
	public String hel(Model model) {
		model.addAttribute("name", "zhuhuanxiong");
		System.out.println("执行这里 hello  ");
		return "hello";	
	}
	
	private StMapp stMapp;
	
	
	@ResponseBody
	@RequestMapping(value="ge")
	public List<St> g(){
		return stMapp.fin();
	}
	public StMapp getStMapp() {
		return stMapp;
	}
	
	@Autowired
	public void setStMapp(StMapp stMapp) {
		this.stMapp = stMapp;
	}
	
	private MusMapp musMapp;
	
	
	@ResponseBody
	@RequestMapping(value="fimus")
	public List<Muser> ge(){
		return musMapp.fin();
	}
	public MusMapp getMusMapp() {
		return musMapp;
	}
	@Autowired
	public void setMusMapp(MusMapp musMapp) {
		this.musMapp = musMapp;
	}
	
	@RequestMapping(value="inc")
	public String de(ModelMap model) {
		AtomicInteger at = new AtomicInteger();
		int t = at.incrementAndGet();
		System.out.println("增加的数值为  "+t);
		model.addAttribute("name", "value1");
		
//		HttpClient
		return "my";
	}
	
	@RequestMapping(value="gtsj")
	public String gtsj() {
		return "gts";
	}
	

	@ResponseBody
	@RequestMapping(value="srget")
	public String gtsjm(@RequestParam("name") String name) {
		System.out.println("接收到的参数值为  "+name);
		return "hell success";
	}
	
	@RequestMapping(value="s")
	public void s(HttpServletRequest request) {
		Map<String ,String[]> mp = request.getParameterMap();
		for(String o:mp.keySet()) {
			System.out.println("ke 值为   "+o);
		}
	}
	
	
	@ResponseBody
	@RequestMapping(value="ts")
	public Map<String,Object> ts(){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("k1", "v1");
		map.put("k2", "v2");
		return map;
	}
	
	@ResponseBody
	@RequestMapping(value="gjson")
	public	JSONObject gjs(Par par) {
		System.out.println(" AccessToken "+par.getAccessToken());
		System.out.println(" Deviceid "+par.getDeviceid());
		System.out.println(" Openid "+par.getOpenid());
		JSONObject j = new JSONObject();
		j.put("ke1", "value1");
		j.put("ke2", "value2");
		j.put("ke3", "value3");
		return j;
	}
	
//	@RequestMapping(value="ll")
//	public 
	
}

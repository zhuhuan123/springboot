package o.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import o.mod.St;
import o.service.StService;

import java.util.*;

@Controller
public class NoCont {
	@ResponseBody
	@RequestMapping(value="r")
	public String r() {
		return "str";
	}
	
	@ResponseBody
	@RequestMapping(value="maprod")
	public Map<String,Object> ma(){ 
		HashMap<String,Object> h = new HashMap<String,Object>();
		h.put("akey", "avalue");
		return h;
	}
	
	@RequestMapping(value="gjs")
	public String g(Model model) {
		model.addAttribute("nam", "namval123");
		return "gts";
	}
	
	@Value("${age}")
	private Integer age;
	
	@ResponseBody
	@RequestMapping(value="gjjsage")
	public String geAge() {
		System.out.println("获取得到age 的值为 "+age);
		
		return "a my "+age;
	}
	
	@ResponseBody
	@RequestMapping(value="ins")
	public String in() {
		St st = new St();
		st.setName("na001");
		Random ra = new Random();
		
		st.setId(ra.nextInt(100));
		stService.sav(st);
	return "in";
	}
	
	@Autowired(required=false)
	private StService stService;
	
	@ResponseBody
	@RequestMapping(value="/a/{useId}")
	public void i(@PathVariable("useId")String useId)  {
		System.out.println("yonghu de id zhiw"+useId);
	}
}

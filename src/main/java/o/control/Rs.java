package o.control;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import o.mod.Foo;

import java.util.*;
@RestController
public class Rs {

	@RequestMapping(value="geobj")
	public Map<String,Object> ge(){
		Map<String,Object> m = new HashMap<String,Object>();
		m.put("name", "朱焕系");
		m.put("age", 12);
		return m;
	}
	
	@RequestMapping(value="bin")
	public void sv(@Validated Foo foo,BindingResult bindingResult,ModelMap model) {
		if(bindingResult.hasErrors()) {
			System.out.println("错误的数目 "+bindingResult.getErrorCount());
			System.out.println("错误的字段值为 "+bindingResult.getFieldError().getField());
			System.out.println("输出错误的key value  ");
			model.addAttribute("error", bindingResult.getFieldError().getField());
		}else {
			System.out.println("没有错误的值");
		}
	}
	
	@RequestMapping(value="t1s")
	public void l() {
		
	}
}

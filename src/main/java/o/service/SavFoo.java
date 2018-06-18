package o.service;


import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

import o.mod.Foo;

@Component
public class SavFoo {

	public void sav(@Validated Foo foo,BindingResult bindingResult) {
		System.out.println(foo.getName());
		System.out.println(foo.getAge());
		System.out.println("save 方法的执行  ");
		if(bindingResult.hasErrors()) {
			System.out.println("数据有错误");
		}
	}//根据userid  取出值，如果为空，插入数据到数据库，
}

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
		System.out.println("save ������ִ��  ");
		if(bindingResult.hasErrors()) {
			System.out.println("�����д���");
		}
	}//����userid  ȡ��ֵ�����Ϊ�գ��������ݵ����ݿ⣬
}

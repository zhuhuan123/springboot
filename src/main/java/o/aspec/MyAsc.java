package o.aspec;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAsc {
//	@Pointcut(value="execution(* *(..))")
	@Pointcut(value="execution(* o.control..*.*(..))")
	public void po(){
		
	}
	@Before("po()")
	public void bef(JoinPoint jo) {
		System.out.print("ǩ�� "+jo.getSignature().getName());
		
		System.out.println(" ����ִ��֮ǰִ��");
	}
	@After("po()")
	public void after() {
		System.out.println("f����ִ��֮houִ��");
	}
	
}

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
		System.out.print("签名 "+jo.getSignature().getName());
		
		System.out.println(" 方法执行之前执行");
	}
	@After("po()")
	public void after() {
		System.out.println("f方法执行之hou执行");
	}
	
}

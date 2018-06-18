package o.aspec;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAspect {
	@Pointcut(value="execution(* o.control..*.*(..))")
	public void pi() {
		
	}
	
	@Before("pi()")
	public void be(JoinPoint joinpoint) {
		
		System.out.print(joinpoint.getSignature().getName()+" "+joinpoint.getSignature().getModifiers()+" ");
		System.out.println("方法执行之前执行 ");
		
	}
	
	@After("pi()")
	public void af(JoinPoint joinpoint) {
		System.out.print(joinpoint.getSignature().getName()+" "+joinpoint.getSignature().getModifiers()+" ");
		System.out.println("方法执行之hou执行 ");
	}
}

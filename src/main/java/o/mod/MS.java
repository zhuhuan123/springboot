package o.mod;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class MS implements ApplicationContextAware{

	
	private ApplicationContext ac;
	
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		// TODO Auto-generated method stub
		this.ac = arg0;
	}
	
	public ApplicationContext getAc() {
		return ac;
	}

}

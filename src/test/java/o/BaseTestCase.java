package o;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

//SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringRunner.class)
@SpringBootTest
@PropertySource(value="classpath:va.properties")
////指定我们SpringBoot工程的Application启动类
//@SpringApplicationConfiguration(classes = App.class)
////由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
////测了，不用一下配置也可以，不知道为毛
//@WebAppConfiguration
public class BaseTestCase {
	@Test
	public void t() {
		System.out.println("特殊他");
	}
}
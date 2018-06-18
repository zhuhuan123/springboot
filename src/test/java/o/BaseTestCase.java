package o;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

//SpringJUnit֧�֣��ɴ�����Spring-Test���֧�֣�
@RunWith(SpringRunner.class)
@SpringBootTest
@PropertySource(value="classpath:va.properties")
////ָ������SpringBoot���̵�Application������
//@SpringApplicationConfiguration(classes = App.class)
////������Web��Ŀ��Junit��Ҫģ��ServletContext�����������Ҫ�����ǵĲ��������@WebAppConfiguration��
////���ˣ�����һ������Ҳ���ԣ���֪��Ϊë
//@WebAppConfiguration
public class BaseTestCase {
	@Test
	public void t() {
		System.out.println("������");
	}
}
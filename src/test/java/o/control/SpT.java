package o.control;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import o.mod.St;
import o.service.StService;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@PropertySource(value="va.properties")
public class SpT {

//	@Autowired(required=false)
//	private StService stService;
//	
//	@Test
//	public void d() {
//		List<St> st = stService.geList();
//		for(St o:st) {
//			System.out.println(o);
//		}
//	}
	
	@Autowired(required=false)
	private MockMvc mock ;
	
	@Test
	public void s() {
		System.out.println(mock);
	}
}

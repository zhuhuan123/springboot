package o;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.annotation.Resource;
//@RunWith(SpringRunner.class)
////@ConfigurationProperties(locations= {"classpath:va.properties","classpath:application.properties"})//locations = { "classpath:application.properties" }
//@SpringBootTest
////@SpringApplicationConfiguration(classes=App.class)
////@AutoConfigureMockMvc
//@WebAppConfiguration

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class AppTests {
	 @Autowired
	    private WebApplicationContext wac;
	    private MockMvc mockMvc;
	    @Before
	    public void setup() {
	        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();   //构造MockMvc
	    }

	@Test
	public void test() {

			System.out.println("run");
	}
//	
//	@Resource
//	private MockMvc mockMvc;


	@Test
	public void e() throws Exception{
		System.out.println("mock  单元测试  "+mockMvc);
//		mockMvc.perform(get("/ins").param("name", "bv")).andDo(print());
		mockMvc.perform(get("/ins")).andExpect(status().isOk()).andDo(print());
		mockMvc.perform(get("/gjjsage")).andDo(print());
	}
	
	@Test
	public void d() throws Exception {
		mockMvc.perform(get("/dt")).andDo(print()).andExpect(status().is2xxSuccessful());
	}
	
	@Test
	public void m() throws Exception{
//		ts
		System.out.println("-----执行单元测试   ----");
		mockMvc.perform(get("/ts")).andDo(print());
		System.out.println("-----执行单元测试-  返回---");
	}
	
	@Test
	public void dg() throws Exception {
//		geobj
		System.out.println("执行单元测试看是否成功");
		mockMvc.perform(get("/geobj")).andDo(print());
	}
	
	@Test
	public void pl() throws Exception{
		mockMvc.perform(get("/geMyV")).andDo(print());
	}
	
	@Test
	public void mo() throws Exception{
		System.out.println("start  开始执行 ");
		mockMvc.perform(get("/dap")).andDo(print());
		System.out.println("end  结束执行");
	}
	
	@Test
	public void msg() throws Exception{
		//https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN 
		
		mockMvc.perform(get("/va").param("name", "navalue")).andDo(print());
	}
	@Test
	public void l() throws Exception{
		//https://api.weixin.qq.com/cgi-bin/message/custom/send?access_token=ACCESS_TOKEN 
		
		mockMvc.perform(get("/l")).andDo(print());
		mockMvc.perform(get("/dva")).andDo(print());
		System.out.println("得到返回值--------------");
		mockMvc.perform(get("/dva")).andReturn();
		
	}
	
	@Test
	public void bin() throws Exception{
		mockMvc.perform(get("/bin")
				.param("name", "ui").param("age", "12"))
		.andDo(print());
	}
	
	@Autowired
	private MockHttpServletRequest request;
	
	@Test
	public void u() {
		System.out.println("获取得到的请求信息  "+request);
		System.out.println(request.getContentLength());
		
		request.setParameter("name", "namevalue");
		request.setParameter("age", "23");
		
		System.out.println("name value "+request.getParameter("name"));
		System.out.println("age value"+request.getParameter("age"));
		
		request.setAttribute("at1", "at1value");
	}
	
	
	@Test
	public void s()  throws Exception {
		System.out.println("进行单元测试 start  ");
		mockMvc.perform(get("/stest")).andDo(print());
		System.out.println("进行单元测试  end ");
	}
}

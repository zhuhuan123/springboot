package o.control;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import o.mod.Bea;
import o.mod.MS;
import o.mod.MyVa;

@Controller
public class OtC {

	
	@Autowired
	private MS ms;
	
	@ResponseBody
	@RequestMapping(value="dap")
	public void d() {
		ApplicationContext applicationContext=this.ms.getAc();
		Bea bea = (Bea)applicationContext.getBean("bea");
		System.out.println("ͬ��  ȡ����ֵΪ  "+bea.ge());
		System.out.println("��ֵ���͵�����Ϊ  "+bea.ma());
		System.out.println("�����㷨����ִ��--------------");
		bea.se();
	}



	public MS getMs() {
		return ms;
	}



	public void setMs(MS ms) {
		this.ms = ms;
	}
	
	@ResponseBody
	@RequestMapping(value="geMyV")
	public MyVa m() {
//		geMyVa
		return bea.geMyVa();
	}
	
	@Autowired
	private Bea bea ;
	
	@RequestMapping(value="al")
	public void o(HttpServletResponse response) throws Exception{
		PrintWriter out = response.getWriter();
		out.println("<script>alert('java')</script>");
	}
	@RequestMapping(value="alnew")
	public void on(HttpServletResponse response) throws Exception{
		PrintWriter out = response.getWriter();
		out.println("<script>alert('java')</script>");
		out.println("<script>window.open('index.jsp')</script>");
	}
	@RequestMapping(value="alnews")
	public void onse(HttpServletResponse response) throws Exception{
		PrintWriter out = response.getWriter();
//		out.println("h");
		System.out.println("------new -----");
		out.println("<script>window.open('index.jsp')</script>");
	}
	
	@RequestMapping("dva")
	@ResponseBody
	public void d(HttpServletResponse response) throws Exception{
		PrintWriter out = response.getWriter();
		out.print(" redis host redis  host ���� "+redishost);
		return ;
	}
	
	@Value("${redis.host}")
	String redishost;
	
	@ResponseBody
	@RequestMapping(value="stest")
	public String s() {
		
		return ""+redishost;
	}
	
	@ResponseBody
	@RequestMapping(value="l")
	private String l() {
		return "st";
	}
	
	@RequestMapping(value="are")
	public void a() {
		RestTemplate res = new RestTemplate();
//		res.
	}
}

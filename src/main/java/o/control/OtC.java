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
		System.out.println("同个  取出的值为  "+bea.ge());
		System.out.println("数值类型的数据为  "+bea.ma());
		System.out.println("采用算法进行执行--------------");
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
		out.print(" redis host redis  host 配置 "+redishost);
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

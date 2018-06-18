package o.control;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;

public class Ma {
	public static void main(String[] args) throws Exception {
		
		Ma ma = new Ma();
		ma.g();
	}
	
	public void g()  throws Exception{
		HttpClient http = new DefaultHttpClient();
		HttpGet g = new HttpGet("http://www.baidu.com"); 
		HttpResponse re = http.execute(g);
		System.out.println("string 类型的值为  "+re.toString());
		
		HttpEntity t = re.getEntity();
		InputStream in = t.getContent();
		InputStreamReader inp = new InputStreamReader(in,"utf-8");
		BufferedReader buf = new BufferedReader(inp);
		String l = buf.readLine();
		while(l!=null) {
			System.out.println(l);
			l = buf.readLine();
		}
//		HttpClient
		
	}
	
	public void s() throws Exception{
		HttpClient c = new DefaultHttpClient();
		HttpPost po = new HttpPost("http://www.baidu.com");
		HttpResponse res = c.execute(po);
		HttpEntity he = res.getEntity();
		InputStream in = he.getContent();
		InputStreamReader hi = new InputStreamReader(in);
		BufferedReader buf = new BufferedReader(hi);
		String l = buf.readLine();
		while(l!=null) {
			System.out.println(l);
			l = buf.readLine();
		}
		in.close();
		hi.close();
	}
	
}

package o.mod;

import java.net.URI;
import java.net.URL;
import java.util.Random;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class Lt {

	public static String getStartURLToGetCode() {
		  
		 String takenUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect";
		 takenUrl= takenUrl.replace("APPID", "");
//		 takenUrl= takenUrl.replace("REDIRECT_URI", URI.create(""));
		 //FIXME �� snsapi_userinfo
		 takenUrl= takenUrl.replace("SCOPE", "snsapi_userinfo");
		 System.out.println(takenUrl);
		 return takenUrl;
		 }
	
	public static void main(String[] args) {

		Random random = new Random();
		System.out.println("�����������Ϊ "+random.nextInt(10));
		
		boolean b = random.nextBoolean();
		System.out.println("�����������ֵΪ "+b);
		
		StringBuilder st= new StringBuilder();
		st.append("1");
		st.append("2");
		st.append("3");
		for(int u=4;u<10;u++) {
			st.append(u);
		}
		System.out.println("ƴ���ַ���Ϊ "+st.toString());
		
	}
	
	void d() {
		String s = getStartURLToGetCode();
		System.out.println("string �ַ���Ϊ "+s);
		
		String o="ad%s";
		o = String.format(o, "zhu");
		
		System.out.println("�滻����ַ���Ϊ "+o);
		
		
		String on ="%s say hello to %s";
		on= String.format(on, "zhu","hel");
		System.out.println("targ is  �õ���Ŀ������Ϊ  "+on);
		
		String sp="{\"ret\":0,\"msg\":\"�ɹ�\",\"continueDays\":0,\"nickName\":\"��������һ\",\"today\":0,\"iconUrl\":\"http://img001.21cnimg.com/photos/album/20160308/o/46A5E145001544F4AA5680EE0478A5AA.jpeg\"}";
		JSONObject js = JSONObject.parseObject(sp);
		Object sname = js.get("nickName");
		Object msg = js.get("msg");
		
		System.out.println("ȡ����ֵΪ  "+sname+"\n  ��Ϣ������Ϊ "+msg);
		
		Per per = new Per();
		per.setAge(12);
		per.setName("am");
		String str = JSON.toJSONString(per);
		System.out.println(str);
		
		ThreadLocal t = new ThreadLocal();
		t.set(1);
		
		System.out.println("ȡ��ֵ "+t.get());
		String st = JSONObject.toJSONString(per);   //���ַ�תΪjson ��ʽ��
		System.out.println("תΪ��json �ַ���Ϊ "+st);
		
		
		System.out.println("--------------------------");
		JSONObject my = JSONObject.parseObject(st);
		Object agr = my.get("age");
		System.out.println("ȡ�õ�ֵΪ "+agr);
		System.out.println("name "+my.get("name"));
		
//		String ll ="ab";

	}

}

class Per{
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
}
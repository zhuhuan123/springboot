package o;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import o.mod.Foo;
import o.service.SavFoo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@WebAppConfiguration
public class OTes {
	 @Autowired
	    private WebApplicationContext wac;
	    private MockMvc mockMvc;
	    @Before
	    public void setup() {
	        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();   //����MockMvc
	    }
	    
	    @Autowired
	    private SavFoo savFoo;
	    
	    @Test
	    public void s() {
	    	Foo foo = new Foo();
	    	foo.setAge(12);
	    	foo.setName("zhang");
//	    	DataBin
//	    	Bind
//	    	savFoo.sav(foo);
	    }
}

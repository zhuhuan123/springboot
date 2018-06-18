package o.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;
import o.map.StMapp;
import o.mod.*;

@Component
@Transactional(rollbackFor=Exception.class)
public class StService {
	@Autowired(required=false)
	private StMapp stMapp;
	
	public List<St> geList(){
		return stMapp.fin();
	}
	
	public void sav(St st) {
		HashMap<String,Object> map = new HashMap<String,Object>();
		map.put("name", st.getName());
		map.put("id",st.getId());
		stMapp.ins(map);
	}
}

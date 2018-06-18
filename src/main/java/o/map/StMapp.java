package o.map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import o.mod.St;

import java.util.*;
//@Mapper
public interface StMapp {
//	@Select(value="select id,name from st")
	public List<St> fin();
	public void ins(Map<String,Object> map);
}

package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

//org.zerock.mapper.TimeMapper.getTime2 ->

public interface TimeMapper {

	//; 붙이면 안됨 
	@Select("select now()")
	public String getTime();

	
	public String getTime2();
}

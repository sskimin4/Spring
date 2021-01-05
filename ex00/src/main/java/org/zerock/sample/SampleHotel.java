package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@RequiredArgsConstructor
public class SampleHotel {

	private final Chef chef;
	
	/*
	//new를 할 때 class의 종속적인 일이 많이 일어남.
	public SampleHotel(Chef chef) {
		super();
		this.chef=chef;
		
	}
	*/
}

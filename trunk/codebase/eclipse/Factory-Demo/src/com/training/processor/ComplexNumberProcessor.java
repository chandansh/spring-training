package com.training.processor;

import com.training.num.Number;

public class ComplexNumberProcessor implements NumberProcessor {

	@Override
	public Number process(Number num) {
		System.out.println("do processing based on the complex number processing");
		return num;
	}

}

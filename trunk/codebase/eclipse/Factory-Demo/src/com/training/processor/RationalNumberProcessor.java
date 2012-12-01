package com.training.processor;

import com.training.num.Number;

public class RationalNumberProcessor implements NumberProcessor {

	@Override
	public Number process(Number num) {
		System.out.println("do processing based on the rational number processing");
		return null;
	}

}

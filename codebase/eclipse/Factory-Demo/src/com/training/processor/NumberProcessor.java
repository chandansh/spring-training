package com.training.processor;

import com.training.num.Number;

public interface NumberProcessor {
	public static final int RATIONAL_NUMBER_PROCESSOR = 1;
	public static final int COMPLEX_NUMBER_PROCESSOR = 2;

	public Number process(Number num);
}

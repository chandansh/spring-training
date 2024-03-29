package com.training.processor;

import java.util.HashMap;
import java.util.Map;

public class NumberProcessorFactory {

	private static Map<Integer, NumberProcessor> objMap = new HashMap<Integer, NumberProcessor>();

	static {
		objMap.put(NumberProcessor.RATIONAL_NUMBER_PROCESSOR,
				new RationalNumberProcessor());
		objMap.put(NumberProcessor.COMPLEX_NUMBER_PROCESSOR,
				new ComplexNumberProcessor());
	}

	public static NumberProcessor getNumberProcessor(int numberProcessorType) {
		return objMap.get(numberProcessorType);
	}

}

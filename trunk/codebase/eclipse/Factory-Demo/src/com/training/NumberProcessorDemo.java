package com.training;

import java.util.ArrayList;
import java.util.List;

import com.training.num.Number;
import com.training.num.NumberFactory;
import com.training.processor.NumberProcessor;
import com.training.processor.NumberProcessorFactory;

public class NumberProcessorDemo {
	public static void main(String[] args) {
		List<Number> numberList = new ArrayList<Number>();
		numberList.add(NumberFactory.createNewNumber(Number.COMPLEX, 4, 5));
		numberList.add(NumberFactory.createNewNumber(Number.COMPLEX, 6, 7));
		numberList.add(NumberFactory.createNewNumber(Number.RATIONAL, 3, 4));
		numberList.add(NumberFactory.createNewNumber(Number.RATIONAL, 8, 9));

		for(Number num: numberList){
			NumberProcessor processor = NumberProcessorFactory.getNumberProcessor(num.getNumberType());
			processor.process(num);
		}
	}
}

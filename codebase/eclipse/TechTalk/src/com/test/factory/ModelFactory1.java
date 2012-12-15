package com.test.factory;

import com.test.model.Model;
import com.test.model.Model1;
import com.test.model.Model2;

public class ModelFactory1 {

	public Model createModel() {
		return new Model();
	}

	public Model1 createModel1() {
		return new Model1();
	}

	public Model2 createModel2() {
		return new Model2();
	}

}

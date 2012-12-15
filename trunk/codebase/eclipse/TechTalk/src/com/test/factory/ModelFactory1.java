package com.test.factory;

import com.test.model.Model;
import com.test.model.Model1;
import com.test.model.Model2;

public class ModelFactory1 {
	Model model;
	Model1 model1;
	Model2 model2;
	
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Model1 getModel1() {
		return model1;
	}

	public void setModel1(Model1 model1) {
		this.model1 = model1;
	}

	public Model2 getModel2() {
		return model2;
	}

	public void setModel2(Model2 model2) {
		this.model2 = model2;
	}

	
	
	public Model createModel() {
		return model;
	}

	public Model1 createModel1() {
		return model1;
	}

	public Model2 createModel2() {
		return model2;
	}

}

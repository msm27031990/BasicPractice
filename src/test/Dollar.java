package test;

import test.Currency;

public class Dollar extends Currency {
	double value;

	public Dollar () {
	description = "Dollar";
	}

	public double cost(double v){
	value=v;

	return value;

	}

	}
package com.example.hello.Test;

public class Operations {
	
	public Float add(Float val1, Float val2) {
		return val1 + val2;
	}
	
	public Float sub(Float val1, Float val2) {
		return val1 - val2;
	}
	
	public Float mul(Float val1, Float val2) {
		return val1 * val2;
	}
	
	public Float div(Float val1, Float val2) throws Exception {
		if(val2 == 0)
			throw new Exception("il denominatore deve essere diverso da 0");
		return val1 / val2;
	}
	
}

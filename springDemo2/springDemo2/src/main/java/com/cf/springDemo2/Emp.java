package com.cf.springDemo2;

import java.util.ArrayList;
import java.util.Map;

public class Emp
{
	
	//private ArrayList<Integer> a;
	private Map<Integer, Emp1> m;
	
	public Emp() {
		System.out.println("Emp obj created");
	}

//	public ArrayList<Integer> getA() {
//		return a;
//	}
//
//	public void setA(ArrayList<Integer> a) {
//		this.a = a;
//	}
	

	public Map<Integer, Emp1> getM() {
		return m;
	}

	public void setM(Map<Integer, Emp1> m) {
		this.m = m;
	}

	@Override
	public String toString() {
		return "" + m ;
	}
	
	
}

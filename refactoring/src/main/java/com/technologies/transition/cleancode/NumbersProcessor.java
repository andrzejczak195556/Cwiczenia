package com.technologies.transition.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NumbersProcessor {

	Map<Integer, Integer> __1 = new HashMap<Integer, Integer>();
	private int minValue = Integer.MIN_VALUE;
	private int maxValue = Integer.MAX_VALUE;
	
	public NumbersProcessor(List<Integer> integerList) {
		p(integerList);
	}
	
	public NumbersProcessor() {
		
	}
	
	public void p(List<Integer> integerList) {
		int i = 0;
		for (; i < integerList.size(); i++) {
			p(integerList.get(i));
		}
		
	}
	
	public void p(Integer key) {
		if (__1.containsKey(key)) {
			Integer keyValue = __1.get(key);
			__1.put(key, keyValue +1);
		} else {
			__1.put(1, 1);
		}
		
		if (key > maxValue) {
			maxValue = key;
		}
		
		if (key < minValue) {
			minValue = key;
		}
	}
	
	public int getValueOfKey(int key) {
		if (__1.containsKey(key)) {
			return __1.get(key);
		} else {
			return 0;
		}
	}
	
	public double dothis() {
		
		double jk = 0;
		double p = 0;
		
		for (Entry<Integer, Integer> u : __1.entrySet()) {
			p += u.getValue();
			jk += u.getKey() * u.getValue();
		}
		
		return jk/p;
	}
	
	public int getMinValue() {
		return minValue;
	}
	
	public int getMaxValue() {
		return maxValue;
	}
	
}

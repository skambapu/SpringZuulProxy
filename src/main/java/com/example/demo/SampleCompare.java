package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SampleCompare {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("1");
		list1.add("3");
		list1.add("2");
		list1.add("7");
		list1.add("4");
		List<String> list2 = new ArrayList<>();
		list2.add("1");
		list2.add("5");
		list2.add("2");
		list2.add("9");
		list2.add("4");
		//printUniqueElements(list1, list2);
	}

	private static void printUniqueElements(List<Map<String,String>> list1, List<Map<String,String>> list2) {
		List<Map<String,String>> combinedList = new ArrayList<>();
		Map<String, Integer> map = new HashMap<>();
		//Map<String, String> map1 = new HashMap<>();

		//combinedList.addAll(list1);
		//combinedList.addAll(list2);
		for (Map<String,String> map1 : combinedList) {
			for(Entry<String, String> e: map1.entrySet()) {
				if(map.containsKey(e.getValue())) {
					int count = map.get(e.getValue());
					map.put(e.getValue(), ++count);
				} else {
					map.put(e.getValue(), 1);
				}
			}
			
		}
		
		List<String> output1 = new ArrayList<>();
		List<String> output2 = new ArrayList<>();
		for(Entry<String, Integer> entry: map.entrySet()) {
			if(entry.getValue().intValue() == 1) {
				if(list1.contains(entry.getKey())) {
					output1.add(entry.getKey());
				} else if(list2.contains(entry.getKey())) {
					output2.add(entry.getKey());
				}	
			}
		}
		System.out.println(output1 + "-" + output2);
	}

}

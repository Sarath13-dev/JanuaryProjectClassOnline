package org.login;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Company {
public static void main(String[] args) {
	
	String s ="Java Application";
	char[] c = s.toCharArray();
	Map<Character, Integer>m = new LinkedHashMap();
	for (int i = 0; i < c.length; i++) {
		if(m.containsKey(c[i])) {
			Integer d = m.get(c[i]);
			m.put(c[i], d+1);
		}
		else {
			m.put(c[i], 1);
		}
	}
	Set<Entry<Character, Integer>> entrySet = m.entrySet();
	for (Entry<Character, Integer> entry : entrySet) {
		if(entry.getKey()=='a') {
			System.out.println(entry);
		}
	}
	
}
	
}

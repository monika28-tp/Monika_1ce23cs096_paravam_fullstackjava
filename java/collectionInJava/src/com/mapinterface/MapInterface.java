package com.mapinterface;

import java.util.HashMap;
import java.util.Map;
public class MapInterface {
public static void main(String[] args) {
	Map<Integer,String>map=new HashMap<Integer,String>();
	map.put(1, "apple");
	map.put(2, "ball");
	System.out.println(map);
	System.out.println(map.get(1));
}
}

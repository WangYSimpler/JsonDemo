package com.simple.demo.jsonDemo;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JsonDemo {
	public static void main(String[] args) {
		///输出求和时，存在字符，那么结果都转换成字符进行转化
		System.out.println("6"+5);
		
		///1、map转化成json
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("12", "ab");
		System.out.println("this is a map ："+map1);
		
		String mapToJson = ((new Gson()).toJson(map1));
		System.out.println("this is json from map" + mapToJson);
		
		///1.2 反向生成List
		Map<String, String> reMap = (new Gson()).fromJson(mapToJson,new TypeToken<Map<String,String>>() {}.getType() );
		System.out.println("1.2 this is gson to map: " + reMap);
		
		
		///2 list to json
		List<String> list1 = new ArrayList<String>();
		list1.add("a1");
		list1.add("b2");
		///输出list结果
		for(String str :list1)
		{
			System.out.println("this is list String :" + str);
		}
		
		String listToJson = (new Gson()).toJson(list1);
		System.out.println("this is to json" + listToJson);
		
		///2.2 gson to List
		
		List<String> reList = (new Gson()).fromJson(listToJson,new TypeToken<List<String>>() {}.getType());
		System.out.println(reList);
		
		///3 list<map<String,String>> to json
		Map<String,String> map2 = new HashMap<String,String>();
		map2.put("123", "asd");
		Map<String,String> map3 = new HashMap<String,String>();
		map3.put("456", "qaz");
		List<Map<String,String>> mList = new ArrayList<>();
		mList.add(map2);
		mList.add(map3);
		String mapListToJson = ((new Gson()).toJson(mList));
		System.out.println("3 this is json from List<map>:" + mapListToJson);
		///3.2 reListMap 
		
		List<Map<String, String>> reMapList = (new Gson()).fromJson(mapListToJson, new TypeToken<List<Map<String, String>>>(){}.getType());
		
		System.out.println("json to List<Map<String,String>> :" + reMapList);
	}
	
}

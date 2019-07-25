package mapscollections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsPractice {

	

	public static void main(String[] args) {
	//Webdriver driver + new ChromeDriver():
		//WEbdriver is interface --> ChromeDriver is a class

		
		// Maps is interface --> HashMap is class 
		
		Map<String, String> map1 = new HashMap<>();
		Map<Integer, String> map2 = new HashMap<>();
		Map<Integer, Integer> map3 = new HashMap<>();
		Map<String, String> map4 = new HashMap<>();
		
		Map<String, Integer> shopping = new  HashMap<>();
		shopping.put("Tomatoes", 7);
		shopping.put("Cucumbers", 1);
		shopping.put("Milk", 2);
		shopping.put("Bananas", 5);
		
		System.out.println("How many tomatoes " + shopping.get("Tomatoes"));
		System.out.println("How many tomatoes " + shopping.get("Milk"));
		System.out.println("Remove Bananas "  + shopping.remove("Bananas"));
		
		shopping.put("apples", 6);
				
		// replace 
		shopping.replace("apples", 7);
		System.out.println(shopping.get("apples"));
		
		System.out.println(shopping.size());
		
		// containsKey, containsvalue 
		
		if (shopping.containsKey("apples")) {
			System.out.println("Got apples");
		}
		else {
			System.out.println("Forgot to grt apples");
		}
			
		for(String key: shopping.keySet()) {
			System.out.println(key);
		}
		for(Integer values : shopping.values()) {
			System.out.println(values);
		}
		
		System.out.println("...............................");
		
		Map<Integer, String> Zipcodes = new TreeMap<>();
		

		Zipcodes.put(12345, "Brooklyn, NY");
		Zipcodes.put(221025, "Tysons, VA");
		Zipcodes.put(22043, "Falls Church, VA");
		
		
		for(Integer zipcode : Zipcodes.keySet()) {
			System.out.println(zipcode);
		}
	}
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	



package MyCodes.java.features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

	public static void main(String[] args) {
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		items.forEach((k,v)-> System.out.println("Item : " + k + " Count : " + v));
	/*	
		for (Map.Entry<String, Integer> entry : items.entrySet()) {
			System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
		}
		
		for ( String key: items.keySet()){
			System.out.println(items.get(key));
		}*/
		
		System.out.println("----------------List------------------");
		List<String> items1 = new ArrayList<>();
		items1.add("A");
		items1.add("B");
		items1.add("C");
		items1.add("D");
		items1.add("E");

/*		//lambda
		//Output : A,B,C,D,E
		items1.forEach(item->System.out.println(item));

		//Output : C
		items1.forEach(item->{
			if("C".equals(item)){
				System.out.println(item);
			}
		});*/

		//method reference
		//Output : A,B,C,D,E
		items1.forEach(System.out::println);
        System.out.println("-----------------------");
		//Stream and filter
		//Output : B
		items1.stream()
			.filter(s->s.contains("B"))
			.forEach(System.out::println);
		
		Double d1 = 123d;
		
		
	}

}

package com.infy.task.one;

import java.util.*;

public class OrderProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,OrderSummary> hmap = new HashMap<>();
		List<Order> list1= new ArrayList<>();
		
		Order order1 = new Order();
		order1.setItem1("item1");
		order1.setItem2("item2");
		
		Order order2= new Order();
		
		order2.setItem3("item3");
		
		Order order3=new Order();
		
		order3.setItem2("item2");
		
		Order order4 = new Order();
		
		order4.setItem1("item1");
		order4.setItem2("item2");
		
		list1.add(order1);
		list1.add(order2);
		list1.add(order3);
		list1.add(order4);
		
		/*
		 * for(Order o: list1) { System.out.println(o.getItem1() + o.getItem2() +
		 * o.getItem3() + o.getItem4()); }
		 */
		TreeMap<Integer,String> tmap=new TreeMap();
		OrderSummary os1 =countOfItem("item1", list1);
		hmap.put("item1", os1);
		tmap.put(os1.getUsageCount(), "item1");
		OrderSummary os2 =countOfItem("item2", list1);
		hmap.put("item2", os2);
		tmap.put(os2.getUsageCount(), "item2");
		OrderSummary os3 =countOfItem("item3", list1);
		hmap.put("item3", os3);
		tmap.put(os3.getUsageCount(), "item3");
		OrderSummary os4 =countOfItem("item4", list1);
		hmap.put("item4", os4);
		tmap.put(os4.getUsageCount(), "item4");
		ArrayList<String> topList=new ArrayList<String>();
		
		int loopCount=0;
		for(Map.Entry<Integer, String> result : tmap.entrySet())
		{
			loopCount++;
			if(loopCount>tmap.size()-2) {
			//System.out.println(result.getValue() + tmap.size());
			topList.add(result.getValue());
			}
		}
		for(Map.Entry<String, OrderSummary> result : hmap.entrySet())
		{
			
			if(topList.get(0).equals(result.getKey()) || topList.get(1).equals(result.getKey()) ) {
				//System.out.println(result.getKey() +"-->" +result.getValue().getOrderNames() +"-->"+ result.getValue().getUsageCount());
				System.out.println(result.getKey() +"-->" + " usageCount: "+ result.getValue().getUsageCount()+"; corresponding orders: "+result.getValue().getOrderNames());
			}
		}
		


}
	public static OrderSummary countOfItem(String itemName, List<Order> list1)
	{
		OrderSummary os = new OrderSummary();
		int count =0;
		List<String> orderNames = new ArrayList<>();
		/* TreeMap<Integer,String> tmap=new TreeMap(); */
		if(list1.get(0).toString().contains(itemName))
		{
			count++;
			orderNames.add("order1");
		}
		if(list1.get(1).toString().contains(itemName))
		{
			count++;
			orderNames.add("order2");
		}
		if(list1.get(2).toString().contains(itemName))
		{
			count++;
			orderNames.add("order3");
		}
		if(list1.get(3).toString().contains(itemName))
		{
			count++;
			orderNames.add("order4");
		}
			os.setOrderNames(orderNames);
			os.setUsageCount(count);
			/* tmap.put(os.getUsageCount(),itemName); */
			
		return os;
		
	}
	
}


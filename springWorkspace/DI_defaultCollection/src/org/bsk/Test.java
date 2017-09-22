package org.bsk;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	
	private Vector fruits;
	private TreeSet cricketers;
	private Hashtable cc;
	
	
	
	
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}




	public void setCricketers(TreeSet cricketers) {
		this.cricketers = cricketers;
	}




	public void setCc(Hashtable cc) {
		this.cc = cc;
	}




	public void getDetails(){
		
		
		System.out.println("FRUITS****************");
		
		for(Object fruit:fruits){
			System.out.println(fruit);
		}
		System.out.println("CRICKETERS****************");
		
		for(Object cricketer:cricketers){
			System.out.println(cricketer);
		}
		
		System.out.println("Country AND capital****************");
		 Set keys= cc.keySet();
		for(Object key:keys){
			System.out.println(key+"   "+cc.get(key));
		}
	}
	

}

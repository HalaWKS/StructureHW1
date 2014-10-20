package exercise4;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();  
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("5");
		
		int size = calSize(list);
		System.out.println(size);
		
	}

	public static int calSize(LinkedList<String> list){
	      if(list.isEmpty()){
	    	   return 0; 
	      }
	      else{
	           list.pop(); 
	           return 1 + calSize(list);
	      }
	 }
	
}

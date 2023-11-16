package DesignPattern;

import java.util.Currency;

public class factoryClass {
	
	          public currency  getFactoryObject(String name){
	        	  
	        	  if(name.equals("india")) {
	        		  return new Inda();
	        	  }
	        	  else if(name.equals("usa")) {
	        		  return new Usa();
	        	  }
				return null;
	            	
	            	
	            }
	          
	          public static void main(String[] args) {
				
	        	  factoryClass fc = new factoryClass();
	        	currency ind = fc.getFactoryObject("india");
	        	ind.getCurrency();
			}

}

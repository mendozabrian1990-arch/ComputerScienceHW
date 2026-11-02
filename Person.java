package edu.monmouth.lab1;

public class Person {
	private String name;
	private static String DEFAULT_NAME = "UNKNOWN";
	
	public Person () {
		setName(name);
	}
	
	public Person(String name) {
		setName(name);
	}
	
	public String getName() {
		return name; 
	}
	
	public void setName(String name) {
		if (name==null)  {
			this.name=DEFAULT_NAME;
		}else if (name.length()==0) {
			this.name=DEFAULT_NAME;
		}else {
		this.name=name; 
		}
	}
	
	public boolean isNameLong() {
		if(this.name.length() > 7) {
			return true;
		}
		return false;
		
	}
		
}

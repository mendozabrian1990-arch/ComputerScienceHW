package edu.monmouth.lab1;

public class Lab1 {

	public static void main(String[] args) {
		Person person1=new Person();
		System.out.println(person1.getName());
		System.out.println(person1.isNameLong());
		
		
		System.out.println("\nThis is the results for Rolf");
		Person person2= new Person("Rolf");
		System.out.println(person2.getName());
		System.out.println(person2.isNameLong());
		
		System.out.println("\nThis is the results for Ebenezer");
		Person person3= new Person("Ebenezer");
		System.out.println(person3.getName());
		System.out.println(person3.isNameLong());
		
		System.out.println("\nThis is the results for Alexander");
		Person person4= new Person("Alexander");
		System.out.println(person4.getName());
		System.out.println(person4.isNameLong());
		
		System.out.println("\nThis is the results for null");
		Person person5= new Person(null);
		System.out.println(person5.getName());
		System.out.println(person5.isNameLong());
		
		System.out.println("\nThis is the results for ''");
		Person person6= new Person("");
		System.out.println(person6.getName());
		System.out.println(person6.isNameLong());
		
		String value = new String("Monmouth University");
		System.out.println("\nThis is the number of Character in the string : " + value.length());
		System.out.println("First Character: " + value.charAt(0) + " Last Character: " + value.charAt(18));
		
		if (value.charAt(2) == 'N') {
			System.out.println("true");
		}else {
			System.out.println("False");
		}
		
		/*if (value.matches((String)value.charAt(9))) {
			System.out.println("Digit");
		}else {
			System.out.println("Letter");
		}*/
	
		double odd = 0;
		for (int i = 6; i<14; i++) {
			if (!(i%2==0)) {
				odd = odd + i;
			}
		}
		System.out.println("\nThe sum off all odd numbers was " + odd);
		
		String value1 = new String ("devlos melborp");
		for (int i=13; i>0; i--) {
			System.out.println(value1.charAt(i));
		}
		
		
	}

}

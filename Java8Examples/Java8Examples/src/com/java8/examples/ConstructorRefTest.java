package com.java8.examples;


public class ConstructorRefTest {

	public static void main(String[] args) {		
		PersonFactory<PersonDetails> personFactory = PersonDetails::new;
		PersonDetails personD = personFactory.create("Raj","Kinnera");
		System.out.println(personD);
		Converter<String, String> converter = personD::startsWithWhatLetter;
		String converted = converter.convert("ExamplesJava8");
		System.out.println(" Converted Starts with "+converted); 
	}
}
// class for person details
class PersonDetails {
    String first_Name;
    String last_Name;
PersonDetails(String first_Name, String last_Name) {
        this.first_Name = first_Name;
        this.last_Name = last_Name;
    }
	@Override
	public String toString() {
		return "Person's firstName= " + first_Name + ", lastName= " + last_Name;
	}
	public String startsWithWhatLetter(String str) {
        return String.valueOf(str.charAt(0));
    }
}
interface PersonFactory<PF extends PersonDetails> {
    PF create(String firstName, String lastName);
}
@FunctionalInterface
interface Converter<G, H> {
    H convert(G from);
}
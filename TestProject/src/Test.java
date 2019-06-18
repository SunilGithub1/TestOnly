
public class Test {
	
	String name;
	String comp;
	 String home;

	public static void main(String[] args) {
		
		Test Employee1 = new Test();
		Employee1.name = "sunil";  //CREATING EMPLOYEE OBJECTS FOR THREE  
		
		Test Employee2 = new Test();
		Employee2.name = "santosh";
		
		Test Employee3 = new Test();
		Employee3.name = "Rajashree";
		
		Test company1 = new Test();  //CREATING COMPANY OBJECT FOR ALL
		company1.name = "mahindra";
		
		Test company2 = new Test();
		company2.name = "FIS";
		
		Test company3 = new Test();
		company3.name = "oracle";
		
		Test address1com = new Test();
		address1com.comp = "arena";
		
		Test address2com = new Test();
		address2com.comp = "whitefield";
		
		Test address3com = new Test();
		address3com.comp = "kadubisinahalli";
		
		Test address1hom = new Test();
		address1hom.home = "BVS";
		
		Test address2hom = new Test();
		address2hom.home = "pinnacle";
		
		Test address3hom = new Test();
		address3hom.home = "BVS2";
		
		System.out.println("first name is :" +Employee1.name);
		System.out.println("second name is :" +Employee2.name);
		System.out.println("third name is :" +Employee3.name);
		
		System.out.println("first company name is :" +company1.name);
		System.out.println("second company name is :" +company2.name);
		System.out.println("third company name is :" +company3.name);
		
		System.out.println("first company address is :" +address1com.comp);
		System.out.println("second company address is :" +address2com.comp);
		System.out.println("third company address is :" +address3com.comp);
		
		System.out.println("first home address is :" +address1hom.home);
		System.out.println("second home address is :" +address2hom.home);
		System.out.println("third home address is :" +address3hom.home);
	
	}
}





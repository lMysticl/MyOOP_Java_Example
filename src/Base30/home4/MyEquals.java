package home4;

public class MyEquals {

	public static void main(String[] args) {		
		Employee  e1 = new Employee ();
		Employee  e2 = new Employee ();

        e1.setId(100);
        e2.setId(100);
        //Печатает false в консоли
        System.out.println(e1.equals(e2));
	
	
	}
}

package Action02;

public class MainBase {
	 public static void main(String[] args) {
		  Base base = new Base();
		  base.print();
		  System.out.println("true="+base.auth("user4", null));
		  System.out.println("true="+base.auth("user2","1"));
		  System.out.println("false="+base.auth("user2","X"));
		  System.out.println("false="+base.auth("userX","1"));
		  System.out.println("true="+base.auth1("user4", null));
		  System.out.println("true="+base.auth1("user2","1"));
		  System.out.println("false="+base.auth1("user2","X"));
		  System.out.println("false="+base.auth1("userX","1"));  
		 }
}

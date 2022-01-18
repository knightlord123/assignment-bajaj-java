package bajaj_java_assignment;

public class leap_year {

	public static void main(String[] args) {
		int year=2000;
		boolean flag=false;
		 if (year % 400 == 0) {flag= true;}
		 else if (year % 100 == 0) {flag= false;}
		 else if (year % 4 == 0)
		        flag=true;
		   
		
		if(flag) {System.out.println("leap");}
		else {System.out.println("not leap");}

	}

}

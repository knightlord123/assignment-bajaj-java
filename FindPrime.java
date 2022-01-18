package bajaj_java_assignment;
public class FindPrime {

	public static void main(String[] args) {
		int a=7;
		int i;
		boolean flag=false;
		
		
		for(i=2;i<=a/2;i++) {
			if(a%i==0) {flag=true;}
		}
		if(flag) {System.out.println("not Prime");}
		else {System.out.println("Prime");}
		
		// TODO Auto-generated method stub

	}

}
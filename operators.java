package bajaj_java_assignment;

public class operators {
	public static void main(String[] args) {
	int a=30,b=20;
	//relational
	if(a==b) {System.out.println("equal");}
	if(a>b) {System.out.println("a greater than b");}
	if(a>=b) {System.out.println("a greater than equal to b");}
	if(a<b) {System.out.println("a less than b");}
	if(a<=b) {System.out.println("a less than equal to b");}
	if(a!=b) {System.out.println("a greater than b");}

	
	//logical
	if(3>2 && 50>8) {System.out.println("And operator");}
	if(3>2 || 5>8) {System.out.println("Or operator");}
	if(!(5>8)) {System.out.println("Not operator");}
	
	//shift
	int c=3;
	System.out.println(c>>1);//right shift
	System.out.println(c<<1);//left shift
	System.out.println(c>>>1);//unsigned right shift

	}
	}
	


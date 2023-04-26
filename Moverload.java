package methodOverloading;
//7. method overloading

public class Moverload {

	static int add(int a,int b) {
		return (a+b);
	}
	static int add(char a,char b) {
		return a+b;
	}
	
	static float add(float a,float b) {
		return  a+b;
	}
	
	static double add(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10,20));
		System.out.println(add('a','z'));
		System.out.println(add(0.9999,0.0001));
		
		

	}

}

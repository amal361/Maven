package overload;

public class MethodOverLoading {
	public int add(int a, int b) {
		int c = a + b;
		System.out.println("sum of int = " +c);
		return c;
	}

	public float add(float d, float e) {
		float f = d + e;
		System.out.println("sum of float = " +f);
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverLoading ob=new MethodOverLoading();
		int c=ob.add(150, 200);
		MethodOverLoading ob1=new MethodOverLoading();
		float f=ob1.add(15.5f, 25f);
	}

}

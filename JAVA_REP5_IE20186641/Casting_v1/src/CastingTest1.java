class SuperClass {
	int a;
	int b;
	public SuperClass () {
		a = 1;
		b = 2;
	}
}

class Sub1 extends SuperClass {
	int c;
	int d;
	public Sub1(int x, int y) {
		c = x;
		d = y;
	}
}

class Sub2 extends SuperClass {
	int c;
	int d;
	int e;
	public Sub2(int x, int y, int z) {
		c = x;
		d = y;
		e = z;
	}
}

class Sub3 extends SuperClass{
	double c;
	double d;
	public Sub3(double x, double y) {
		c = x;
		d = y;
	}
}

	public class CastingTest1 {

		public static void Func(SuperClass ob) {
			System.out.printf("SuperClass 객체 : a = %d,  b = %d  \n",
					ob.a, ob.b);
		}
		public static void Func1(Sub1 ob) {
			System.out.printf("Sub1 객체 : a = %d,  b = %d,  c = %d,  d = %d\n",
					ob.a, ob.b, ob.c, ob.d);
		}
		public static void Func2(Sub2 ob) {
			System.out.printf("Sub2 객체 : a = %d,  b = %d,  c = %d,  d = %d, e = %d\n",
					ob.a, ob.b, ob.c, ob.d, ob.e);
		}
		public static void Func3(Sub3 ob) {
			System.out.printf("Sub3 객체 : a = %d,  b = %d,  c = %f,  d = %f\n",
					ob.a, ob.b, ob.c, ob.d);
		}
	
	public static void main(String[] args) {
		SuperClass obj = new SuperClass();
		Func(obj);

		Sub1 obj1 = new Sub1(10, 20);
		Func1(obj1);

		Sub2 obj2 = new Sub2(30, 40, 50);
		Func2(obj2);

		Sub3 obj3 = new Sub3(1.1, 2.2);
		Func3(obj3);
	}
}
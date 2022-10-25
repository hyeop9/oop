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

	public class CastingTest3 {

		public static void Func(SuperClass tmpObj){
			if (tmpObj instanceof SuperClass && tmpObj instanceof Sub1) {
				Sub1 ob = (Sub1) tmpObj;
				System.out.printf("Sub1 객체 : a = %d,  b = %d,  c = %d,  d = %d\n",
					ob.a, ob.b, ob.c, ob.d);
			}
			else if (tmpObj instanceof SuperClass && tmpObj instanceof Sub2) {
				Sub2 ob = (Sub2) tmpObj;
				System.out.printf("Sub2 객체 : a = %d,  b = %d,  c = %d,  d = %d, e = %d\n",
					ob.a, ob.b, ob.c, ob.d, ob.e);
			}
			else if (tmpObj instanceof SuperClass && tmpObj instanceof Sub3) {
				Sub3 ob = (Sub3) tmpObj;
				System.out.printf("Sub3 객체 : a = %d,  b = %d,  c = %f,  d = %f\n",
					ob.a, ob.b, ob.c, ob.d);
			}
			else
				System.out.printf("SuperClass 객체 : a = %d,  b = %d  \n",
					tmpObj.a, tmpObj.b);
		}

	public static void main(String[] args) {
		SuperClass obj = new SuperClass();
		Func(obj);

		Sub1 obj1 = new Sub1(10, 20);
		Func(obj1);

		Sub2 obj2 = new Sub2(30, 40, 50);
		Func(obj2);

		Sub3 obj3 = new Sub3(1.1, 2.2);
		Func(obj3);
	}
}
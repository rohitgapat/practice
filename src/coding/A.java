package coding;

class A {
    final int x;

    public A() {
        this.x = 10;
        System.out.println(x);
    }

    public A(int n) {
        this.x=n;
        System.out.println(x);
    }
    
    public static void main (String [] arg) {
    	A a = new A();
    	A a1 = new A(5);
    }
}

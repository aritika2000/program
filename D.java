class A {
int num;
void set() {
num=100;
}
void get() {
System.out.println(num);
}
void myfun() {
System.out.println("A");
}
}
class B extends A {
int data;
void fun1() {
data=500;
}
void display() {
System.out.println(num+" "+data);
}
void myfun() {
System.out.println("B");
}
}
class X extends B {
void myfun() {
System.out.println("X");
}
}
class D
{
public static void main (String[] args) {
A a = new A();
B b = new B();
X x = new X();
A ob;
ob = a;
ob.myfun();
ob=b;
ob.myfun();
ob=x;
ob.myfun();
}
}
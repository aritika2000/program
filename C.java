class A {
int num;
void set() {
num=100;
}
void get() {
System.out.println(num);
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
}
class C
{
public static void main (String[] args) {
A a;
B b = new B();
a = (A) b;
a.set();
a.get();
}
}

 
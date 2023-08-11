package riding;

public class Person1 extends Person2{
public void education() {
	System.out.println("Computer Science");
}
public void age() {
	System.out.println(21);
}
public static void main(String[] args) {
	Person1 obj1=new Person1();
	Person2 obj2=new Person2();
	obj1.education();
	obj2.education();
	obj1.age();
	obj2.age();
}
}

class student
{
String name;
int USN;
String gender;
int age;
void eat()
{
System.out.println("Student is eating");
}
void sleep()
{
System.out.println("Student is sleeping");
}
void study()
{
System.out.println("Student is studying");
}
}

class StudentApp
{
public static void main(String []args)
{
student s1=new student();
student s2=new student();
student s3=new student();
s1.eat();
s2.sleep();
s3.study();
new student().study();
s1.name="Megha";
s1.age=21;
s1.gender="female";
s1.USN=53;
s2.name="teddy";
s2.age=22;
s2.gender="male";
s2.USN=51;
s3.name="nammu";
s3.age=20;
s3.gender="female";
s3.USN=90;
System.out.println("Name of student 1="+s1.name);
System.out.println(s1.USN);
System.out.println(s1.age);
System.out.println(s1.gender);
System.out.println(s2.name);
System.out.println(s2.USN);
System.out.println(s2.age);
System.out.println(s2.gender);
System.out.println(s3.name);
System.out.println(s3.USN);
System.out.println(s3.age);
System.out.println(s3.gender);
}
}

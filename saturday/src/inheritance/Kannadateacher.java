package inheritance;
class Teacher
{
String designation = "Teacher";
String collegename = "Vvpuramcollege";
void does()
{
	System.out.println("teaching");
}
}
public class Kannadateacher extends Teacher
{
	String mainSubject = "kannada";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Kannadateacher obj = new Kannadateacher();
System.out.println(obj.collegename);
System.out.println(obj.designation);
System.out.println(obj.mainSubject);
obj.does();
	}

}

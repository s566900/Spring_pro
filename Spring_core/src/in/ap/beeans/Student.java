package in.ap.beeans;

public class Student
{
	  private String name;
	   private int rollno;
	   String name1=null;
	 public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	 public void display()
	   {
		   System.out.println("Name :"+name);
		   System.out.println("Rollno :"+rollno);
		   
	   } 
	   
   }

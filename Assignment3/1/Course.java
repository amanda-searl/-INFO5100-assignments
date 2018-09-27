package Assignment3;

public class Course {

	private String name;
	private int numberOfStudent=0;
	private Student[] registeredStudent=new Student[10];
	Course(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public int getNumberOfStudent() {
		return numberOfStudent;
	}
	public Student[] getStudent() {
		return registeredStudent;
	}
	 public boolean isFull() {
		 if (numberOfStudent==10)
			 return true;
		 else
			 return false;
				 
	 }
	 
	 public void registerStudent(Student student) {
		 if(!isFull()) {
			 registeredStudent[numberOfStudent]=student;
			 numberOfStudent++;
		 }
		 else
			 System.out.println("the class is full");
	 }
	 
}

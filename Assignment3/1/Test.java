package Assignment3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Course java=new Course("java");
       Student a=new Student("emma","1");
       Student b=new Student("winifred","2");
       Student c=new Student("jessi","3");
       java.registerStudent(c);
       java.registerStudent(b);
       java.registerStudent(a);
       java.registerStudent(a);
       java.registerStudent(a);
       java.registerStudent(a);
       //java.registerStudent(a);
      //java.registerStudent(a);
       //java.registerStudent(a);
       //java.registerStudent(a);
       //java.registerStudent(a);java.registerStudent(a);
       Student[] students=new Student[10];
       students=java.getStudent();
       System.out.println(students[0].getName()+students[1].getName()+students[2].getName());
       
	}

}

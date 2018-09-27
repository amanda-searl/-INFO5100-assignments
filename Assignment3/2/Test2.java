package Assignment3;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PsychiatristObject exam=new PsychiatristObject();
		MoodyObject happy=new HappyObject();
		MoodyObject sad=new SadObject();
		exam.examine(sad);
		exam.observe(sad);
		exam.examine(happy);
		exam.observe(happy);

	}

}

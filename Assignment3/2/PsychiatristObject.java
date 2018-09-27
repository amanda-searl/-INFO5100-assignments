package Assignment3;

public class PsychiatristObject {
	public void examine(MoodyObject moodyObject) {
		System.out.println("How are you feeling today");
		moodyObject.queryMood();
		
	}
	public void observe(MoodyObject moodyObject) {
		moodyObject.expressFeelings();
		if(moodyObject.getMood()=="sad")
			System.out.println("Obsevation:Subject cries a lot");
		else
			System.out.println("Obsevation:Subject laughs a lot");
		
	}
}

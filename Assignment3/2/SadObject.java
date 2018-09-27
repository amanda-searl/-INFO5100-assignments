package Assignment3;


public class SadObject extends MoodyObject {

	
	
@Override
	protected String getMood(){

		return "Sad";
	}
   @Override 
	public void expressFeelings() {
		System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'");

	}

}

package StaticPolymorphism;

public class Overloading {

	//"" Static polymorphism , Compile Time polymorphism , Early Binding , Overloading "" 

	//Method name should be same & the changes are only in Parameters
	//Overloading should be happen within the Package

	//created  method called talk but the change is only in its passing parameters

	//** friedns , teacher , colleague are created as separate classes 

	public void talk(friends speakingstyle) {
		System.out.println("Speak Friendly");
	}
	public void talk(teacher speakingstyle ) {
		System.out.println("Speak Friendly");
	}
	public void talk(colleague speakingstyle) {
		System.out.println("Speak Sofltly");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Overloading Performs here 
		//Need to create an object for friends & pass the value talk
		
		Overloading talk = new Overloading();
		friends friend = new friends();
		
		//Need to  pass the value of friend into the object created for friend
		talk.talk(friend);
		
	}

}

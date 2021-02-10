
public class User {

	
		// TODO Auto-generated method stub
		//fields
		//methods
		public String name;
		
		//SPECIFYING A NAME WHEN CREATING A NEW USER
		public User(String name)
		{
			this.name= name;//sset the value of current object to name parameter
			//this refers to current object
			
		}
		public void sayHello()
		{
			System.out.println("hi my name is " + name);
		}

	

}

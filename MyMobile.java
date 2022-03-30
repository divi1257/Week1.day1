package week1.day1;

public class MyMobile {
	public String name ="Vivo";
	public long price = 14500l;
	
	public void makeCall()
	{
		System.out.println("Welcome");
	
	}
	
	public void sendMsg()
	{
		System.out.println("Good Morning");
	
	}

	public void details()
	{
		System.out.println("Have a Good Day");
	
	}
   public static void main(String[] args) {
	   MyMobile objMobile = new MyMobile();
	   System.out.println(objMobile.name);
	   System.out.println(objMobile.price);
	   objMobile.makeCall();
	   objMobile.sendMsg();
	   objMobile.details();
	   
	   
   }
}

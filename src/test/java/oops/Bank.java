package oops;
//Access  modifiers 
class Account {
	public String name;
	protected  String emailid;
	private String Password;
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}	
}	

 public class Bank {

	public static void main(String[] args) {
			Account a=new Account();
			a.name="Mani";
			a.emailid="inamreddy@gamil.com";
			a.setPassword("Mani@33");
			System.out.println(a.getPassword());
			
	}

}

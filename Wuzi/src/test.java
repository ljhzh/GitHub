
public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User(1,"ljh");
		if(user!=null) {
			System.out.println("you have login in " +user.getUname());
			chese.init(user);
		}
	}

}

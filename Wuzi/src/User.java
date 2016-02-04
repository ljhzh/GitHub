
public class User {
	
	private int uid;
	private String uname;
	private boolean good = false;
	
	public User(int uid,String uname) {
		this.uid = uid;
		this.uname = uname ;
	}

	public String getUname() {
		return uname;
	}
	
	public boolean UserStart() {
		this.good = true;
		return good;
	}
}

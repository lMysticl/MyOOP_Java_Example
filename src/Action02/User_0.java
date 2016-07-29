package Action02;

public class User_0 {
	private String login;
	private String pass;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", pass=" + pass + "]";
	}

	public User_0() {
		super();
	}

	public User_0(String login, String pass) {
		super();
		this.login = login;
		this.pass = pass;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		return result;

	}


	public int myHashCode() {
		int result = 1;
		if (login != null)
			result += login.hashCode();
		if (pass != null)
			result = 31 * result + pass.hashCode();
		return result;
	}



}

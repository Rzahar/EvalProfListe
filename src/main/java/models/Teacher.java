package models;

public class Teacher {
	private String name;
	private String password;
	private boolean admin = true;
	
	public Teacher (String name, String password, boolean admin) {
		this.name = name;
		this.password = password;
		this.admin = admin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
	
}

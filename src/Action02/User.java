package Action02;

public class User {
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

	 public User() {
	  super();
	 }

	 public User(String login, String pass) {
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

	 /*
	  * @Override public boolean equals(
	  * Object obj){ if(obj == null) return
	  * false; if(obj == this) return true; if(this.getClass() != obj.getClass())
	  * return false;
	  * 
	  * User user = (User) obj;
	  * 
	  * if(this.login == null){ return user.login==null; } else {
	  * if(!this.login.equals(user.login)) return false; }
	  * 
	  * if(this.pass == null){ return user.pass==null; } else {
	  * if(!this.pass.equals(user.pass)) return false; }
	  * 
	  * return true; }
	  */
	 class Car{
	  
	 }
	 public void example(Object obj){
	  if(obj instanceof Car){
	   
	  }
	 }
	 
	 @Override
	 public boolean equals(Object obj) {
	  if (this == obj) return true;
	  if (obj == null)return false;
	  if (getClass() != obj.getClass()) return false;
	  
	  User other = (User) obj;
	  if (this.login == null) {
	   if (other.login != null) return false;
	  } else if (!this.login.equals(other.login))
	   return false;
	  if (pass == null) {
	   if (other.pass != null) return false;
	  } else if (!pass.equals(other.pass))
	   return false;
	  
	  return true;
	 }
	 /*
	 public boolean equals(User user) {// NOT USED
	  return super.equals(user);
	 }
	 */
	 
	}

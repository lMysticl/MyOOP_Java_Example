/**/
package Action02;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Base {
 private Set<User> users = new HashSet<>();
 public Base(){
  users.add(new User("user1","1"));
  users.add(new User("user2","1"));
  users.add(new User(null,"1"));
  users.add(new User("user4",null)); 
  users.add(new User(null,"2"));
  users.add(new User("user5",null)); 
  users.add(new User(null,null));
  users.add(new User(null,null));  
 }
 public boolean auth(String login, String pass){
  Iterator<User> iter = users.iterator();
  while(iter.hasNext()){
   if(iter.next().equals(new User(login, pass))) return true;
  }
  return false;
 }
 public boolean auth1(String login, String pass){
  return users.contains(new User(login,pass));
 }
 public void print() {
  int i = 0;
  for(User user:users){
   System.out.println((++i)+""+user);
  }
 }

	public boolean auth2(String login, String pass) {
		boolean b = true;
		for (User i : users) {
			if (i.equals(new User(login,pass))) {
				b= true;
			} else {
				b=false;
			}
		}
		return b;
		}
	
	}


package Action02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class CollectionIterator {
	public static void main(String[] args) {
		Set<User> users = new HashSet<>();
		users.add(new User("user1", "1"));
		users.add(new User("user2", "1"));
		users.add(new User("user3", "1"));
		users.add(new User("user4", "1"));
		users.add(new User("user5", "1"));
		System.out.println("******");

		System.out.println(users);
		System.out.println("******");

		for (User user : users) {
			System.out.println(user);
		}
		System.out.println("******");

		Iterator<User> iter = users.iterator();
		while (iter.hasNext()) {
			User user = iter.next();
			System.out.println(user);
		}
		System.out.println("******");

		users.forEach(new Consumer<User>() {
			@Override
			public void accept(User temp) {
				temp.setLogin(temp.getLogin() + "=");
			}
		});
		users.forEach(new Consumer<User>() {
			@Override
			public void accept(User temp) {
				System.out.println(temp);
			}
		});
		System.out.println("******");
		users.forEach(temp -> {
			String str = temp.getLogin();
			int len = str.length();
			str = str.substring(0, len - 1);
			temp.setLogin(str);
		});
		users.forEach(temp -> System.out.println(temp));
	}
}

package week5.lesson10;

public class MainFirstList {
	public static void main(String[] args) {
		FirstList list = new FirstList();
		System.out.println("size1=" + list.size());

		list.add(new Element(10));
		Element obj1 = list.get(0);
		System.out.println("size2=" + list.size() + ", el=" + obj1.getValue());

		list.add(new Element(20));
		Element obj2 = list.get(1);
		System.out.println("size3=" + list.size() + ", el=" + obj2.getValue());
	}

	static class FirstList {
		private Element first;

		public void add(Element el) {
			Element act = first;
			act = act.getNext();
			act = act.getNext();
			if (first != null) {
				Element last = first;
				while (last.getNext() != null) {
					last = last.getNext();

				}
			}
		}

		public void add(int value) {

		}

		public int size() {

			return 0;
		}

		public Element get(int index) {

			return null;
		}

	}

	static class Element {
//		private Element next;
		private int value;

		public Element(int v) {
			value = v;
		}

		public Element getNext() {
			return null;
		}

		public int getValue() {
			return value;
		}
	}
}
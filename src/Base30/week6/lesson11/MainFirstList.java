package week6.lesson11;

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
		private Element tail;

		public void add(Element el) {
			if (first == null) {
				first = el;
				tail = el;
			} else {
				Element last = first;

				while (last.getNext() != null) {
					last = last.getNext();
				}
				last.setNext(el);
			}
		}

		public void add(int val) {
			add(new Element(val));
		}

		public int size() {
			if (first == null)
				return 0;
			int size = 1;
			Element last = first;
			while (last.getNext() != null) {
				last = last.getNext();
				size++;
			}
			return size;
		}

		public Element get(int index) {
			int k = index;
			Element actual = first;
			while (k > 0 && actual.getNext() != null) {
				actual = actual.getNext();
				k--;
			}
			return actual;
		}

		public Element getPriv(int index) {
			int k = index;
			Element actual = first;
			while (k > 0 && actual.getNext() != null) {
				actual = actual.getNext();
				k = k - 2;
				if (k <= 0) {
				}
			}
			return actual;
		}

		public Element getTail() {
			return tail;
		}

		public void setTail(Element tail) {
			this.tail = tail;
		}

	}

	static class Element {
		private Element next;
		private int value;

		public Element(int v) {
			value = v;
		}

		public int getValue() {
			return value;
		}

		public Element getNext() {
			return next;
		}

		public void setNext(Element next) {
			this.next = next;
		}

	}
}

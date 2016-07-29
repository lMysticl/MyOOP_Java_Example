package DoubleList;

public class MainDoubleList {

	public static void main(String[] args) {
		DoubleList list = new DoubleList();
		
		System.out.println("size1=" + list.size());

		list.add(new Element(10));

		Element obj1 = list.get(0);
		System.out.println("size2=" + list.size() + ", el=" + obj1.getValue());

		list.add(new Element(20));

		Element obj2 = list.get(1);
		
		System.out.println("size3=" + list.size() + ", el=" + obj2.getValue());

		list.add(new Element(30));

		Element obj3 = list.get(2);
		System.out.println("size4=" + list.size() + ", el=" + obj3.getValue());

		list.add(new Element(40));

		Element obj4 = list.get(3);
		System.out.println("size4=" + list.size() + ", el=" + obj4.getValue()+"\n"+obj4.getPriv());
	}

	public static class DoubleList {
		private Element first;

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

		public void add(int val) {
			add(new Element(val));
		}
		public void add(Element el) {
			if (first == null) {
				first = el;
			
			} else {
				Element last = first;
		//		Element priv = null ;
				while (last.getNext() != null) {
					last = last.getNext();
			//		priv = first;

				}
				last.setNext(el);
				
			}
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
	}

	static class Element {
		private Element next;
		private int value;
		private Element priv;
		public Element(int v) {
			value = v;
		}

		public int getValue() {
			return value;
		}

		public Element getNext() {
			return next;
		}
		
		public Element getPriv() {
			return priv;
		}
		public void setNext(Element next) {
			this.next = next;
		}
		public void setPriv(Element priv) {
			this.priv = priv;
		}

	}

}

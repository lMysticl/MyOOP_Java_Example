/*������ 2. �������� �����, 
 ������� ����� ������� � ���� ������ ����� ����� ������ (int, long etc.). 
 ����������� �����, ������� ���������� ����� ������� ������� �� �������.*/
package week7.lesson13;

public class AllTypes {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AllTypes[] massive = new AllTypes[10];
		Decision<AllTypes> obj = new Decision<>(massive);
		
	}
}

class Decision<T> {
	T[] arr;

	public Decision(T[] arr) {
		this.arr = arr;
	}

	public T get(int k) {
		if (arr != null)
			return null;
		return arr[k];
	}

}

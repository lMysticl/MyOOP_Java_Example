package Binary;

	public class BinaryTree {
	    public static void main(String[] args) {
	        // ������, � ������� ����� ������������ �����
	        int[] mas = new int[]{1, 1, 1, 2, 2, 2, 3, 4, 5};
	        System.out.println("��������������� ������� ������:");
	        for (int element : mas)
	            System.out.print(element + " ");
	        System.out.println();
	        // ������� (����), ������� ����
	        int search = 2;
	        System.out.println("����� " + search + " ������� � ������� " + binarySearch(mas, search));
	    }
	 
	    public static int binarySearch(int[] a, int key) {
	       int lo = 0;
	        int hi = a.length - 1;
	        while (lo <= hi) {
	            if (a[hi] == key)
	                return hi;
	            int mid = lo + (hi - lo) / 2;
	            if (key < a[mid]) hi = mid - 1;
	            else {
	                if (key > a[mid])
	                    lo = mid + 1;
	                else {
	                    lo = mid;
	                    hi--;
	                }
	            }
	        }
	        return -1;
	    }
	 
	}
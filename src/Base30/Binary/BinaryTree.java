package Binary;

	public class BinaryTree {
	    public static void main(String[] args) {
	        // массив, в котором будем осуществлять поиск
	        int[] mas = new int[]{1, 1, 1, 2, 2, 2, 3, 4, 5};
	        System.out.println("Отсортированный входной массив:");
	        for (int element : mas)
	            System.out.print(element + " ");
	        System.out.println();
	        // элемент (ключ), который ищем
	        int search = 2;
	        System.out.println("Число " + search + " найдено в позиции " + binarySearch(mas, search));
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
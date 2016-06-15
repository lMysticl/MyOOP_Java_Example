package week7.lesson13;

public class JenericMethods {
    public static <T> void swap (T[] a, int x, int y) {
        T temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    public static void swap (String[] a, int x, int y) {
        String temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    public static void swap (Double[] a, int x, int y) {
        Double temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }    
    
    public static void main(String[] args) {
     String[] a = new String[10];
     swap (a, 1, 2);
  
     Integer[] b = new Integer[10];
  JenericMethods.<Integer>swap (b, 1, 2);
  
 }
}
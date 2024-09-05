package practice;
import java.util.*;
public class Array_List_Java {

	public static void main(String[] args) {
//		ArrayList<Integer> l1 = new ArrayList<>();
//		ArrayList<Integer> l2 = new ArrayList<>();
LinkedList<Integer> l1 = new LinkedList<>();
LinkedList<Integer> l2 = new LinkedList<>();
		l2.add(15);
		l2.add(26);
		l2.add(27);
        l1.add(6);
        l1.add(7);
        l1.add(8);
        l1.add(6);
        l1.add(2,4);
        l1.add(2,3);
        l1.addAll(0,l2);
        System.out.println(l1.contains(5));
        System.out.println(l1.lastIndexOf(6));
        l1.remove(2);
        System.out.println(l1.size());
        l1.set(1,152);
//        l1.clone();
        l1.addLast(5);
        l1.addFirst(2);
        
for(int i = 0;i<l1.size();i++) {
        	System.out.print(l1.get(i));
        	System.out.print(" ");
        }
	}
}

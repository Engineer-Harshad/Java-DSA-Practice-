package practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;

public class Practice_Advancejava {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		a.add("0");
		a.add("1");
		a.add("2");
		
		for(Object o:a) {
			System.out.println(o);
		}
		
		HashSet<Integer> s = new HashSet();
		s.add(6);
		s.add(8);
		s.add(5);
		System.out.println(s);
		
		
		// Q3
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
	
		LocalDateTime t = LocalDateTime.now();
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy H:m:s");
		DateTimeFormatter f2 = DateTimeFormatter.ISO_LOCAL_TIME;
				String str = t.format(f);
		System.out.println(str);
		String str2 = t.format(f2);
		System.out.println(str2);
	}
}

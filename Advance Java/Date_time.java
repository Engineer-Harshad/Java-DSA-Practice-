package practice;
// import java.util.GregorianCalendar;
// import java.util.TimeZone;
// import java.util.TimeZone;
// import java.time.LocalDate;
// import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Date_time {

	public static void main(String[] args) {
	//	System.out.println(System.currentTimeMillis());
//        Date d = new Date();
//        System.out.println(d);
//        System.out.println(d.getTime());
//        System.out.println(d.getDate());
//        System.out.println(d.getSeconds());
//        System.out.println(d.getYear());
		
//     	Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"));
//		System.out.println(c.getCalendarType());
//		System.out.println(c.getTimeZone().getID());
//		System.out.println(c.get(Calendar.DATE));
//		System.out.println(c.get(Calendar.HOUR));
//		System.out.println(c.get(Calendar.SECOND));
//		System.out.println(c.get(Calendar.DATE));
//		System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) +":"+ c.get(Calendar.SECOND));
//		
//		GregorianCalendar cal = new GregorianCalendar();
//		System.out.println(cal.isLeapYear(2023));
//		
//		System.out.println(TimeZone.getAvailableIDs()[0]);
		
//		LocalDate d = LocalDate.now();
//		System.out.println(d);
//		LocalTime t = LocalTime.now();
//		System.out.println(t);
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy E H:m a");
		DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
		String MyDate = dt.format(df);
		System.out.println(MyDate);
		
	}

}

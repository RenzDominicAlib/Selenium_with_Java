package dayOneLesson;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_class {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date presentDate = new Date();
		System.out.println(presentDate.toString());
		
		
		// https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd G 'at' HH:mm:ss z");
		System.out.println(sdf1.format(presentDate));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("EEE, MMM d, ''yy");
		System.out.println(sdf2.format(presentDate));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("h:mm a");
		System.out.println(sdf3.format(presentDate));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("hh 'o''clock' a, zzzz");
		System.out.println(sdf4.format(presentDate));
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("K:mm a, z");
		System.out.println(sdf5.format(presentDate));
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
		System.out.println(sdf6.format(presentDate));
		
		SimpleDateFormat sdf7 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
		System.out.println(sdf7.format(presentDate));
		
		SimpleDateFormat sdf8 = new SimpleDateFormat("yyMMddHHmmssZ");
		System.out.println(sdf8.format(presentDate));
		
		SimpleDateFormat sdf9 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		System.out.println(sdf9.format(presentDate));
		
		SimpleDateFormat sdf10 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
		System.out.println(sdf10.format(presentDate));
		
		SimpleDateFormat sdf11 = new SimpleDateFormat("YYYY-'W'ww-u");
		System.out.println(sdf11.format(presentDate));
	}

}

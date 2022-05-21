package Java8;

import java.time.*;


    public class TestDateTime{
	
	public static void main(String [] args){
	
	  LocalDateTime dt = LocalDateTime.now();
	  
	  System.out.println(dt);
	  
	  // get date, month and year from date instance...
	  
	  int dd = dt.getDayOfMonth();
	  int mm = dt.getMonthValue();
	  int yy = dt.getYear();
	  
	  System.out.printf("%d-%d-%d",dd,mm,yy);
	  System.out.println();
	  
	  // get hour, minute, seconds and nanoseconds value...
	  
	  int hr = dt.getHour();
	  int m  = dt.getMinute();
	  int s  = dt.getSecond();
	  int ns = dt.getNano();

      System.out.printf("%d:%d:%d:%d",hr,m,s,ns);
	  System.out.println();
	 
	 
	  // finding duration between current date and a particular date

      LocalDate today = LocalDate.now();
      LocalDate birthday = LocalDate.of(1998,8,17);
	  Period p = Period.between(birthday, today);
	  
	  System.out.printf("AGE is %d YEARS %d DAYS %d", p.getYears(), p.getMonths(), p.getDays());
	   System.out.println();


	   // finding zoned date time 
	   
	   ZoneId zi = ZoneId.systemDefault();
	  // default time zone 
   
        System.out.println(zi);   
	    System.out.println();
		
		 ZoneId zChina = ZoneId.of("America/Los_Angeles");
		 ZonedDateTime zt = ZonedDateTime.now(zChina);
		 System.out.println(zt);
	
	}
	
	}
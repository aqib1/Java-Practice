import java.time.*;

public class MainClass {
public static void main(String[] args) {
//	Calendar c= Calendar.getInstance();
//	c.set(2015, 1, 11);
//	System.out.println(c.getTime());
	
//	LocalDate
//	LocalTime
//	LocalDateTime
	LocalTime time=LocalTime.now();
	time=time.plusHours(12);
	System.out.println(time);
}
}

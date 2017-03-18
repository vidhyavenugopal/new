package sample23;

import org.joda.time.LocalTime;
public class helloworld {
public static void main(String[] args)
{
	LocalTime currentTime = new LocalTime();
	System.out.println("The current local time is:" + currentTime);
greeting gre = new greeting();
System.out.println(gre.greet());
}

}
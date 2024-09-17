package time;

public class Main {
  public static void main(String[] args) {
    Time time = new Time(13, 27, 6);
    TimeByte timeByte = new TimeByte();

    displayTimeByte("After timebyte object is created.", timeByte);

    displayTime("After time object is created", time);
    System.out.println();

    displayTime("After calling setTime", time);
    System.out.println();

    
    try {
      Time time2 = new Time(99,99,99); // all values out of range
    } catch(IllegalArgumentException error) {
      System.out.printf("Exception: %s%n%n", error.getMessage());
    }

    displayTime("After calling setTime with invalid values", time); // values unchanged
  }

  private static void displayTime(String header, Time time) {
    System.out.printf("%s%n Universal time: %s%n Standard time: %s%n", header,
                      time.toUniversalString(), time.toString());
  }

  private static void displayTimeByte(String header, TimeByte time) {
    System.out.printf("%s%n Universal time: %s%n Standard time: %s%n", header,
                      time.toUniversalString(), time.toString());
  }
}

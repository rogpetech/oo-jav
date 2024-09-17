package time;

public class Time {
  // state (attributes/atributos)
  private int hour; // 0 - 23
  private int minute; // 0 - 59
  private int second; // 0 - 59
  private int amPmHour = (hour == 0 || hour == 12) ? 12 : (hour % 12);
  private String amPm = (hour < 12) ? "AM" : "PM";


  Time() {
    this.hour = 0;
    this.minute = 0;
    this.second = 0;
  }

  Time(int hour) {

    if(hour < 0 || hour >= 24) {
      throw new IllegalArgumentException("Invalid hour.");
    }

    this.hour = hour;
    this.minute = 0;
    this.second = 0;
  }

  Time(int hour, int minute) {

    if(hour < 0 || hour >= 24) {
      throw new IllegalArgumentException("Invalid hour.");
    }

    if(minute < 0 || minute >= 60) {
      throw new IllegalArgumentException("Invalid minute.");
    }

    this.hour = hour;
    this.minute = minute;
    this.second = 0;
  }

  Time(int hour, int minute, int second) {
    
    if(hour < 0 || hour >= 24) {
      throw new IllegalArgumentException("Invalid hour.");
    }

    if(minute < 0 || minute >= 60) {
      throw new IllegalArgumentException("Invalid minute.");
    }

    if(second < 0 || second >= 60) {
      throw new IllegalArgumentException("Invalid second.");
    }

    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public String toUniversalString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }

  public String toString() {
    return String.format("%02d:%02d:%02d %s", amPmHour, minute, second, amPm);
  }

}

package time;

public class TimeByte {
  // state (attributes/atributos)
  private final byte MIDDLE_HOUR = 12;
  private final byte INITIAL_HOUR = 0;
  private final byte MAX_HOUR = 24;
  private final byte MAX_MINUTE = 60;
  private final byte MAX_SECOND = 60;
  private final byte MIN_MINUTES = 0;

  private byte hour; // 0 - 23
  private byte minute; // 0 - 59
  private byte second; // 0 - 59
  private byte amPmHour = (hour == INITIAL_HOUR || hour == MIDDLE_HOUR) ? MIDDLE_HOUR : ((byte) (hour % MIDDLE_HOUR));
  private String amPm = (hour < 12) ? "AM" : "PM";

  public TimeByte() {
    this.hour = 0;
    this.minute = 0;
    this.second = 0;
  }

  public TimeByte(int hour) {
    this.hour = (byte) hour;
    this.minute = 0;
    this.second = 0;
  }

  public TimeByte(int hour, int minute) {
    this.hour = (byte) hour;
    this.minute = (byte) minute;
    this.second = 0;
  }

  public TimeByte(int hour, int minute, int second) {
    this.hour = (byte) hour;
    this.minute = (byte) minute;
    this.second = (byte) second;
  }

  // action verbs (methods/métodos)
  public void setTime(byte hour, byte minute, byte second) {
    if(hour < INITIAL_HOUR || hour >= MAX_HOUR || minute < MIN_MINUTES || minute >= MAX_MINUTE || second < MIN_MINUTES || second >= MAX_SECOND) {
      throw new IllegalArgumentException("Invalid hour, minute, or second.");
    }

    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public String toUniversalString() {
    return String.format("%02d:%02d:%02d%n", hour, minute, second);
  }

  public String toString() {
    return String.format("%02d:%02d:%02d %s", amPmHour, minute, second, amPm);
  }

}

package time;

public class ThisTest {
  public static void main(String[] args) {
    SimpleTime time = new SimpleTime(15, 30, 19);
    System.out.println(time.buildString());
  }
}

class SimpleTime {
  private int hour;
  private int minute;
  private int second;

  public SimpleTime(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  public String buildString() {
    return String.format("%s: %s%n %s: %s",
    "this.toUniversalString()", this.toUniversalString(), "toUniversalString()", toUniversalString());
  }

  private String toUniversalString() {
    return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
  }
}
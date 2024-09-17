package composition;

public class Date extends Object{
  private byte month;
  private byte day;
  private short year;

  private static final int[] daysPerMonth = 
    {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  public Date(int month, int day, int year) {
    if(month <= 0 || month > 12) {
      throw new IllegalArgumentException("month (" + month + ") must be 1-12");
    }

    if(day <= 0 ||
       (day > daysPerMonth[month] && !(month == 2 && day == 29))) {
        throw new IllegalArgumentException("day (" + day +
          ") out-of-range for the specified month and year");
       }
    
    if(month == 2 && day == 29 && !(year % 400 == 0 || 
      (year % 4 == 0 && year % 100 != 0))) {
        throw new IllegalArgumentException("day (" + day +
          ") out-of-range for the specified month and year");
    }

    this.month = (byte) month;
    this.day = (byte) day;
    this.year = (short) year;
  }

  @Override
  public String toString() {
    return String.format("%02d/%02d/%04d", month, day, year);
  }
}

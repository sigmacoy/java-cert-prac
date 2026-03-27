public class enums {
    public enum Days_Of_Week {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
  }

  public enum Weekend {
    SATURDAY,
    SUNDAY
  }


  public static void main(String[] args) {
    Days_Of_Week today = Days_Of_Week.MONDAY;
    System.out.println("Today is " + today); // Today is MONDAY

    Weekend day1 = Weekend.SATURDAY;
    System.out.println("First day of the weekend: " + day1); // First day of the weekend: SATURDAY    
  }
}
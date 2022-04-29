public class Main {
  public static void main(String[] args) {
    BonusService service = new BonusService();

    long amount = 1000_60;
    boolean registered = true;

    long factResult = service.calculate(amount, registered);

    int expected = 30;
    if (factResult == expected) {
      System.out.println("Проверка успешна!");
    }
  }

}


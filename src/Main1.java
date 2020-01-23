public class Main1 {
    public static void main(String[] args) {
      Days day = Days.Friday;
        switch (day){
            case Monday:
            case Wednesday:
            case Friday:
                System.out.println("В этот день есть учеба"); break;
            case Tuesday:
            case Thursday:
            case Saturday:
                System.out.println("Не учусь в этот день"); break;
            case Sunday:
                System.out.println("Воскресенье выходной");
            default:
                System.out.println("Такого дня не существует");
        }
    }
}

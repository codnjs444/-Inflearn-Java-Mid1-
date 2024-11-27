package enumeration.ref3;


public class EnumRefMain3_4 {
    public static void main(String[] args) {
        int price = 30000;
        Grade[] grades = Grade.values();

        for (Grade grade : grades) {
            printDiscount(grade,price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 할인 금액 : " + grade.discount(price));
    }
}

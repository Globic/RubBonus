public class RubBonus {
    public static void main(String[] args) {
        int balance = 100;
        int rubBonus = 1100;
        int totalSum = balance + rubBonus;
        System.out.println("Баланс пополения" + totalSum + "рублей");
        int bonus = rubBonus / 100 / 10;
        if (rubBonus < 1000) {
            bonus = 0;
        }
        System.out.println("Ваш бонус" + bonus);
        System.out.println("Всего" + (totalSum + bonus) + "рублей");

    }
}

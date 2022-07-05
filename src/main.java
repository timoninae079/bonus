public class main {
    public static void main(String[] args) {
        int score = 300;
        int theAmount = 1100;

        int bonus;
        if (theAmount > 1000) {
            bonus = theAmount / 100;
        } else {
            bonus = 0;
        }

        int finalScore = score + theAmount;
        System.out.println("На текущем счёте клиента:" + finalScore);
        System.out.println("Бонусов:" + bonus);

    }
}


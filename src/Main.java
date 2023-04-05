public class Main {
    public static void main(String[] args) {
        int account = 50; // сумма на счету клиента
        int payment = 14_350; // сумма платежа
        int reward = 1; // размер вознаграждения, начисляемый за каждые 100 пополненных рублей

        if (payment > 1_000) {
            int bonus = payment / 100 * reward;
            System.out.println("Количество бонусов:" + bonus);
            System.out.println("Итоговый счет:" + (account + payment + bonus));
        } else {
            int bonus = 0;
            System.out.println("Количество бонусов:" + bonus);
            System.out.println("Итоговый счет:" + (account + payment));
        }

    }
}
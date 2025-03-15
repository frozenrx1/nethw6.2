import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] products = {"Хлеб", "Яблоки", "Молоко"};
        int[] price = {60, 50, 80};
        int[] cart = new int[products.length];
        System.out.println("Список возможных товаров для покупки: ");

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + " - " + price[i] + " руб/шт.");
        }
        int sumProducts = 0;


        while (true) {
            int productNumber = 0;
            int productCount = 0;
            System.out.println("Выберите товар и количество через пробел, либо введите end");
            String input = scan.nextLine();
            if (input.equals("end")) {
                break;
            }
            String[] userInput = input.split(" ");
            productNumber = Integer.parseInt(userInput[0]);
            productCount = Integer.parseInt(userInput[1]);

            cart[productNumber - 1] += productCount;
            String product = products[productNumber - 1];
            int productPrice = price[productNumber - 1];
            int totalCost = productCount * productPrice;
            sumProducts += totalCost;

        }
        System.out.println("Ваша корзина: ");
        for (int i = 0; i < products.length; i++) {
            if (cart[i] > 0) {
                System.out.println(products[i] + " = " + cart[i] + "шт, " + price[i] + "руб/шт. " + (cart[i] * price[i]) + " в сумме. ");
            }

        }
        System.out.println("Общая сумма всех покупок: " + sumProducts);
        scan.close();
    }
}
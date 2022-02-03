package pl.am.module2.zadDomoweDrink;

public class Barman {
    public static Drink createDrink(String drinkName, String ingredient1, String ingredient2, String ingredient3) {
        Drink drink = new Drink();
        drink.drink = drinkName;
        return drink;
    }

    public static void main(String[] args) {

        Drink drink1 = createDrink("Aperol Spritz", "prosecco", "aperol", "woda gazowana");

        Drink drink2 = createDrink("Pina colada", "malibu", "mleko kokosowe", "sok ananasowy");

        System.out.println(drink1);
        System.out.println(drink2);
    }

}

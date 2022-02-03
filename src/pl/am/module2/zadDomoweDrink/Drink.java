package pl.am.module2.zadDomoweDrink;

public class Drink {

    String drink;
//    String drink2;
//    String drink3;


    Ingredient ingredient = new Ingredient();
    Barman bar = new Barman();
    public String toString() {
        /*mam problem z pobraniem składników z metody createDrink :( myślełem, że Barman.ingredient1 to pobierze,
        ale niestety nie mam dostępu do tych argumentów...
        */
        String drinkInfo = "Drink: " + drink;
        return drinkInfo;
    }

}


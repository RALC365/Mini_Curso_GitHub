package Builder;
/**
 *
 * @author ralc365
 */
public class SandwichMealBuilder implements MealBuilder{
    Meal meal = new Meal();
    public SandwichMealBuilder(){};

    @Override
    public void addSandwich(String sandwich) {
       meal.sandwich = sandwich;
    }

    @Override
    public void addSide(String sides) {
        meal.sideOrder = sides;
    }

    @Override
    public void addDrink(String drink) {
        meal.drink = drink;
    }

    @Override
    public void addOffer(String offer) {
        meal.offer = offer;
    }

    @Override
    public void setPrice(double price) {
        meal.price = price;
    }

    @Override
    public Meal getModel() {
        return meal;
    }

    //Este es un cambio que le acabod e hacer al archivo, solo para ver cómo trabaja Git
    //Y de pasi probar un poco de como trabaja VIM también
    //
    //
    //Estos son los 2dos cambias que hago al archivo para ver quee tal.

    //Este línea fue agregada para ser vista en la rama de pruebas

}

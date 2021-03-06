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

    //Estos cambios lo hice solo para ver cómo se hacen los cambios dentro de líneas intermedias


    @Override
    public void addOffer(String offer) {
        meal.offer = offer;
	//Comentario dentro del metodo
    }

    @Override
    public void setPrice(double precio) {
	//Comentarios dentro del metodo, se cambiaron los nombres de las variables de los parametros
        meal.price = precio;
    }

    @Override
    public Meal getModel() {
        return meal;
    }

    //Este es un cambio que le acabod e hacer al archivo, solo para ver cómo trabaja Git
    //Y de pasi probar un poco de como trabaja VIM también
    //
    // Ohhhhhhh ¡Qué genial! Acabo de cambiar de branch y también se hizo a nivel interno, o sea que, puedo tener un brach de "Producción" a nivel local y luego bajar solo la 
    // branch master de github y luego fusionar mi branch Producción fusionarla, ver si falla localmente sin necesidad de generar conflictos en GitHub 
    //
    //Estos son los 2dos cambias que hago al archivo para ver quee tal.

    //Este línea fue agregada para ser vista en la rama de pruebas

}

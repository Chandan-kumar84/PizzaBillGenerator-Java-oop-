public class PrimiumPizza extends Pizza {
    public PrimiumPizza( Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
       System.out.println(" Cheese Already Added");
    }

    @Override
    public void addExtraToppings() {
        System.out.println(" Toppings Already Added" );

    }
}

public class Pizza {
    private int price;
    private boolean veg;

    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int  bagPack = 20;

    private int vegPricepizza = 300;
    private  int nonVegPricePizza = 400;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isbagPackAdded = false;

    public Pizza(boolean veg) {
       this.veg = veg;
       if(this.veg){
           this.price = vegPricepizza;
       }else{
           this.price = nonVegPricePizza;
       }
    }
    public void addExtraCheese(){
        isExtraCheeseAdded =true;
        this.price += extraCheesePrice;

    }

    public void addExtraToppings(){
        isExtraToppingsAdded =true;
        this.price += extraToppingsPrice;



    }
    public void takeAway(){
        isbagPackAdded = true;
        this.price +=bagPack;

    }
    public void getBill(){
        String bill = "";

        System.out.println("Pizza :-" + vegPricepizza );
        if(isExtraCheeseAdded){
            bill+="Extra Cheese Added :-" + extraCheesePrice + "\n";

        }
        if(isExtraToppingsAdded){
            bill+="Extra Cheese Added :-" + extraToppingsPrice + "\n";

        }
        if(isbagPackAdded){
            bill+="Extra Cheese Added :-" + bagPack + "\n";

        }
        bill+= "Total Bill :-  "+this.price+ "\n";
        System.out.println(bill);

    }
}

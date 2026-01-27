package constructor_first_16_01_26;

public class Level2_4 {

    static void main(String[] args) {

        CartItem cartItem = new CartItem("Laptop",75000,1);
        cartItem.addItem(2);
        cartItem.removeItem(1);
        cartItem.disp();

        cartItem.removeItem(4);
        cartItem.disp();
    }

}

class CartItem{
    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price= price;
        this.quantity=quantity;
    }

    void addItem(int qty){

        if(qty>0){
            quantity +=qty;
            System.out.println("Quantity: "+ quantity);
        }
        else{
            System.out.println("Add again");
        }
    }
    void removeItem(int qty){
        if(quantity>=qty){
            quantity -=qty;
        }
        else{
            System.out.println("remove valid number of quantity");
        }
    }

    void disp(){
        double totalCost =quantity * price;
        System.out.println("TotalCost: "+totalCost);
    }

}
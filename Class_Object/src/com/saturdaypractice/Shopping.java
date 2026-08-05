package com.saturdaypractice;

//16. Shopping Cart
//Create Cart:
//Constructor → item price & quantity
//Method → calculate total bill
//Add discount if total > 5000

public class Shopping {

    int itemPrice;
    int quantity;

    public Shopping(int P, int Q) {
        this.itemPrice = P;
        this.quantity = Q;
    }

    public void calBill() {

        double total = itemPrice * quantity;

        if (total > 5000) {

            double discount = total * 10 / 100;
            double finalBill = total - discount;

            System.out.println("Total Bill: " + total);
            System.out.println("Discount: " + discount);
            System.out.println("Final Bill: " + finalBill);

        } else {
            System.out.println("Total Bill: " + total);
        }
    }
}
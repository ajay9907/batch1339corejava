package com.methodsPractice;
//E-commerce Discount
//Method calculateDiscount(double price) returns final price after discount.
public class Discount {
	int price,discount=1000,fprice;
	public int dis(int price)
	{
		fprice=price-discount;
		return fprice;
		
	}

}

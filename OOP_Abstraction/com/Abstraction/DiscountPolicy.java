package com.Abstraction;

//Online Shopping Discount
//Create interface DiscountPolicy with:
//method applyDiscount()
//Implement:
//FestivalDiscount
//MemberDiscount
// "If the product price is ₹1000 and the festival discount is 20%, & member discount is 10% print the final price."
public interface DiscountPolicy {

	public final double productAmount = 1000;
	int discount = 20;

	public abstract void applyDiscount(double productAmount);

}

package com.Abstraction;

public class FestivalDiscount implements DiscountPolicy {
	@Override
	public void applyDiscount(double productAmount) {
		if (productAmount >= 1000) {
			double finalAmount;
			finalAmount = productAmount - productAmount * discount / 100;
			System.out.println("Amount of product :" + productAmount);
			System.out.println("Applying Festival Discount is :" + discount + "%");
			System.out.println("Final Amount: " + finalAmount);
		} else {
			System.out.println("Not applying any Discount");
		}
	}
}

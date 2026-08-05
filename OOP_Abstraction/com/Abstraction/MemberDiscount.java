package com.Abstraction;

public class MemberDiscount implements DiscountPolicy {
	@Override
	public void applyDiscount(double productAmount) {
		int memberDiscount = 10;
		if (productAmount >= 1000) {
			double finalAmount;
			finalAmount = productAmount - productAmount * memberDiscount / 100;
			System.out.println("Product Amount is: " + productAmount);
			System.out.println("Applying Discount For Member:" + memberDiscount + "%");
			System.out.println("Final Amount :" + finalAmount);
		} else {
			System.out.println("Not applying any Discount");
		}
	}
}

package com.aurionpro.model;

public class WaterBillCalculator {
	private int unit;
	private static int unitBill;
	private static final int meterCharge=75;
	private static int totalBill;
	public static int totalBillCalaculator(int unit) {
		if(unit<=100) {
			unitBill = unit*5;
		}
		else {
			if(unit>100 && unit<=250) {
				unitBill = 100*5+(unit-100)*10;
			}
			else {
				unitBill = 100*5+(unit-100)*10;
			}
		}
		totalBill = unitBill+meterCharge;
		return totalBill;
	}
}

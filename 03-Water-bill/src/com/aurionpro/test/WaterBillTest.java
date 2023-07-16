package com.aurionpro.test;
import java.util.Scanner;
import com.aurionpro.model.WaterBillCalculator;
public class WaterBillTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		WaterBillCalculator obj = new WaterBillCalculator();
		System.out.println("welcome to Water Bill calaculator");
		System.out.println("enter your units : ");
		int unitConsumed = sc.nextInt();
		int totalBill = obj.totalBillCalaculator(unitConsumed);
		System.out.println("your water bill is : "+totalBill);
	}

}

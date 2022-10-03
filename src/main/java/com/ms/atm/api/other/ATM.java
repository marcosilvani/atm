package com.ms.atm.api.other;

public class ATM {

	private int money = 0;

	ATM(){
		money=0;
	}
	ATM(int amount){
		money = amount;
	}
	public void add(int amount){
		if (amount <=0){
			System.out.println("Error!");
		}
		else{
			money = money + amount;
		}
	}
	public void withdraw(int amount){
		if (amount > money || amount <= 0){
			System.out.println("unable to withdraw");
		}
		else{
			money = money - amount;
		}
	}
	public int getBalance(){
		return money;
	}
}
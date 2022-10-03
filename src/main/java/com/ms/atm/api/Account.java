package com.ms.atm.api;

public class Account {

	int number;
	int balance;

	public Account(int number, int balance) {
		this.number = number;
		this.balance = balance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
}

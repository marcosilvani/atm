package com.ms.atm.api.other;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		ATM theatm = null;

		int answer = 0;
		int amount = 500;
		boolean on = true;

		while (on) {
			System.out.println("1.Deposit\n2. Withdraw\n3. Balance\n4. Exit");
			answer = console.nextInt();

			if (answer == 1) {
				System.out.println("Amount to add: ");
				amount = console.nextInt();
				theatm.add(amount);

			}
			if (answer == 2) {
				System.out.println("Amount to withdraw: ");
				amount = console.nextInt();
				theatm.withdraw(amount);

			}
			if (answer == 3) {
				int balance = theatm.getBalance();
				System.out.println(balance);

			}
			if (answer == 4) {
				on = false;
				System.out.println("Quitting");
			}

		}
		console.close();
	}
	
}


	

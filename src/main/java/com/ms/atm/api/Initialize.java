package com.ms.atm.api;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/atm/api")
public class Initialize {

	@PUT
	@Path("/initialize")
	@Produces(MediaType.TEXT_PLAIN)
	public String initialize() {
		Account account_1 = new Account(123456789, 800);
		Account account_2 = new Account(987654321, 1230);

		ATM atm = new ATM(0, 0, 0, 10, 30, 30, 20);

		return "ATM Initialized with €" + atm.getTotalBalance() +
				"\nAccounts Created:\n"
				+ account_1.number + ", " + account_2.number;
	}

}

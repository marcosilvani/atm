package com.ms.atm.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/atm/api/account")
public class AccountFunctions {

	@PUT
	@Path("/create")
	@Produces(MediaType.TEXT_PLAIN)
	public String create() {
		return "Account Functions - create()";
	}

	@GET
	@Path("/count")
	@Produces(MediaType.TEXT_PLAIN)
	public String count() {
		return "Account Functions - count()";
	}
}
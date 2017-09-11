package com.iqmsoft.payara.soap;

import javax.ejb.Stateless;
import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
@Stateless
@HandlerChain(file = "/META-INF/handlers.xml")
public class TestService {

	@WebMethod
    public String halloWelt(@WebParam (name = "who") String who) {
        return "Hallo " + who;
    }
}

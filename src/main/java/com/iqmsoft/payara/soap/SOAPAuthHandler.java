package com.iqmsoft.payara.soap;

import java.util.Set;

import javax.ejb.EJB;
import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class SOAPAuthHandler implements
        SOAPHandler<SOAPMessageContext> {

	
	@EJB
	private TestService bean;
	
    @Override
    public Set<QName> getHeaders() {
        return null;
    }

    @Override
    public void close(MessageContext arg0) {
    }

    @Override
    public boolean handleFault(SOAPMessageContext arg0) {
        return false;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext smc) {
        System.out.println("Handler called");
        return true;
    }

}

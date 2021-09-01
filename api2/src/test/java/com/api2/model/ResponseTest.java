package com.api2.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 

public class ResponseTest {

 

	Response response;
    
    @BeforeEach
    public void setup() {
    	response = new Response();
    	response.setResponseType("True");
    	response.setResponseMessage("success");
    	
    }
    
    @Test
    public void getResponseType() {
        assertEquals("True", response.getResponseType(), "getId not implemented properly");
    }

 

    @Test
    public void getResponseMessage() {
        assertEquals("success", response.getResponseMessage(), "getProductId not implemented properly");
    }
 

}
package com.api2.schema;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.Date;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

 

public class ProductResponseTest {

 

	ProductResponse product;
    Date today = Date.valueOf(LocalDate.now());
    
    @BeforeEach
    public void setup() {
        product = new ProductResponse();
        product.setId(1);
        product.setProductId("A1");
        product.setProductName("Milk");
        product.setProductExpiryDate(today);


        
    }
    
    @Test
    public void getId() {

 

        assertEquals(1, product.getId(), "getId not implemented properly");
    }

 

    @Test
    public void getProductId() {
        assertEquals("A1", product.getProductId(), "getProductId not implemented properly");
    }

 

    @Test
    public void getProductName() {
        assertEquals("Milk", product.getProductName(), "getProductName not implemented properly");
    }

 

    @Test
    public void getProductExpiryDate() {
        assertEquals(today, product.getProductExpiryDate(), "getProductExpiryDate not implemented properly");
    }

 

    @Test
    public void toStringTest() {
        assertEquals("Product [id=1, productId=A1, productName=Milk, productExpiryDate=" + today + "]",
                product.toString(), "toString not implemented properly");
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import MediatorPattern.AmericanSeller;
import MediatorPattern.Buyer;
import MediatorPattern.DollarConverter;
import MediatorPattern.Mediator;
import MediatorPattern.SwedishBuyer;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Kurvin Hendricks
 */
public class MediatorPatternTest {
    
    public MediatorPatternTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         Mediator m = new Mediator();
         Buyer swed = new SwedishBuyer(m);
         float sellingPriceInDollars = 10.0f;
         AmericanSeller a = new AmericanSeller(m, sellingPriceInDollars);
         DollarConverter dc = new DollarConverter(m);
         
         float swedishBidKronor = 55.0f;
         while(!swed.attemptToPurchase(swedishBidKronor)){
             swedishBidKronor+=15.0f;
         }
         
         Assert.assertNotNull(m);
         Assert.assertNotNull(swed);
     }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}

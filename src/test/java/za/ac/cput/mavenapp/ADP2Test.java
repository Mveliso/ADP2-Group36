/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.mavenapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Mveliso Roto, 214211983
 */
public class ADP2Test {
    private String mark1, mark2;
    
    public ADP2Test() {
    }
    
      @BeforeEach
    public void setUp() {
       mark1 = new ADP();
    }
    
    @Test
    public void object_Equality() {
        assertEquals(term1, term2);
    }
    
    @Test
    public void Object_Identity() {
    }
    
  
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciocioobligatorio11;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jacobo
 */
public class factorialTest {
    
 
    @Test
    public void testFactoria() {
        
        
        System.out.println("factoria");
      
        Object resultadoObtenido;
        int num=-1;
        String resultadoEsperado="Esta función solo acepta números positivos o cero!!";
        
       factorial fac = new factorial();
       
       resultadoObtenido=factorial.factoria(num);
       assertTrue(resultadoObtenido instanceof String );
       assertEquals(resultadoEsperado, resultadoObtenido.toString());
       
       
  
        
    }
    
}

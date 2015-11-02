/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.applicationcomposermock.mock;

import org.waastad.applicationcomposermock.business.*;
import javax.inject.Inject;
import org.apache.openejb.jee.Beans;
import org.apache.openejb.jee.WebApp;
import org.apache.openejb.junit.ApplicationComposer;
import org.apache.openejb.testing.Classes;
import org.apache.openejb.testing.Module;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.waastad.applicationcomposermock.mock.qualifier.Alpha;
import org.waastad.applicationcomposermock.process.ProductionSms;
import org.waastad.applicationcomposermock.shopping.ProductionShopping;

/**
 *
 * @author helge
 */
@RunWith(ApplicationComposer.class)
public class BusinessBeanMockTest {

    public BusinessBeanMockTest() {
    }

    @Module
    @Classes(value = {BusinessBean.class, MockSmsBean.class, ProductionSms.class, MockShoppingBean.class, ProductionShopping.class}, cdi = true)
    public WebApp createWebApp() {
        return new WebApp().contextRoot("");
    }

    @Module
    public Beans getCdiConfig() {
        Beans beans = new Beans();
//        beans.setBeanDiscoveryMode("all");
        beans.addAlternativeStereotype(Alpha.class);
        return beans;
    }

    @Inject
    private BusinessBean businessBean;

    /**
     * Test of doSomething method, of class BusinessBean.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testDoSomething() throws Exception {
        String doSomething = businessBean.doSomething();
        assertEquals("ProductionSms: doStuff Alpha", doSomething);
        System.out.println(doSomething);
    }

    @Test
    public void testShopping() throws Exception {
        String doSomething = businessBean.doShopping();
        assertEquals("ProductionShopping: doStuff Alpha", doSomething);
        System.out.println(doSomething);
    }

}

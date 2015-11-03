/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.applicationcomposermock.mock;

import java.util.Properties;
import org.waastad.applicationcomposermock.business.*;
import javax.inject.Inject;
import org.apache.openejb.jee.Beans;
import org.apache.openejb.jee.WebApp;
import org.apache.openejb.junit.ApplicationComposer;
import org.apache.openejb.testing.Classes;
import org.apache.openejb.testing.Configuration;
import org.apache.openejb.testing.Module;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.waastad.applicationcomposermock.mock.qualifier.Alpha;
import org.waastad.applicationcomposermock.process.ProductionSms;
import org.waastad.applicationcomposermock.process.Sms;
import org.waastad.applicationcomposermock.shopping.ProductionShopping;
import org.waastad.applicationcomposermock.shopping.Shopping;

/**
 *
 * @author helge
 */
@RunWith(ApplicationComposer.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
        return beans;
    }

    @Configuration
    public Properties properties() {
        Properties p = new Properties();
        return p;
    }

    @Inject
    private BusinessBean businessBean;

    /**
     * Test of doSomething method, of class BusinessBean.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void test_00_DoSomething() throws Exception {
        String doSomething = businessBean.doSomething();
        assertEquals("ProductionSms: doStuff Alpha", doSomething);
        System.out.println(doSomething);
    }

    @Test
    public void test_01_Shopping() throws Exception {
        String doSomething = businessBean.doShopping();
        assertEquals("ProductionShopping: doStuff Alpha", doSomething);
        System.out.println(doSomething);
    }

}

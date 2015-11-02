/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.applicationcomposermock.business;

import javax.ejb.Singleton;
import javax.inject.Inject;
import org.waastad.applicationcomposermock.process.Sms;
import org.waastad.applicationcomposermock.shopping.Shopping;

/**
 *
 * @author helge
 */
@Singleton
public class BusinessBean {

    @Inject
    private Sms sms;
    @Inject
    private Shopping shopping;

    public String doSomething() {
        return sms.sendSms();
    }

    public String doShopping() {
        return shopping.shop();
    }
}

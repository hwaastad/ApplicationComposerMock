/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.applicationcomposermock.process;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author helge
 */
@Stateless
public class ProductionSms implements Sms {

    @Override
    public String sendSms() {
        return "ProductionSms: " + doStuff();
    }

    @Override
    public String doStuff() {
        return "doStuff Production";
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.applicationcomposermock.mock;

import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Specializes;
import javax.enterprise.inject.Stereotype;
import org.waastad.applicationcomposermock.process.ProductionSms;
import org.waastad.applicationcomposermock.process.Sms;

/**
 *
 * @author helge
 */
@Specializes
@Stateless
public class MockSmsBean extends ProductionSms {

    @Override
    public String doStuff() {
        return "doStuff Alpha";
    }

//    @Override
//    public String sendSms() {
//        return super.sendSms(); //To change body of generated methods, choose Tools | Templates.
//    }
    
    

}

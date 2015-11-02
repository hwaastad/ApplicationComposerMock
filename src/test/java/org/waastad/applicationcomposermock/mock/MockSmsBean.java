/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.applicationcomposermock.mock;

import javax.ejb.Stateless;
import org.waastad.applicationcomposermock.mock.qualifier.Alpha;
import org.waastad.applicationcomposermock.process.ProductionSms;

/**
 *
 * @author helge
 */
@Alpha
@Stateless(name = "ProductionSms")
public class MockSmsBean extends ProductionSms {

    @Override
    public String doStuff() {
        return "doStuff Alpha";
    }

}

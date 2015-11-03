/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.applicationcomposermock.process;

import javax.ejb.Local;

/**
 *
 * @author helge
 */
@Local
public interface Sms {

    public String sendSms();

    public String doStuff();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.applicationcomposermock.shopping;

/**
 *
 * @author helge
 */
public class ProductionShopping implements Shopping {

    @Override
    public String shop() {
        return "ProductionShopping: " + doStuff();
    }

    @Override
    public String doStuff() {
        return "doStuff Production";
    }

}

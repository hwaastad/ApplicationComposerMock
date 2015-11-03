/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.applicationcomposermock.mock;

import javax.enterprise.inject.Specializes;
import org.waastad.applicationcomposermock.mock.qualifier.Alpha;
import org.waastad.applicationcomposermock.shopping.ProductionShopping;

/**
 *
 * @author helge
 */
//@Alpha
@Specializes
public class MockShoppingBean extends ProductionShopping {

    @Override
    public String doStuff() {
        return "doStuff Alpha";
    }
}

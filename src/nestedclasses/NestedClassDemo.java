/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedclasses;

import nestedclasses.*;
/**
 *
 * @author iksri01
 */
public class NestedClassDemo {
    public static void main(String args[])
    {
        LocalAddress address = new LocalAddress("34/9, Primrose", "Vatika City, Sohna Road", "Gurugram", "122002");       
        LocalAddress.Region region = new LocalAddress.Region();
        LocalAddress.Location location = address.new Location(); 
        location.latitude = "28.345347";
        location.longitude = "77.98453";
        LocalAddress.FullAddress fullAddress = address.new FullAddress();
        fullAddress.showAddress();
    }
}

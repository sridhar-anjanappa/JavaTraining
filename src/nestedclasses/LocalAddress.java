/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedclasses;

/**
 *
 * @author iksri01
 */
public class LocalAddress {
    String street1;
    String street2;
    String city;
    String zip;

    public LocalAddress(String s1, String s2, String c, String z)
    {
        street1 = s1;
        street2 = s2;
        city = c;
        zip = z;
    }
    
    public static class Region
    {
       static final String state = "Haryana";
       static final String country = "India";        
    }
            
    public class Location
    {
        public String latitude;
        public String longitude;
    }
    
    public class FullAddress
    {
        public void showAddress()
        {
            System.out.println(street1 + " " + street2);
            System.out.println(city + " " + zip);
            System.out.println(Region.state + " " + Region.country);
        }
    }
}

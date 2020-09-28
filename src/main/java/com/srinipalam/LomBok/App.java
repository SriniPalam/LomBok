package com.srinipalam.LomBok;

import com.srinipalam.model.Aline;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Aline a1 = new Aline(101,"Srini","Java");
        Aline a2 = new Aline(102,"Ravi","MQ");
        Aline a3 = new Aline(103,"Chandu","Studying");
        
        Aline a4 = new Aline(101,"Srini","Java");
        
        String str1=new String("hi");
        String str2=new String("hello");
        String str3=new String("hi");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        
        System.out.println(a1.equals(a2));//false
        System.out.println(a1.equals(a3));//false
        System.out.println(a1.equals(a4));//true
        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//true
        
        System.out.println(a1.hashCode());//101
        System.out.println(a2.hashCode());//101
        System.out.println(a3.hashCode());//101
        System.out.println(a4.hashCode());//101

        System.out.println(str1.hashCode());//101
        System.out.println(str3.hashCode());//101
        
        
        
        
       /* a.setAid(101);
        a.setAname("Srini");
        System.out.println(a.getAid()+" "+a.getAname());
        System.out.println(a);
        
        */
    }
}

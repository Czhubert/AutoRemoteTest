package org.example;

import org.example.Licz;
import org.testng.Assert;
import org.testng.annotations.Test;
import net.sf.jni4net.*;
import system.*;

import java.io.IOException;
import java.lang.String;
import java.util.Collections;

@Test(groups = { "test1" })
public class test {


    public void testESB() throws IOException {


        // połączenie między C# a java
        Bridge.setVerbose(true);
        Bridge.init();

        // teraz blok C#

        //Wprowadzanie danych
        Console.WriteLine("Hello .NET world!\n\n");
        Console.WriteLine(Licz.Policz("6"));
        string wynik = Licz.Policz("6");

        Assert.assertEquals(wynik,"12");
//        string greeting = "Hello";

        System.out.println("Test zaliczonypoprawnie");
    }

}

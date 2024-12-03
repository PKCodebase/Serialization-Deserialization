package com.serialize;

import java.io.*;

public class SerializeEmployee {

    public static void main(String[] args) {

        Employee object1 = new Employee(1, "kaushik111","te@gmail");
        //Employee object2 = new Employee(2, "Test");

        try {
            OutputStream fout = new FileOutputStream("D:\\File\\Serialize1.txt");
            ObjectOutput oout = new ObjectOutputStream(fout);
            System.out.println("Serialization process has started, serializing employee objects...");
            oout.writeObject(object1);
           // oout.writeObject(object2);
            oout.close();
            System.out.println("Object Serialization completed.");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

    }

}
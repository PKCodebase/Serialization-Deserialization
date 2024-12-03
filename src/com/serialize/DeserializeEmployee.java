package com.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeEmployee {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("DeSerialize the employee object");
        FileInputStream fis = new FileInputStream("D:\\File\\Serialize1.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object object = ois.readObject();
        if(object != null){
            Employee emp = (Employee) object;
            System.out.println(emp);
            System.out.println("Deserialized done!!");
        }
    }
}

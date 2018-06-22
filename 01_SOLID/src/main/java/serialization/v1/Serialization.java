package serialization.v1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * Created by msibert on 3/5/18.
 */
public class Serialization {

    public static void main (String[] args){

        try {
            /*
            // Serialize today's date to a file.
            FileOutputStream f = new FileOutputStream("tmp");
            ObjectOutput s = new ObjectOutputStream(f);
            s.writeObject("Today");
            Date myDate = new Date();
            s.writeObject(myDate);
            s.flush();
            System.out.println("Date: " + myDate);

            // Deserialize a string and date from a file.
            FileInputStream in = new FileInputStream("tmp");
            ObjectInputStream inputStream = new ObjectInputStream(in);
            String today = (String)inputStream.readObject();
            Date date = (Date)inputStream.readObject();
            System.out.println("Recovered Date: " + date);

            */
/*
            // Serialize today's date to a file.
            FileOutputStream f = new FileOutputStream("tmp");
            ObjectOutput s = new ObjectOutputStream(f);
            MyObject obj = new MyObject();
            s.writeObject(obj);
            s.flush();
            System.out.println("Object: " + obj);
*/
            // Deserialize a string and date from a file.
            FileInputStream in = new FileInputStream("tmp");
            ObjectInputStream inputStream = new ObjectInputStream(in);
            MyObject myObj = (MyObject)inputStream.readObject();

            System.out.println("Recovered Object: " + myObj);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

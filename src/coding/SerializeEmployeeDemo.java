package coding;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployeeDemo {

	public static void main (String [] arg) {

		EmployeeDemo ed = new EmployeeDemo(101,"sagar",30000);

		try {
			FileOutputStream fos = new FileOutputStream("employee.text"); //It creates physical connection between Java program and file.
			ObjectOutputStream oos= new ObjectOutputStream(fos); // ObjectOutputStream converts a Java object into bytes.

			oos.writeObject(ed); // You tell Java to serialize the object.

			oos.close();

			System.out.println("object serilized");
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}

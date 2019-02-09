package ocp.capitulo8.streams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Test of FileInputStream and FileOutputStream
 * 
 * @author renato
 *
 */
public class FileInputStreamTest {
	public static void main(String[] args) {
		File file = new File("test.txt");
		String data = "O teste ta sendo feito.";
		generateFile(file, data);
		readFile(file);
	}

	private static void readFile(File file) {
		try (InputStream in = new FileInputStream(file)) {
			int b = 0;
			byte[] size = new byte[10];
			in.read(size);
			System.out.print(new String(size));
			while (b > -1) {
		

				b = in.read();
				if (b > 0)
					System.out.print((char) b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void generateFile(File file, String data) {
		try (OutputStream out = new FileOutputStream(file)) {
			for (byte b : data.getBytes())
				out.write(b);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}

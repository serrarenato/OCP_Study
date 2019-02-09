package ocp.capitulo8.streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Tests with BufferdInputStream and BufferedInputStream
 * 
 * @author renato
 *
 */
public class BufferedInputStreamTest {
	 private native int teste(byte b[], int off, int len) throws IOException;
	
	public static void main(String[] args) {
		File file = new File("test2.txt");
		String data = "O teste esta sendo realizado.";
		writeFile(file, data);
		readFile(file);
	}

	private static void readFile(File file) {
		try (InputStream in = new BufferedInputStream(new FileInputStream(file))) {
			byte[] size = new byte[10];
			int retorno=0;
			while ((retorno = in.read(size)) > 0) {
				System.out.println(retorno);
				System.out.print(new String(size));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void writeFile(File file, String data) {
		try (OutputStream out = new BufferedOutputStream((new FileOutputStream(file)))) {

			out.write(data.getBytes(), 0, data.length());
			out.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

package ch32;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


class SimpleWriter {
	public static void main(String[] args) {
		try(Writer out = new FileWriter("data.txt")) {
			out.write('A');
			out.write('ν');
			out.write('κΈ');
			out.write("μμ΄");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

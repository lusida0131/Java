package ch33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

class CopyFileFromFiles {

	public static void main(String[] args) throws IOException {
		Path src = Paths.get("C:\\JavaStudy\\CopyFileFromFiles.java");
		Path dst = Paths.get("C:\\JavaStudy\\CopyFileFromFiles2.java");
		
		Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);

	}

}

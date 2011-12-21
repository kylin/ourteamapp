package com.ourteam.app.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.ArrayUtils;

public class FileOperationUtils {

	static public void moveFiles(File src, File dest) throws Exception {
		moveFiles(src, dest, true);
	}

	static public void moveFiles(File src, File dest, boolean overWrite)
			throws Exception {

		File resourcePathFile = src;

		String[] srcFileNames = resourcePathFile.list();

		if (ArrayUtils.isNotEmpty(srcFileNames)) {

			for (int i = 0; i < srcFileNames.length; i++) {
				String fileName = srcFileNames[i];
				File file = new File(src, fileName);
				File destFile = new File(dest, fileName);
				if (file.isFile()) {
					if (overWrite && destFile.exists()) {
						FileUtils.forceDelete(destFile);
					}
					FileUtils.moveFileToDirectory(file, dest, true);
				} else {
					if (destFile.exists() == false) {
						destFile.mkdir();
					}
					moveFiles(file, destFile);
				}
			}

		}

	}

	public static void main(String[] args) {
		try {
			moveFiles(new File("C:/TEMP/spif"), new File(
					"D:/WorkspaceRoot/spif"));
		} catch (Exception e) {

		}
	}
}

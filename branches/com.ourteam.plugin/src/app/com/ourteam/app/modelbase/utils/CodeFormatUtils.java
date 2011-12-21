package com.ourteam.app.modelbase.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.lang.StringUtils;

import de.hunsicker.jalopy.Jalopy;

public class CodeFormatUtils {

	static URL convention = null;
	static Jalopy jalopy = null;

	public static void init() throws Exception {

		URL url = CodeFormatUtils.class.getResource("defaultFormatConfig.xml");

		Jalopy.setConvention(url);

		jalopy = new Jalopy();
	}

	public static void init(String config) throws Exception {
		if (StringUtils.isBlank(config)) {
			return;
		}
		try {
			File tempFile = File.createTempFile("convention", ".xml");

			FileWriter writer = new FileWriter(tempFile);

			writer.write(config);

			writer.flush();

			writer.close();

			Jalopy.setConvention(tempFile);

			jalopy = new Jalopy();
		} catch (IOException e) {
			throw new Exception(e.getMessage());
		}

	}

	public static void format(File file) throws Exception {
		if (jalopy == null) {
			return;
		}
		try {
			String name = file.getName();
			if (name.endsWith(".java")) {
				jalopy.setInput(file);
				jalopy.setOutput(file);
				jalopy.format(true);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			new Exception(e.getMessage());
		}
	}

	public static void format(String fileName) throws Exception {
		if (jalopy == null) {
			return;
		}
		if (fileName == null)
			return;
		if (!fileName.endsWith(".java"))
			return;
		File file = new File(fileName);
		if (!file.exists())
			return;

		try {
			jalopy.setInput(file);
			jalopy.setOutput(file);
			jalopy.format(true);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			new Exception(e.getMessage());
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CodeFormatUtils
					.format("D:/Works/Projects/SPIF_API/dao/com/fnst/spif/dao/customer/impl/BaseCustomerDAOIbatisImpl.java");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

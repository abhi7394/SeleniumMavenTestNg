package utilities;

import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

	public static PropertyReader propInstance;

	private PropertyReader() {
	}

	public static PropertyReader getInstance() {
		if (propInstance == null) {
			propInstance = new PropertyReader();
		}
		return propInstance;
	}

	public String getProperty(String propName) {
		try {
			Properties p = new Properties();
			InputStream input = getClass().getClassLoader().getResourceAsStream("config/config.properties");

			p.load(input);
			if (p.getProperty(propName) != null) {
				return p.getProperty(propName);
			}
		}

		catch (Exception e) {
			e.getStackTrace();
		}
		return null;
	}

}

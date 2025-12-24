package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	public static  Properties prop;

    public static String getProperties(String key) {
        prop = new Properties();
        
      
        try {
            // Dynamically locate project root and file path
            String path = System.getProperty("user.dir") + "/Configrations/config.properties";
            FileInputStream fis = new FileInputStream(path);
            prop.load(fis);
        } catch (IOException e) {
            System.out.println("Error reading config file: " + e.getMessage());
        }
        return prop.getProperty(key);
    }

 
}

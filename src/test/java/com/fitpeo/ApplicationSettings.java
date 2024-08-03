package com.fitpeo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ApplicationSettings {
    public static final String BROWSER_NAME ;
    public static final String URL_PATH;
   // public static final int SLIDER_BAR_VALUE;
   // public static final int SLIDER_TEXT_VALUE;


    static {
        // Read properties file.
        Properties properties = new Properties();
        try {
            //Specifying property file path
            FileReader reader= new FileReader("src/test/resources/environment.properties");
            properties.load(reader);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BROWSER_NAME=properties.getProperty("BROWSER");
        URL_PATH=properties.getProperty("url_path");
        //SLIDER_BAR_VALUE= Integer.parseInt(properties.getProperty("slider_bar_value"));
        //SLIDER_TEXT_VALUE= Integer.parseInt(properties.getProperty("slider_text_value"));

    }
    }
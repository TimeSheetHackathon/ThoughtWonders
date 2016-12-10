package com.thoughtworks.timesheet.Json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;

/**
 * Created by mritunjd on 10/12/16.
 */
public class JsonReader {
    private final static String UTF_8_CHARSET = "UTF-8";

    public static String readFromUrl(String url) throws IOException {
        InputStream inputStream = new URL(url).openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName(UTF_8_CHARSET)));
        StringBuilder sb = new StringBuilder();
        int cp;
        while ((cp = bufferedReader.read()) != -1) {
            sb.append((char) cp);
        }
        return sb.toString();
    }
}

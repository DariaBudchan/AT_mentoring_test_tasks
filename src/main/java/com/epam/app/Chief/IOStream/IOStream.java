package com.epam.app.Chief.IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

/**
 * Author: Daria Budchan, May, 2018
 */

public class IOStream {

    private InputStream inputstream;

    private OutputStream outputStream;

    private String path;

    public IOStream(String path) {
        this.path = path;
    }

    public void read() throws IOException {
        inputstream = new FileInputStream(path);
        int data = inputstream.read();
        char content;
        while(data != -1) {
            content = (char) data;
            System.out.print(content);
            data = inputstream.read();
        }
        System.out.println();
        inputstream.close();
    }

    public void write(String st) throws IOException {
        outputStream = new FileOutputStream(path);
        outputStream.write(st.getBytes());
        outputStream.close();
    }

}
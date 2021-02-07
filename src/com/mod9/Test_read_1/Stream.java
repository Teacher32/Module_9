package com.mod9.Test_read_1;

import java.io.InputStream;

public class Stream extends InputStream {

    private byte[] mass = {'0', '1', '2'};

    public int read() {
        return mass[3];
    }

}

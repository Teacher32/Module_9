package com.mod9.task9_2_1;

import java.io.InputStream;

public class OneZeroStream extends InputStream {

    private byte[] bytes = {'1', ' ', '2', ' '};
    int i = 0;

    @Override
    public int read() {
        if (i >= bytes.length)
            i = 0;
        return bytes[i++];
    }
}

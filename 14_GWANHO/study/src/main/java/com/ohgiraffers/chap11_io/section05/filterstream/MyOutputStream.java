package com.ohgiraffers.chap11_io.section05.filterstream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyOutputStream extends ObjectOutputStream {

    public MyOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {

    }
}

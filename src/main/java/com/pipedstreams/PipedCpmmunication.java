package com.pipedstreams;

import java.io.*;

public class PipedCpmmunication {
    public static void main(String[] args) {
        try {
            // Create a PipedInputStream and PipedOutputStream
            PipedInputStream pipedInputStream = new PipedInputStream();
            PipedOutputStream pipedOutputStream = new PipedOutputStream(pipedInputStream);

            // Create and start writer thread
            Thread writerThread = new Thread(new WriterThread(pipedOutputStream));
            writerThread.start();

            // Create and start reader thread
            Thread readerThread = new Thread(new ReaderThread(pipedInputStream));
            readerThread.start();

            // Wait for both threads to finish
            writerThread.join();
            readerThread.join();

        } catch (IOException | InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

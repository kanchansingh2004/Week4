package com.pipedstreams;

import java.io.*;

public class ReaderThread implements Runnable {
    private final PipedInputStream pipedInputStream;

    // Constructor to initialize PipedInputStream
    public ReaderThread(PipedInputStream pipedInputStream) {
        this.pipedInputStream = pipedInputStream;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(pipedInputStream))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Reader Thread: Read - " + line); // Read and print data
            }
        } catch (IOException e) {
            System.err.println("Reader Thread Error: " + e.getMessage());
        } finally {
            try {
                pipedInputStream.close(); // Close the PipedInputStream
            } catch (IOException e) {
                System.err.println("Error closing reader stream: " + e.getMessage());
            }
        }
    }
}

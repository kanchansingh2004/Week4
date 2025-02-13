package com.pipedstreams;

import java.io.*;

public class WriterThread implements Runnable {
    private final PipedOutputStream pipedOutputStream;

    // Constructor to initialize PipedOutputStream
    public WriterThread(PipedOutputStream pipedOutputStream) {
        this.pipedOutputStream = pipedOutputStream;
    }

    @Override
    public void run() {
        String filePath = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\pipedstreams\\input.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
             OutputStreamWriter writer = new OutputStreamWriter(pipedOutputStream)) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n"); // Write data to PipedOutputStream
                writer.flush();
                System.out.println("Writer Thread: Wrote - " + line);
                Thread.sleep(500); // Simulate some delay in writing
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Writer Thread Error: " + e.getMessage());
        } finally {
            try {
                pipedOutputStream.close(); // Close the PipedOutputStream
            } catch (IOException e) {
                System.err.println("Error closing writer stream: " + e.getMessage());
            }
        }
    }
}

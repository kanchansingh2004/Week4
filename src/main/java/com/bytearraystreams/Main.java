package com.bytearraystreams;

import java.io.*;
import java.nio.file.Files;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Define file paths for the input and output images
        String inputImagePath = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\bytearraystreams\\img1.png";
        String outputImagePath = "D:\\Training_Capgemini\\Week4\\Day3\\src\\main\\java\\com\\bytearraystreams\\img2.png";

        try {
            // Convert the image to a byte array
            byte[] imageBytes = convertImageToByteArray(inputImagePath);

            // Write the byte array back to a new image file
            writeByteArrayToImage(outputImagePath, imageBytes);

            // Verify that the new file is identical to the original
            if (verifyFilesAreIdentical(inputImagePath, outputImagePath)) {
                System.out.println("The new image file is identical to the original.");
            } else {
                System.out.println("The new image file is NOT identical to the original.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    // Method to convert an image file to a byte array
    public static byte[] convertImageToByteArray(String filePath) throws IOException {
        try (FileInputStream fis = new FileInputStream(filePath);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                // Write buffer to ByteArrayOutputStream
                baos.write(buffer, 0, bytesRead);
            }
            // Return the byte array
            return baos.toByteArray();
        }
    }

    // Method to write a byte array back to an image file
    public static void writeByteArrayToImage(String filePath, byte[] imageBytes) throws IOException {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
             FileOutputStream fos = new FileOutputStream(filePath)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bais.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead); // Write buffer to file
            }
        }
    }

    // Method to verify if two files are identical
    public static boolean verifyFilesAreIdentical(String filePath1, String filePath2) throws IOException {
        File file1 = new File(filePath1);
        File file2 = new File(filePath2);

        // Read the files as byte arrays
        byte[] file1Bytes = Files.readAllBytes(file1.toPath());
        byte[] file2Bytes = Files.readAllBytes(file2.toPath());

        // Compare the byte arrays
        return Arrays.equals(file1Bytes, file2Bytes);
    }
}

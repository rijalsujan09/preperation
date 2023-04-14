package example;

import java.io.File;

public class DeleteFolderRecursivelyExample {
    public static void main(String[] args) {
        String directoryPath = "C:/mydirectory"; // replace with your desired directory path
        File directory = new File(directoryPath);

        if (directory.exists()) {
            deleteDirectory(directory);
            System.out.println("Directory deleted successfully.");
        } else {
            System.out.println("Directory doesn't exist.");
        }
    }

    private static void deleteDirectory(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    deleteDirectory(file);
                } else {
                    file.delete();
                }
            }
        }
        directory.delete();
    }
}


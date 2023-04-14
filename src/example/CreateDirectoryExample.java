package example;

import java.io.File;

public class CreateDirectoryExample {
    public static void main(String args[]){
        String dPath = "/Users/rijalsujan09/Desktop/Hi";

        File directory = new File(dPath);
        if(!directory.exists()){
            boolean bol = directory.mkdir();
            if(bol){
                System.out.println("Directory created.");
            }
            else{
                System.out.println("Operation failed.");
            }
        }
        else{
            System.out.println("directory  already  exist");
        }
    }
}

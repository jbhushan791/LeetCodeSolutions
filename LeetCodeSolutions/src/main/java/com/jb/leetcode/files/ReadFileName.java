package com.jb.leetcode.files;

import java.io.File;

/**
 * @author jbhushan
 */
public class ReadFileName {

    public static void main(String[] args){
        ReadFileName rfn = new ReadFileName();
        rfn.readAllFileNames("C:\\Users\\bhada\\OneDrive\\Documents\\raghu\\interview\\4-Stacks");
        rfn.listFileDetails("C:\\Users\\bhada\\OneDrive\\Documents\\raghu\\interview\\4-Stacks");
    }

    public void readAllFileNames(String directory){
        File directoryPath = new File(directory);
        //List of all files and directories
        String contents[] = directoryPath.list();
        for(int i=0; i<contents.length; i++) {
            System.out.println(contents[i]);
        }
    }

    public void listFileDetails(String directory){
        File directoryPath = new File(directory);
        //List of all files and directories
        File files[] = directoryPath.listFiles();
        for(File file : files) {
            System.out.println("File name: "+file.getName());
            System.out.println("File path: "+file.getAbsolutePath());
            System.out.println("Size :"+file.getTotalSpace());
            System.out.println(" ");
        }
    }
}

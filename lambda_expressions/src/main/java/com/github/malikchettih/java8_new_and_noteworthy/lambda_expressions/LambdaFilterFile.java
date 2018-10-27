package com.github.malikchettih.java8_new_and_noteworthy.lambda_expressions;

import java.io.File;
import java.io.FileFilter;

public class LambdaFilterFile {
    
    public static void main(String[] args){
        
        FileFilter fileFilter =(File pathname) -> pathname.getName().endsWith(".java");
        
        File directory = new File(args[0]);
        File[] files = directory.listFiles(fileFilter);
        
        for(File f : files){
            System.out.println("File -> "+f);
        }
    }
}

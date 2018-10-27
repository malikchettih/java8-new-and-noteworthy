package com.github.malikchettih.java8_new_and_noteworthy.lambda_expressions;

import java.util.*;

public class LambdaComparator {
    
    public static void main(String[] args){
        
        Comparator<String> comparator = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
        List<String> datas = Arrays.asList("****", "*", "**");
        Collections.sort(datas, comparator);
        
        for(String data: datas){
            System.out.println(data);
        }
                
    }
}

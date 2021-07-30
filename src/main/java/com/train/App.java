package com.train;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	String hello = "tom.txt";
    	;
        System.out.println( StringUtils.substringAfterLast(hello, ".") );
    }
}

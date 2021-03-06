package com.ppahare.antlrv4.decoder2;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class TestMain {
	
	 public static void main(String[] args) throws Exception {
	     if(args.length < 2) {
	    	 System.out.print("Usage : bdecoder -f <file> \n"
 	 						+ "      : bdecoder -s <string1> [string2] ...\n");
	    	 return;
	     }
	     String argument;
	     if(args[0].equals("-f")) {
	    	 argument = args[1];
	    	 File file = new File(argument);
	    	 if(!file.exists()) {
	    		 System.out.println("File \""+ file +"\" does not exsits !");
	    	 } else {
	    		 List<String> brands = FileUtils.readLines(file);
	    		 int i=1;
	    		 for(String brand : brands) {
	    			 brand = brand.toLowerCase();
	    			 try {
	    				 System.out.println(""+decode(brand.trim()));
	    			 } catch (Exception e) {
	    				 System.out.println(""+(brand.trim()));
	    			 }
	    			 i++;
	    		 }
	    	 }
	     } else if(args[0].equals("-s")){
	    	 for(int i=1; i<args.length; i++) {
		    	 argument = args[i].toLowerCase();
		    	 try {
		    		 System.out.println(""+decode(argument.trim()));
		    	 } catch (Exception e) {
    				 System.out.println(""+(argument.trim()));
    			 }
	    	 }
	     }
		    
	    }
	 
	 public static String decode(String myString) throws IOException {
	        InputStream fis = new ByteArrayInputStream(myString.getBytes("ASCII"));
	        org.antlr.v4.runtime.CharStream input = new org.antlr.v4.runtime.ANTLRInputStream(fis);
	        DecoderLexer lexer = new DecoderLexer( input);              
	     
	        //h.put("tr", false);        
	        
	        DecoderParser parser = new DecoderParser(new org.antlr.v4.runtime.CommonTokenStream(lexer));
	        String str = parser.prog().value;
	        return str;
	 }
}

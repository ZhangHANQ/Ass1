package org.example.protocolbuf.test;


import org.junit.After;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

import static org.junit.Assert.assertEquals;

import example.myapp.helloworld.grpc.*;

public class HelloProtoBufTest {
    
   
    @Test
    public void testRequestPrototocoBuf() {
    	HelloRequest.Builder request = HelloRequest.newBuilder();
  
        request.setName("artist1");
        
        FileOutputStream output;
        try {
			output  = new FileOutputStream("request.data");
			//request.build().writeTo(output);
			request.build().toByteString().writeTo(output);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        HelloRequest requestDeserial = null;
        try {
        	requestDeserial = 
					HelloRequest.parseFrom(new FileInputStream("request.data"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        assertEquals("artist1", requestDeserial.getName());
    }


    
   
}
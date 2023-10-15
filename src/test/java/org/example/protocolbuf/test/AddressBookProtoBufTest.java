package org.example.protocolbuf.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import org.junit.Test;

import com.google.gson.Gson;

import example.mobile.protobuf.AddressBookProtos;

public class AddressBookProtoBufTest {
	

	@Test
	public void test()  {
		String email = "j@baeldung.com";
		int id = new Random().nextInt();
		String name = "Michael Program";
		String number = "01234567890";
		
		AddressBookProtos.Person person =
		  AddressBookProtos.Person.newBuilder()
		    .setId(id)
		    .setName(name)
		    .setEmail(email)
		    .addNumbers(number)
		    .build();

		assertEquals(person.getEmail(), email);
		assertEquals(person.getId(), id);
		assertEquals(person.getName(), name);
		assertEquals(person.getNumbers(0), number);
		
		AddressBookProtos.AddressBook addressBook 
		  = AddressBookProtos.AddressBook.newBuilder().addPeople(person).build();
		
		Gson gson = new Gson();
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("address.data");
			addressBook.writeTo(fos); // taking the effects of serialization; 
			
			String json = gson.toJson(addressBook);
			System.out.println(json);
			
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

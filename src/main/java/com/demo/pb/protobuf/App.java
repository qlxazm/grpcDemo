package com.demo.pb.protobuf;

import com.demo.pb.protobuf.message.AddressBookProtos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://www.cnblogs.com/gutousu/p/9951956.html
 *
 */

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        /*AddressBookProtos.Person.Builder person = AddressBookProtos.Person.newBuilder();
        person.setId(11);
        person.setName("hello");
        person.setEmail("aaaa");

        AddressBookProtos.Person.PhoneNumber.Builder phoneNumberBuilder = AddressBookProtos.Person.PhoneNumber.newBuilder();
        phoneNumberBuilder.setNumber("1234567890");
        phoneNumberBuilder.setType(AddressBookProtos.Person.PhoneType.MOBILE);

        person.addPhones(phoneNumberBuilder.build());

        System.out.println(person.build().toString());*/

        SpringApplication.run(App.class);
    }
}

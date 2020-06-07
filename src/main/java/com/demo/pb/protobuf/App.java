package com.demo.pb.protobuf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * https://www.cnblogs.com/gutousu/p/9951956.html
 * mvn install:install-file -DgroupId=com.google.protobuf -DartifactId=protoc -Dversion=3.0.0 -Dclassifier=windows-x86_64} -Dpackaging=exe -Dfile=E:\protoc-3.12.3-win64\bin\protoc.exe
 * protobuf:compile //编译消息对象
 * protobuf:compile-custom //依赖消息对象,生成接口服务
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

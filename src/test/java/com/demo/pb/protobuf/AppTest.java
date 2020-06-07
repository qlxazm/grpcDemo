package com.demo.pb.protobuf;

import com.demo.pb.protobuf.client.GrpcTestClient;
import com.demo.pb.protobuf.message.Request;
import com.demo.pb.protobuf.message.Response;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest 
{
    @Autowired
    private GrpcTestClient javaGrpcClient;

    @Test
    public void contextLoads() {
        Request request = Request.newBuilder().setRequest1("test1").setRequest2("test2").build();
        Response result = javaGrpcClient.run(o -> o.method(request));
        System.out.println("这是结果" + result.toString());
    }
}

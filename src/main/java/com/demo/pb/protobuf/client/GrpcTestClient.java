package com.demo.pb.protobuf.client;

import com.demo.pb.protobuf.message.TestServiceGrpc;
import io.grpc.Channel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author qlx
 * @date 2020/6/7 21:27
 */
@Component
public class GrpcTestClient implements InitializingBean {

    private Channel channel = channel();

    public <Result> Result run(Functional<TestServiceGrpc.TestServiceBlockingStub,Result> functional)
    {
        TestServiceGrpc.TestServiceBlockingStub testServiceBlockingStub =
                TestServiceGrpc.newBlockingStub(channel);

        return functional.run(testServiceBlockingStub);
    }

    private Channel channel() {
        return ManagedChannelBuilder
                .forAddress("localhost", 2)
                .usePlaintext()
                .build();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ooo");
    }
}

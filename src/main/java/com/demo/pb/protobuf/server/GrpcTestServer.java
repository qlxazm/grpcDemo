package com.demo.pb.protobuf.server;

import com.demo.pb.protobuf.message.Request;
import com.demo.pb.protobuf.message.Response;
import com.demo.pb.protobuf.message.TestServiceGrpc;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author qlx
 * @date 2020/6/7 21:21
 */
@Component
public class GrpcTestServer extends TestServiceGrpc.TestServiceImplBase implements InitializingBean {

    @Override
    public void method(Request request, StreamObserver<Response> responseStreamObserver) {
        Response response = Response.newBuilder().setRsponse1("response1").setRsponse2("response2").build();
        responseStreamObserver.onNext(response);
        responseStreamObserver.onCompleted();
    }


    @Override
    public void afterPropertiesSet() throws Exception {

        ServerBuilder.forPort(2)
                .addService(new GrpcTestServer())
                .build()
                .start();

    }
}

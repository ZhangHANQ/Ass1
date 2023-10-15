package example.myapp.helloworld.client;

import example.myapp.helloworld.*;
import example.myapp.helloworld.grpc.HelloReply;
import example.myapp.helloworld.grpc.HelloRequest;
import example.myapp.helloworld.grpc.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) throws InterruptedException {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8081)
            .usePlaintext()
            .build();

        HelloServiceGrpc.HelloServiceBlockingStub stub 
          = HelloServiceGrpc.newBlockingStub(channel);

        HelloReply helloResponse = stub.hello(HelloRequest.newBuilder()
        	.setName("coen6313-rpc-request")
            .build());

        System.out.println("Response received from server:\n" + helloResponse);

        channel.shutdown();
    }
}

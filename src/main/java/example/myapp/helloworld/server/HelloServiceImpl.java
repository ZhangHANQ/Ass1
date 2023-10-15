package example.myapp.helloworld.server;


import example.myapp.helloworld.*;
import example.myapp.helloworld.grpc.HelloReply;
import example.myapp.helloworld.grpc.HelloRequest;
import example.myapp.helloworld.grpc.HelloServiceGrpc;
import example.myapp.helloworld.grpc.HelloServiceGrpc.HelloServiceImplBase;
import io.grpc.stub.StreamObserver;

public class HelloServiceImpl extends HelloServiceImplBase {

    @Override
    public void hello(HelloRequest request, StreamObserver<HelloReply> responseObserver) {
        System.out.println("Request received from client:\n" + request);

        String greeting = new StringBuilder().append("Hello, ")
                .append(request.getName())
                .append(" ")
                .toString();

        HelloReply response = HelloReply.newBuilder()
                .setMessage(greeting)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

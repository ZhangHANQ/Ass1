package example.myapp.inventory.grpc.client;

import example.myapp.inventory.grpc.InventoryRequest;
import example.myapp.inventory.grpc.InventoryReply;
import example.myapp.inventory.grpc.InventoryServiceGrpc;
import example.myapp.inventory.grpc.InventoryRecordSearchGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8082)
                .usePlaintext()
                .build();

        InventoryServiceGrpc.InventoryServiceBlockingStub stub
                = InventoryServiceGrpc.newBlockingStub(channel);

       InventoryReply Response = stub.search(InventoryRequest.newBuilder()
               .setInventoryID("IN001")
               .build());
       InventoryReply Response2 = stub.

        System.out.println("Response received from server:\n" + Response);

        channel.shutdown();
    }
}

package example.myapp.inventory.grpc.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8082).addService(new InventoryService()).build();
        System.out.println("Starting server");
        server.start();
        System.out.println("Server started");
        server.awaitTermination();

    }
}

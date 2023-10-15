package example.myapp.inventory.grpc.server;

import example.myapp.inventory.grpc.InventoryRequest;
import example.myapp.inventory.grpc.InventoryReply;
import example.myapp.inventory.grpc.InventoryRecordSearchGrpc;
import example.myapp.inventory.grpc.InventoryRecord;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class InventoryRecordSearch extends InventoryRecordSearchGrpc.InventoryRecordSearchImplBase{
    public InventoryRecordSearch(){

    }
    public void ReSearch(InventoryRequest request,StreamObserver<InventoryReply> replyStreamObserver){
        InventoryRecord record1 = new InventoryRecord("IN001", "Item1", "Desc1",
                51, 25, 1275,
                29, 13, 50, false);
        InventoryRecord record2 = new InventoryRecord("IN002", "Item2", "Desc2",
                93, 132, 12276,
                231, 4, 50, false);
        InventoryRecord record3 = new InventoryRecord("IN003", "Item3", "Desc3",
                57, 151, 8607,
                114, 11, 150, false);
        InventoryRecord record4 = new InventoryRecord("IN004", "Item4", "Desc4",
                19, 186, 3534,
                158, 6, 50, false);
        InventoryRecord record5 = new InventoryRecord("IN005", "Item5", "Desc5",
                75, 62, 4650,
                39, 12, 50, false);
        InventoryRecord record6 = new InventoryRecord("IN006", "Item6", "Desc6",
                11, 5, 55,
                9, 13, 150, false);
        Map<String,InventoryRecord> maps= new TreeMap<>();
        maps.put("IN001",record1);
        maps.put("IN002",record2);
        maps.put("IN003",record3);
        maps.put("IN004",record4);
        maps.put("IN005",record5);
        maps.put("IN006",record6);
        System.out.println("Request received from client:\n"+request);
        List<InventoryRecord> list = new ArrayList<>();
        InventoryReply response = InventoryReply.newBuilder()
                .setName(String.valueOf(maps.get(request.getInventoryID()))).build();
        replyStreamObserver.onNext(response);
        replyStreamObserver.onCompleted();
    }
}

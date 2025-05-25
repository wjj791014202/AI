package com.example.ecommerce.grpc;

import net.devh.boot.grpc.server.service.GrpcService;
import com.example.ecommerce.grpc.ProductServiceGrpc.ProductServiceImplBase;
import com.example.ecommerce.grpc.ProductRequest;
import com.example.ecommerce.grpc.ProductResponse;
import io.grpc.stub.StreamObserver;

@GrpcService
public class ProductServiceImpl extends ProductServiceImplBase {

    @Override
    public void getProduct(ProductRequest request, StreamObserver<ProductResponse> responseObserver) {
        // In a real application this would query the database.
        ProductResponse response = ProductResponse.newBuilder()
                .setId(request.getId())
                .setName("Sample Product")
                .setDescription("This is a sample product.")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}

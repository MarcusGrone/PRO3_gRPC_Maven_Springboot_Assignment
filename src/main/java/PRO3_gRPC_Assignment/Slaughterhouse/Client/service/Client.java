package PRO3_gRPC_Assignment.Slaughterhouse.Client.service;


import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.List;

public class Client {
  private final String host;
  private final int port;


  public Client(String host, int port)
  {
    this.host = host;
    this.port = port;
  }

  protected ManagedChannel channel() {
    return ManagedChannelBuilder
        .forAddress(host, port)
        .usePlaintext()
        .build();
  }


  }


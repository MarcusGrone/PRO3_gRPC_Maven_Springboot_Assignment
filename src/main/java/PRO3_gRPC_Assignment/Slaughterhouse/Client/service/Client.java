package PRO3_gRPC_Assignment.Slaughterhouse.Client.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.net.http.HttpClient;

public class Client {
  protected final String host;
  protected final int grpcPort;
  protected final int restPort;
  protected final HttpClient httpClient;

  public Client(String host, int grpcPort, int restPort) {
    this.host = host;
    this.grpcPort = grpcPort;
    this.restPort = restPort;
    this.httpClient = HttpClient.newHttpClient(); // REST client
  }

  public ManagedChannel createGrpcChannel() {
    return ManagedChannelBuilder
        .forAddress(host, grpcPort)
        .usePlaintext()
        .build();
  }

  public String getRestBaseUrl() {
    return "http://" + host + ":" + restPort;
  }
}
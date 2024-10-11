package PRO3_gRPC_Assignment.Slaughterhouse.Client.service;

import PRO3_gRPC_Assignment.Slaughterhouse.Client.interfaces.IAnimalRegistration;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.Animal;
import PRO3_gRPC_Assignment.Slaughterhouse.Entities_Shared.dataConverters.AnimalConverter;
import dk.via.slaughterhouse.AnimalData;
import dk.via.slaughterhouse.AnimalRegistrationServiceGrpc;
import io.grpc.ManagedChannel;

public class AnimalRegistration extends Client implements IAnimalRegistration
{
  private AnimalRegistrationServiceGrpc.AnimalRegistrationServiceBlockingStub stub;

  public AnimalRegistration(String host, int port)
  {
    super(host, port);
  }



  @Override public Animal registerNewAnimal(double weightInKg)
  {
    ManagedChannel channel = channel();

    try
    {
      AnimalRegistrationServiceGrpc.AnimalRegistrationServiceBlockingStub stub = AnimalRegistrationServiceGrpc.newBlockingStub(
          channel);

      AnimalData data = AnimalConverter.convertToGrpcAnimalData(
          new Animal("0", weightInKg));

      AnimalData createdAnimal = stub.registerAnimal(data);

      return AnimalConverter.convertToAnimal(createdAnimal);

    }
    catch (Exception e)
    {
      e.printStackTrace();
      return null;
    }
    finally
    {
      channel.shutdown();
    }
  }


}

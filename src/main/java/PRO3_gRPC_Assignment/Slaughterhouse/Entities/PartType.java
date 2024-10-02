package PRO3_gRPC_Assignment.Slaughterhouse.Entities;

public class PartType {
  private final String typeId;        // Unique identifier for the part type
  private final String partTypeName;           // Name of the part type (e.g., "Steak", "Chop", etc.)
  private final String partTypeDescription;    // Description of the part type

  public PartType(String typeId, String name, String description) {
    this.typeId = typeId;
    this.partTypeName = name;
    this.partTypeDescription = description;
  }

  public String getTypeId() {
    return typeId;
  }

  public String getName() {
    return partTypeName;
  }

  public String getDescription() {
    return partTypeDescription;
  }
  }

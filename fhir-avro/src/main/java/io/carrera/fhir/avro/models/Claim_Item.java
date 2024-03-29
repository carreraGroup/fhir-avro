/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package io.carrera.fhir.avro.models;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Claim_Item extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8461293987540206820L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Claim_Item\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"sequence\",\"type\":\"int\"},{\"name\":\"productOrService\",\"type\":{\"type\":\"record\",\"name\":\"CodeableConcept\",\"fields\":[{\"name\":\"coding\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userSelected\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}}],\"default\":null},{\"name\":\"text\",\"type\":[\"null\",\"string\"],\"default\":null}]}},{\"name\":\"serviced\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Date\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"record\",\"name\":\"XsDate\",\"fields\":[{\"name\":\"value\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}}]},{\"type\":\"record\",\"name\":\"XsYearMonth\",\"fields\":[{\"name\":\"year\",\"type\":\"int\"},{\"name\":\"month\",\"type\":\"int\"}]},{\"type\":\"record\",\"name\":\"XsYear\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"}]}]}]},{\"type\":\"record\",\"name\":\"Period\",\"fields\":[{\"name\":\"start\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DateTime\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"record\",\"name\":\"XsDateTime\",\"fields\":[{\"name\":\"millis\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"zoneId\",\"type\":\"string\"}]},\"XsDate\",\"XsYearMonth\",\"XsYear\"]}]}],\"default\":null},{\"name\":\"end\",\"type\":[\"null\",\"DateTime\"],\"default\":null}]}],\"default\":null},{\"name\":\"location\",\"type\":[\"null\",\"CodeableConcept\",{\"type\":\"record\",\"name\":\"Reference\",\"fields\":[{\"name\":\"reference\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"quantity\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Quantity\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Decimal\",\"fields\":[{\"name\":\"unscaled_value\",\"type\":\"bytes\",\"logicalType\":\"decimal\"},{\"name\":\"precision\",\"type\":\"int\"},{\"name\":\"scale\",\"type\":\"int\"}]}],\"default\":null},{\"name\":\"unit\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"comparator\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"revenue\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<Claim_Item> ENCODER =
      new BinaryMessageEncoder<Claim_Item>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Claim_Item> DECODER =
      new BinaryMessageDecoder<Claim_Item>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Claim_Item> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Claim_Item> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Claim_Item> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Claim_Item>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Claim_Item to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Claim_Item from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Claim_Item instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Claim_Item fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int sequence;
   private io.carrera.fhir.avro.models.CodeableConcept productOrService;
   private java.lang.Object serviced;
   private java.lang.Object location;
   private io.carrera.fhir.avro.models.Quantity quantity;
   private io.carrera.fhir.avro.models.CodeableConcept revenue;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Claim_Item() {}

  /**
   * All-args constructor.
   * @param sequence The new value for sequence
   * @param productOrService The new value for productOrService
   * @param serviced The new value for serviced
   * @param location The new value for location
   * @param quantity The new value for quantity
   * @param revenue The new value for revenue
   */
  public Claim_Item(java.lang.Integer sequence, io.carrera.fhir.avro.models.CodeableConcept productOrService, java.lang.Object serviced, java.lang.Object location, io.carrera.fhir.avro.models.Quantity quantity, io.carrera.fhir.avro.models.CodeableConcept revenue) {
    this.sequence = sequence;
    this.productOrService = productOrService;
    this.serviced = serviced;
    this.location = location;
    this.quantity = quantity;
    this.revenue = revenue;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return sequence;
    case 1: return productOrService;
    case 2: return serviced;
    case 3: return location;
    case 4: return quantity;
    case 5: return revenue;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: sequence = (java.lang.Integer)value$; break;
    case 1: productOrService = (io.carrera.fhir.avro.models.CodeableConcept)value$; break;
    case 2: serviced = value$; break;
    case 3: location = value$; break;
    case 4: quantity = (io.carrera.fhir.avro.models.Quantity)value$; break;
    case 5: revenue = (io.carrera.fhir.avro.models.CodeableConcept)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'sequence' field.
   * @return The value of the 'sequence' field.
   */
  public int getSequence() {
    return sequence;
  }


  /**
   * Sets the value of the 'sequence' field.
   * @param value the value to set.
   */
  public void setSequence(int value) {
    this.sequence = value;
  }

  /**
   * Gets the value of the 'productOrService' field.
   * @return The value of the 'productOrService' field.
   */
  public io.carrera.fhir.avro.models.CodeableConcept getProductOrService() {
    return productOrService;
  }


  /**
   * Sets the value of the 'productOrService' field.
   * @param value the value to set.
   */
  public void setProductOrService(io.carrera.fhir.avro.models.CodeableConcept value) {
    this.productOrService = value;
  }

  /**
   * Gets the value of the 'serviced' field.
   * @return The value of the 'serviced' field.
   */
  public java.lang.Object getServiced() {
    return serviced;
  }


  /**
   * Sets the value of the 'serviced' field.
   * @param value the value to set.
   */
  public void setServiced(java.lang.Object value) {
    this.serviced = value;
  }

  /**
   * Gets the value of the 'location' field.
   * @return The value of the 'location' field.
   */
  public java.lang.Object getLocation() {
    return location;
  }


  /**
   * Sets the value of the 'location' field.
   * @param value the value to set.
   */
  public void setLocation(java.lang.Object value) {
    this.location = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return The value of the 'quantity' field.
   */
  public io.carrera.fhir.avro.models.Quantity getQuantity() {
    return quantity;
  }


  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(io.carrera.fhir.avro.models.Quantity value) {
    this.quantity = value;
  }

  /**
   * Gets the value of the 'revenue' field.
   * @return The value of the 'revenue' field.
   */
  public io.carrera.fhir.avro.models.CodeableConcept getRevenue() {
    return revenue;
  }


  /**
   * Sets the value of the 'revenue' field.
   * @param value the value to set.
   */
  public void setRevenue(io.carrera.fhir.avro.models.CodeableConcept value) {
    this.revenue = value;
  }

  /**
   * Creates a new Claim_Item RecordBuilder.
   * @return A new Claim_Item RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Claim_Item.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Claim_Item.Builder();
  }

  /**
   * Creates a new Claim_Item RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Claim_Item RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Claim_Item.Builder newBuilder(io.carrera.fhir.avro.models.Claim_Item.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Claim_Item.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Claim_Item.Builder(other);
    }
  }

  /**
   * Creates a new Claim_Item RecordBuilder by copying an existing Claim_Item instance.
   * @param other The existing instance to copy.
   * @return A new Claim_Item RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Claim_Item.Builder newBuilder(io.carrera.fhir.avro.models.Claim_Item other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Claim_Item.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Claim_Item.Builder(other);
    }
  }

  /**
   * RecordBuilder for Claim_Item instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Claim_Item>
    implements org.apache.avro.data.RecordBuilder<Claim_Item> {

    private int sequence;
    private io.carrera.fhir.avro.models.CodeableConcept productOrService;
    private io.carrera.fhir.avro.models.CodeableConcept.Builder productOrServiceBuilder;
    private java.lang.Object serviced;
    private java.lang.Object location;
    private io.carrera.fhir.avro.models.Quantity quantity;
    private io.carrera.fhir.avro.models.Quantity.Builder quantityBuilder;
    private io.carrera.fhir.avro.models.CodeableConcept revenue;
    private io.carrera.fhir.avro.models.CodeableConcept.Builder revenueBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Claim_Item.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.sequence)) {
        this.sequence = data().deepCopy(fields()[0].schema(), other.sequence);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.productOrService)) {
        this.productOrService = data().deepCopy(fields()[1].schema(), other.productOrService);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasProductOrServiceBuilder()) {
        this.productOrServiceBuilder = io.carrera.fhir.avro.models.CodeableConcept.newBuilder(other.getProductOrServiceBuilder());
      }
      if (isValidValue(fields()[2], other.serviced)) {
        this.serviced = data().deepCopy(fields()[2].schema(), other.serviced);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.location)) {
        this.location = data().deepCopy(fields()[3].schema(), other.location);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.quantity)) {
        this.quantity = data().deepCopy(fields()[4].schema(), other.quantity);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (other.hasQuantityBuilder()) {
        this.quantityBuilder = io.carrera.fhir.avro.models.Quantity.newBuilder(other.getQuantityBuilder());
      }
      if (isValidValue(fields()[5], other.revenue)) {
        this.revenue = data().deepCopy(fields()[5].schema(), other.revenue);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (other.hasRevenueBuilder()) {
        this.revenueBuilder = io.carrera.fhir.avro.models.CodeableConcept.newBuilder(other.getRevenueBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Claim_Item instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Claim_Item other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.sequence)) {
        this.sequence = data().deepCopy(fields()[0].schema(), other.sequence);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.productOrService)) {
        this.productOrService = data().deepCopy(fields()[1].schema(), other.productOrService);
        fieldSetFlags()[1] = true;
      }
      this.productOrServiceBuilder = null;
      if (isValidValue(fields()[2], other.serviced)) {
        this.serviced = data().deepCopy(fields()[2].schema(), other.serviced);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.location)) {
        this.location = data().deepCopy(fields()[3].schema(), other.location);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.quantity)) {
        this.quantity = data().deepCopy(fields()[4].schema(), other.quantity);
        fieldSetFlags()[4] = true;
      }
      this.quantityBuilder = null;
      if (isValidValue(fields()[5], other.revenue)) {
        this.revenue = data().deepCopy(fields()[5].schema(), other.revenue);
        fieldSetFlags()[5] = true;
      }
      this.revenueBuilder = null;
    }

    /**
      * Gets the value of the 'sequence' field.
      * @return The value.
      */
    public int getSequence() {
      return sequence;
    }


    /**
      * Sets the value of the 'sequence' field.
      * @param value The value of 'sequence'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Item.Builder setSequence(int value) {
      validate(fields()[0], value);
      this.sequence = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'sequence' field has been set.
      * @return True if the 'sequence' field has been set, false otherwise.
      */
    public boolean hasSequence() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'sequence' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Item.Builder clearSequence() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'productOrService' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.CodeableConcept getProductOrService() {
      return productOrService;
    }


    /**
      * Sets the value of the 'productOrService' field.
      * @param value The value of 'productOrService'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Item.Builder setProductOrService(io.carrera.fhir.avro.models.CodeableConcept value) {
      validate(fields()[1], value);
      this.productOrServiceBuilder = null;
      this.productOrService = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'productOrService' field has been set.
      * @return True if the 'productOrService' field has been set, false otherwise.
      */
    public boolean hasProductOrService() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'productOrService' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.CodeableConcept.Builder getProductOrServiceBuilder() {
      if (productOrServiceBuilder == null) {
        if (hasProductOrService()) {
          setProductOrServiceBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder(productOrService));
        } else {
          setProductOrServiceBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder());
        }
      }
      return productOrServiceBuilder;
    }

    /**
     * Sets the Builder instance for the 'productOrService' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Claim_Item.Builder setProductOrServiceBuilder(io.carrera.fhir.avro.models.CodeableConcept.Builder value) {
      clearProductOrService();
      productOrServiceBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'productOrService' field has an active Builder instance
     * @return True if the 'productOrService' field has an active Builder instance
     */
    public boolean hasProductOrServiceBuilder() {
      return productOrServiceBuilder != null;
    }

    /**
      * Clears the value of the 'productOrService' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Item.Builder clearProductOrService() {
      productOrService = null;
      productOrServiceBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'serviced' field.
      * @return The value.
      */
    public java.lang.Object getServiced() {
      return serviced;
    }


    /**
      * Sets the value of the 'serviced' field.
      * @param value The value of 'serviced'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Item.Builder setServiced(java.lang.Object value) {
      validate(fields()[2], value);
      this.serviced = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'serviced' field has been set.
      * @return True if the 'serviced' field has been set, false otherwise.
      */
    public boolean hasServiced() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'serviced' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Item.Builder clearServiced() {
      serviced = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'location' field.
      * @return The value.
      */
    public java.lang.Object getLocation() {
      return location;
    }


    /**
      * Sets the value of the 'location' field.
      * @param value The value of 'location'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Item.Builder setLocation(java.lang.Object value) {
      validate(fields()[3], value);
      this.location = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'location' field has been set.
      * @return True if the 'location' field has been set, false otherwise.
      */
    public boolean hasLocation() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'location' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Item.Builder clearLocation() {
      location = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.Quantity getQuantity() {
      return quantity;
    }


    /**
      * Sets the value of the 'quantity' field.
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Item.Builder setQuantity(io.carrera.fhir.avro.models.Quantity value) {
      validate(fields()[4], value);
      this.quantityBuilder = null;
      this.quantity = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'quantity' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Quantity.Builder getQuantityBuilder() {
      if (quantityBuilder == null) {
        if (hasQuantity()) {
          setQuantityBuilder(io.carrera.fhir.avro.models.Quantity.newBuilder(quantity));
        } else {
          setQuantityBuilder(io.carrera.fhir.avro.models.Quantity.newBuilder());
        }
      }
      return quantityBuilder;
    }

    /**
     * Sets the Builder instance for the 'quantity' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Claim_Item.Builder setQuantityBuilder(io.carrera.fhir.avro.models.Quantity.Builder value) {
      clearQuantity();
      quantityBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'quantity' field has an active Builder instance
     * @return True if the 'quantity' field has an active Builder instance
     */
    public boolean hasQuantityBuilder() {
      return quantityBuilder != null;
    }

    /**
      * Clears the value of the 'quantity' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Item.Builder clearQuantity() {
      quantity = null;
      quantityBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'revenue' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.CodeableConcept getRevenue() {
      return revenue;
    }


    /**
      * Sets the value of the 'revenue' field.
      * @param value The value of 'revenue'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Item.Builder setRevenue(io.carrera.fhir.avro.models.CodeableConcept value) {
      validate(fields()[5], value);
      this.revenueBuilder = null;
      this.revenue = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'revenue' field has been set.
      * @return True if the 'revenue' field has been set, false otherwise.
      */
    public boolean hasRevenue() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'revenue' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.CodeableConcept.Builder getRevenueBuilder() {
      if (revenueBuilder == null) {
        if (hasRevenue()) {
          setRevenueBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder(revenue));
        } else {
          setRevenueBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder());
        }
      }
      return revenueBuilder;
    }

    /**
     * Sets the Builder instance for the 'revenue' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Claim_Item.Builder setRevenueBuilder(io.carrera.fhir.avro.models.CodeableConcept.Builder value) {
      clearRevenue();
      revenueBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'revenue' field has an active Builder instance
     * @return True if the 'revenue' field has an active Builder instance
     */
    public boolean hasRevenueBuilder() {
      return revenueBuilder != null;
    }

    /**
      * Clears the value of the 'revenue' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Item.Builder clearRevenue() {
      revenue = null;
      revenueBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Claim_Item build() {
      try {
        Claim_Item record = new Claim_Item();
        record.sequence = fieldSetFlags()[0] ? this.sequence : (java.lang.Integer) defaultValue(fields()[0]);
        if (productOrServiceBuilder != null) {
          try {
            record.productOrService = this.productOrServiceBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("productOrService"));
            throw e;
          }
        } else {
          record.productOrService = fieldSetFlags()[1] ? this.productOrService : (io.carrera.fhir.avro.models.CodeableConcept) defaultValue(fields()[1]);
        }
        record.serviced = fieldSetFlags()[2] ? this.serviced :  defaultValue(fields()[2]);
        record.location = fieldSetFlags()[3] ? this.location :  defaultValue(fields()[3]);
        if (quantityBuilder != null) {
          try {
            record.quantity = this.quantityBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("quantity"));
            throw e;
          }
        } else {
          record.quantity = fieldSetFlags()[4] ? this.quantity : (io.carrera.fhir.avro.models.Quantity) defaultValue(fields()[4]);
        }
        if (revenueBuilder != null) {
          try {
            record.revenue = this.revenueBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("revenue"));
            throw e;
          }
        } else {
          record.revenue = fieldSetFlags()[5] ? this.revenue : (io.carrera.fhir.avro.models.CodeableConcept) defaultValue(fields()[5]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Claim_Item>
    WRITER$ = (org.apache.avro.io.DatumWriter<Claim_Item>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Claim_Item>
    READER$ = (org.apache.avro.io.DatumReader<Claim_Item>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}











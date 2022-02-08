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
public class Claim_Procedure extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 7916688325798438122L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Claim_Procedure\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"sequence\",\"type\":\"int\"},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CodeableConcept\",\"fields\":[{\"name\":\"coding\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userSelected\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}}],\"default\":null},{\"name\":\"text\",\"type\":[\"null\",\"string\"],\"default\":null}]}}],\"default\":null},{\"name\":\"date\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"DateTime\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"record\",\"name\":\"XsDateTime\",\"fields\":[{\"name\":\"millis\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"zoneId\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"XsDate\",\"fields\":[{\"name\":\"value\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}}]},{\"type\":\"record\",\"name\":\"XsYearMonth\",\"fields\":[{\"name\":\"year\",\"type\":\"int\"},{\"name\":\"month\",\"type\":\"int\"}]},{\"type\":\"record\",\"name\":\"XsYear\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"}]}]}]}],\"default\":null},{\"name\":\"procedure\",\"type\":[{\"type\":\"record\",\"name\":\"Reference\",\"fields\":[{\"name\":\"reference\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null}]},\"CodeableConcept\"]},{\"name\":\"udi\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Reference\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<Claim_Procedure> ENCODER =
      new BinaryMessageEncoder<Claim_Procedure>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Claim_Procedure> DECODER =
      new BinaryMessageDecoder<Claim_Procedure>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Claim_Procedure> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Claim_Procedure> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Claim_Procedure> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Claim_Procedure>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Claim_Procedure to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Claim_Procedure from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Claim_Procedure instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Claim_Procedure fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int sequence;
   private java.util.List<io.carrera.fhir.avro.models.CodeableConcept> type;
   private io.carrera.fhir.avro.models.DateTime date;
   private java.lang.Object procedure;
   private java.util.List<io.carrera.fhir.avro.models.Reference> udi;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Claim_Procedure() {}

  /**
   * All-args constructor.
   * @param sequence The new value for sequence
   * @param type The new value for type
   * @param date The new value for date
   * @param procedure The new value for procedure
   * @param udi The new value for udi
   */
  public Claim_Procedure(java.lang.Integer sequence, java.util.List<io.carrera.fhir.avro.models.CodeableConcept> type, io.carrera.fhir.avro.models.DateTime date, java.lang.Object procedure, java.util.List<io.carrera.fhir.avro.models.Reference> udi) {
    this.sequence = sequence;
    this.type = type;
    this.date = date;
    this.procedure = procedure;
    this.udi = udi;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return sequence;
    case 1: return type;
    case 2: return date;
    case 3: return procedure;
    case 4: return udi;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: sequence = (java.lang.Integer)value$; break;
    case 1: type = (java.util.List<io.carrera.fhir.avro.models.CodeableConcept>)value$; break;
    case 2: date = (io.carrera.fhir.avro.models.DateTime)value$; break;
    case 3: procedure = value$; break;
    case 4: udi = (java.util.List<io.carrera.fhir.avro.models.Reference>)value$; break;
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
   * Gets the value of the 'type' field.
   * @return The value of the 'type' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.CodeableConcept> getType() {
    return type;
  }


  /**
   * Sets the value of the 'type' field.
   * @param value the value to set.
   */
  public void setType(java.util.List<io.carrera.fhir.avro.models.CodeableConcept> value) {
    this.type = value;
  }

  /**
   * Gets the value of the 'date' field.
   * @return The value of the 'date' field.
   */
  public io.carrera.fhir.avro.models.DateTime getDate() {
    return date;
  }


  /**
   * Sets the value of the 'date' field.
   * @param value the value to set.
   */
  public void setDate(io.carrera.fhir.avro.models.DateTime value) {
    this.date = value;
  }

  /**
   * Gets the value of the 'procedure' field.
   * @return The value of the 'procedure' field.
   */
  public java.lang.Object getProcedure() {
    return procedure;
  }


  /**
   * Sets the value of the 'procedure' field.
   * @param value the value to set.
   */
  public void setProcedure(java.lang.Object value) {
    this.procedure = value;
  }

  /**
   * Gets the value of the 'udi' field.
   * @return The value of the 'udi' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.Reference> getUdi() {
    return udi;
  }


  /**
   * Sets the value of the 'udi' field.
   * @param value the value to set.
   */
  public void setUdi(java.util.List<io.carrera.fhir.avro.models.Reference> value) {
    this.udi = value;
  }

  /**
   * Creates a new Claim_Procedure RecordBuilder.
   * @return A new Claim_Procedure RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Claim_Procedure.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Claim_Procedure.Builder();
  }

  /**
   * Creates a new Claim_Procedure RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Claim_Procedure RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Claim_Procedure.Builder newBuilder(io.carrera.fhir.avro.models.Claim_Procedure.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Claim_Procedure.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Claim_Procedure.Builder(other);
    }
  }

  /**
   * Creates a new Claim_Procedure RecordBuilder by copying an existing Claim_Procedure instance.
   * @param other The existing instance to copy.
   * @return A new Claim_Procedure RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Claim_Procedure.Builder newBuilder(io.carrera.fhir.avro.models.Claim_Procedure other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Claim_Procedure.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Claim_Procedure.Builder(other);
    }
  }

  /**
   * RecordBuilder for Claim_Procedure instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Claim_Procedure>
    implements org.apache.avro.data.RecordBuilder<Claim_Procedure> {

    private int sequence;
    private java.util.List<io.carrera.fhir.avro.models.CodeableConcept> type;
    private io.carrera.fhir.avro.models.DateTime date;
    private io.carrera.fhir.avro.models.DateTime.Builder dateBuilder;
    private java.lang.Object procedure;
    private java.util.List<io.carrera.fhir.avro.models.Reference> udi;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Claim_Procedure.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.sequence)) {
        this.sequence = data().deepCopy(fields()[0].schema(), other.sequence);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.date)) {
        this.date = data().deepCopy(fields()[2].schema(), other.date);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasDateBuilder()) {
        this.dateBuilder = io.carrera.fhir.avro.models.DateTime.newBuilder(other.getDateBuilder());
      }
      if (isValidValue(fields()[3], other.procedure)) {
        this.procedure = data().deepCopy(fields()[3].schema(), other.procedure);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.udi)) {
        this.udi = data().deepCopy(fields()[4].schema(), other.udi);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing Claim_Procedure instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Claim_Procedure other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.sequence)) {
        this.sequence = data().deepCopy(fields()[0].schema(), other.sequence);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.type)) {
        this.type = data().deepCopy(fields()[1].schema(), other.type);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.date)) {
        this.date = data().deepCopy(fields()[2].schema(), other.date);
        fieldSetFlags()[2] = true;
      }
      this.dateBuilder = null;
      if (isValidValue(fields()[3], other.procedure)) {
        this.procedure = data().deepCopy(fields()[3].schema(), other.procedure);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.udi)) {
        this.udi = data().deepCopy(fields()[4].schema(), other.udi);
        fieldSetFlags()[4] = true;
      }
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
    public io.carrera.fhir.avro.models.Claim_Procedure.Builder setSequence(int value) {
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
    public io.carrera.fhir.avro.models.Claim_Procedure.Builder clearSequence() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'type' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.CodeableConcept> getType() {
      return type;
    }


    /**
      * Sets the value of the 'type' field.
      * @param value The value of 'type'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Procedure.Builder setType(java.util.List<io.carrera.fhir.avro.models.CodeableConcept> value) {
      validate(fields()[1], value);
      this.type = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Procedure.Builder clearType() {
      type = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'date' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.DateTime getDate() {
      return date;
    }


    /**
      * Sets the value of the 'date' field.
      * @param value The value of 'date'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Procedure.Builder setDate(io.carrera.fhir.avro.models.DateTime value) {
      validate(fields()[2], value);
      this.dateBuilder = null;
      this.date = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'date' field has been set.
      * @return True if the 'date' field has been set, false otherwise.
      */
    public boolean hasDate() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'date' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.DateTime.Builder getDateBuilder() {
      if (dateBuilder == null) {
        if (hasDate()) {
          setDateBuilder(io.carrera.fhir.avro.models.DateTime.newBuilder(date));
        } else {
          setDateBuilder(io.carrera.fhir.avro.models.DateTime.newBuilder());
        }
      }
      return dateBuilder;
    }

    /**
     * Sets the Builder instance for the 'date' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Claim_Procedure.Builder setDateBuilder(io.carrera.fhir.avro.models.DateTime.Builder value) {
      clearDate();
      dateBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'date' field has an active Builder instance
     * @return True if the 'date' field has an active Builder instance
     */
    public boolean hasDateBuilder() {
      return dateBuilder != null;
    }

    /**
      * Clears the value of the 'date' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Procedure.Builder clearDate() {
      date = null;
      dateBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'procedure' field.
      * @return The value.
      */
    public java.lang.Object getProcedure() {
      return procedure;
    }


    /**
      * Sets the value of the 'procedure' field.
      * @param value The value of 'procedure'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Procedure.Builder setProcedure(java.lang.Object value) {
      validate(fields()[3], value);
      this.procedure = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'procedure' field has been set.
      * @return True if the 'procedure' field has been set, false otherwise.
      */
    public boolean hasProcedure() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'procedure' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Procedure.Builder clearProcedure() {
      procedure = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'udi' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.Reference> getUdi() {
      return udi;
    }


    /**
      * Sets the value of the 'udi' field.
      * @param value The value of 'udi'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Procedure.Builder setUdi(java.util.List<io.carrera.fhir.avro.models.Reference> value) {
      validate(fields()[4], value);
      this.udi = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'udi' field has been set.
      * @return True if the 'udi' field has been set, false otherwise.
      */
    public boolean hasUdi() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'udi' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Procedure.Builder clearUdi() {
      udi = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Claim_Procedure build() {
      try {
        Claim_Procedure record = new Claim_Procedure();
        record.sequence = fieldSetFlags()[0] ? this.sequence : (java.lang.Integer) defaultValue(fields()[0]);
        record.type = fieldSetFlags()[1] ? this.type : (java.util.List<io.carrera.fhir.avro.models.CodeableConcept>) defaultValue(fields()[1]);
        if (dateBuilder != null) {
          try {
            record.date = this.dateBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("date"));
            throw e;
          }
        } else {
          record.date = fieldSetFlags()[2] ? this.date : (io.carrera.fhir.avro.models.DateTime) defaultValue(fields()[2]);
        }
        record.procedure = fieldSetFlags()[3] ? this.procedure :  defaultValue(fields()[3]);
        record.udi = fieldSetFlags()[4] ? this.udi : (java.util.List<io.carrera.fhir.avro.models.Reference>) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Claim_Procedure>
    WRITER$ = (org.apache.avro.io.DatumWriter<Claim_Procedure>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Claim_Procedure>
    READER$ = (org.apache.avro.io.DatumReader<Claim_Procedure>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










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
public class Claim_Diagnosis extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -487595426978769899L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Claim_Diagnosis\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"sequence\",\"type\":\"int\"},{\"name\":\"diagnosis\",\"type\":[{\"type\":\"record\",\"name\":\"Reference\",\"fields\":[{\"name\":\"reference\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"CodeableConcept\",\"fields\":[{\"name\":\"coding\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userSelected\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}}],\"default\":null},{\"name\":\"text\",\"type\":[\"null\",\"string\"],\"default\":null}]}]},{\"name\":\"type\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"CodeableConcept\"}],\"default\":null},{\"name\":\"onAdmission\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"packageCode\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Claim_Diagnosis> ENCODER =
      new BinaryMessageEncoder<Claim_Diagnosis>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Claim_Diagnosis> DECODER =
      new BinaryMessageDecoder<Claim_Diagnosis>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Claim_Diagnosis> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Claim_Diagnosis> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Claim_Diagnosis> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Claim_Diagnosis>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Claim_Diagnosis to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Claim_Diagnosis from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Claim_Diagnosis instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Claim_Diagnosis fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int sequence;
   private java.lang.Object diagnosis;
   private java.util.List<io.carrera.fhir.avro.models.CodeableConcept> type;
   private io.carrera.fhir.avro.models.CodeableConcept onAdmission;
   private io.carrera.fhir.avro.models.CodeableConcept packageCode;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Claim_Diagnosis() {}

  /**
   * All-args constructor.
   * @param sequence The new value for sequence
   * @param diagnosis The new value for diagnosis
   * @param type The new value for type
   * @param onAdmission The new value for onAdmission
   * @param packageCode The new value for packageCode
   */
  public Claim_Diagnosis(java.lang.Integer sequence, java.lang.Object diagnosis, java.util.List<io.carrera.fhir.avro.models.CodeableConcept> type, io.carrera.fhir.avro.models.CodeableConcept onAdmission, io.carrera.fhir.avro.models.CodeableConcept packageCode) {
    this.sequence = sequence;
    this.diagnosis = diagnosis;
    this.type = type;
    this.onAdmission = onAdmission;
    this.packageCode = packageCode;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return sequence;
    case 1: return diagnosis;
    case 2: return type;
    case 3: return onAdmission;
    case 4: return packageCode;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: sequence = (java.lang.Integer)value$; break;
    case 1: diagnosis = value$; break;
    case 2: type = (java.util.List<io.carrera.fhir.avro.models.CodeableConcept>)value$; break;
    case 3: onAdmission = (io.carrera.fhir.avro.models.CodeableConcept)value$; break;
    case 4: packageCode = (io.carrera.fhir.avro.models.CodeableConcept)value$; break;
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
   * Gets the value of the 'diagnosis' field.
   * @return The value of the 'diagnosis' field.
   */
  public java.lang.Object getDiagnosis() {
    return diagnosis;
  }


  /**
   * Sets the value of the 'diagnosis' field.
   * @param value the value to set.
   */
  public void setDiagnosis(java.lang.Object value) {
    this.diagnosis = value;
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
   * Gets the value of the 'onAdmission' field.
   * @return The value of the 'onAdmission' field.
   */
  public io.carrera.fhir.avro.models.CodeableConcept getOnAdmission() {
    return onAdmission;
  }


  /**
   * Sets the value of the 'onAdmission' field.
   * @param value the value to set.
   */
  public void setOnAdmission(io.carrera.fhir.avro.models.CodeableConcept value) {
    this.onAdmission = value;
  }

  /**
   * Gets the value of the 'packageCode' field.
   * @return The value of the 'packageCode' field.
   */
  public io.carrera.fhir.avro.models.CodeableConcept getPackageCode() {
    return packageCode;
  }


  /**
   * Sets the value of the 'packageCode' field.
   * @param value the value to set.
   */
  public void setPackageCode(io.carrera.fhir.avro.models.CodeableConcept value) {
    this.packageCode = value;
  }

  /**
   * Creates a new Claim_Diagnosis RecordBuilder.
   * @return A new Claim_Diagnosis RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Claim_Diagnosis.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Claim_Diagnosis.Builder();
  }

  /**
   * Creates a new Claim_Diagnosis RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Claim_Diagnosis RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Claim_Diagnosis.Builder newBuilder(io.carrera.fhir.avro.models.Claim_Diagnosis.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Claim_Diagnosis.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Claim_Diagnosis.Builder(other);
    }
  }

  /**
   * Creates a new Claim_Diagnosis RecordBuilder by copying an existing Claim_Diagnosis instance.
   * @param other The existing instance to copy.
   * @return A new Claim_Diagnosis RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Claim_Diagnosis.Builder newBuilder(io.carrera.fhir.avro.models.Claim_Diagnosis other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Claim_Diagnosis.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Claim_Diagnosis.Builder(other);
    }
  }

  /**
   * RecordBuilder for Claim_Diagnosis instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Claim_Diagnosis>
    implements org.apache.avro.data.RecordBuilder<Claim_Diagnosis> {

    private int sequence;
    private java.lang.Object diagnosis;
    private java.util.List<io.carrera.fhir.avro.models.CodeableConcept> type;
    private io.carrera.fhir.avro.models.CodeableConcept onAdmission;
    private io.carrera.fhir.avro.models.CodeableConcept.Builder onAdmissionBuilder;
    private io.carrera.fhir.avro.models.CodeableConcept packageCode;
    private io.carrera.fhir.avro.models.CodeableConcept.Builder packageCodeBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Claim_Diagnosis.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.sequence)) {
        this.sequence = data().deepCopy(fields()[0].schema(), other.sequence);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.diagnosis)) {
        this.diagnosis = data().deepCopy(fields()[1].schema(), other.diagnosis);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.onAdmission)) {
        this.onAdmission = data().deepCopy(fields()[3].schema(), other.onAdmission);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasOnAdmissionBuilder()) {
        this.onAdmissionBuilder = io.carrera.fhir.avro.models.CodeableConcept.newBuilder(other.getOnAdmissionBuilder());
      }
      if (isValidValue(fields()[4], other.packageCode)) {
        this.packageCode = data().deepCopy(fields()[4].schema(), other.packageCode);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (other.hasPackageCodeBuilder()) {
        this.packageCodeBuilder = io.carrera.fhir.avro.models.CodeableConcept.newBuilder(other.getPackageCodeBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing Claim_Diagnosis instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Claim_Diagnosis other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.sequence)) {
        this.sequence = data().deepCopy(fields()[0].schema(), other.sequence);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.diagnosis)) {
        this.diagnosis = data().deepCopy(fields()[1].schema(), other.diagnosis);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.type)) {
        this.type = data().deepCopy(fields()[2].schema(), other.type);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.onAdmission)) {
        this.onAdmission = data().deepCopy(fields()[3].schema(), other.onAdmission);
        fieldSetFlags()[3] = true;
      }
      this.onAdmissionBuilder = null;
      if (isValidValue(fields()[4], other.packageCode)) {
        this.packageCode = data().deepCopy(fields()[4].schema(), other.packageCode);
        fieldSetFlags()[4] = true;
      }
      this.packageCodeBuilder = null;
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
    public io.carrera.fhir.avro.models.Claim_Diagnosis.Builder setSequence(int value) {
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
    public io.carrera.fhir.avro.models.Claim_Diagnosis.Builder clearSequence() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'diagnosis' field.
      * @return The value.
      */
    public java.lang.Object getDiagnosis() {
      return diagnosis;
    }


    /**
      * Sets the value of the 'diagnosis' field.
      * @param value The value of 'diagnosis'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Diagnosis.Builder setDiagnosis(java.lang.Object value) {
      validate(fields()[1], value);
      this.diagnosis = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'diagnosis' field has been set.
      * @return True if the 'diagnosis' field has been set, false otherwise.
      */
    public boolean hasDiagnosis() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'diagnosis' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Diagnosis.Builder clearDiagnosis() {
      diagnosis = null;
      fieldSetFlags()[1] = false;
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
    public io.carrera.fhir.avro.models.Claim_Diagnosis.Builder setType(java.util.List<io.carrera.fhir.avro.models.CodeableConcept> value) {
      validate(fields()[2], value);
      this.type = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'type' field has been set.
      * @return True if the 'type' field has been set, false otherwise.
      */
    public boolean hasType() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'type' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Diagnosis.Builder clearType() {
      type = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'onAdmission' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.CodeableConcept getOnAdmission() {
      return onAdmission;
    }


    /**
      * Sets the value of the 'onAdmission' field.
      * @param value The value of 'onAdmission'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Diagnosis.Builder setOnAdmission(io.carrera.fhir.avro.models.CodeableConcept value) {
      validate(fields()[3], value);
      this.onAdmissionBuilder = null;
      this.onAdmission = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'onAdmission' field has been set.
      * @return True if the 'onAdmission' field has been set, false otherwise.
      */
    public boolean hasOnAdmission() {
      return fieldSetFlags()[3];
    }

    /**
     * Gets the Builder instance for the 'onAdmission' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.CodeableConcept.Builder getOnAdmissionBuilder() {
      if (onAdmissionBuilder == null) {
        if (hasOnAdmission()) {
          setOnAdmissionBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder(onAdmission));
        } else {
          setOnAdmissionBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder());
        }
      }
      return onAdmissionBuilder;
    }

    /**
     * Sets the Builder instance for the 'onAdmission' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Claim_Diagnosis.Builder setOnAdmissionBuilder(io.carrera.fhir.avro.models.CodeableConcept.Builder value) {
      clearOnAdmission();
      onAdmissionBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'onAdmission' field has an active Builder instance
     * @return True if the 'onAdmission' field has an active Builder instance
     */
    public boolean hasOnAdmissionBuilder() {
      return onAdmissionBuilder != null;
    }

    /**
      * Clears the value of the 'onAdmission' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Diagnosis.Builder clearOnAdmission() {
      onAdmission = null;
      onAdmissionBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'packageCode' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.CodeableConcept getPackageCode() {
      return packageCode;
    }


    /**
      * Sets the value of the 'packageCode' field.
      * @param value The value of 'packageCode'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Diagnosis.Builder setPackageCode(io.carrera.fhir.avro.models.CodeableConcept value) {
      validate(fields()[4], value);
      this.packageCodeBuilder = null;
      this.packageCode = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'packageCode' field has been set.
      * @return True if the 'packageCode' field has been set, false otherwise.
      */
    public boolean hasPackageCode() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'packageCode' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.CodeableConcept.Builder getPackageCodeBuilder() {
      if (packageCodeBuilder == null) {
        if (hasPackageCode()) {
          setPackageCodeBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder(packageCode));
        } else {
          setPackageCodeBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder());
        }
      }
      return packageCodeBuilder;
    }

    /**
     * Sets the Builder instance for the 'packageCode' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Claim_Diagnosis.Builder setPackageCodeBuilder(io.carrera.fhir.avro.models.CodeableConcept.Builder value) {
      clearPackageCode();
      packageCodeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'packageCode' field has an active Builder instance
     * @return True if the 'packageCode' field has an active Builder instance
     */
    public boolean hasPackageCodeBuilder() {
      return packageCodeBuilder != null;
    }

    /**
      * Clears the value of the 'packageCode' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Claim_Diagnosis.Builder clearPackageCode() {
      packageCode = null;
      packageCodeBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Claim_Diagnosis build() {
      try {
        Claim_Diagnosis record = new Claim_Diagnosis();
        record.sequence = fieldSetFlags()[0] ? this.sequence : (java.lang.Integer) defaultValue(fields()[0]);
        record.diagnosis = fieldSetFlags()[1] ? this.diagnosis :  defaultValue(fields()[1]);
        record.type = fieldSetFlags()[2] ? this.type : (java.util.List<io.carrera.fhir.avro.models.CodeableConcept>) defaultValue(fields()[2]);
        if (onAdmissionBuilder != null) {
          try {
            record.onAdmission = this.onAdmissionBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("onAdmission"));
            throw e;
          }
        } else {
          record.onAdmission = fieldSetFlags()[3] ? this.onAdmission : (io.carrera.fhir.avro.models.CodeableConcept) defaultValue(fields()[3]);
        }
        if (packageCodeBuilder != null) {
          try {
            record.packageCode = this.packageCodeBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("packageCode"));
            throw e;
          }
        } else {
          record.packageCode = fieldSetFlags()[4] ? this.packageCode : (io.carrera.fhir.avro.models.CodeableConcept) defaultValue(fields()[4]);
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
  private static final org.apache.avro.io.DatumWriter<Claim_Diagnosis>
    WRITER$ = (org.apache.avro.io.DatumWriter<Claim_Diagnosis>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Claim_Diagnosis>
    READER$ = (org.apache.avro.io.DatumReader<Claim_Diagnosis>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}











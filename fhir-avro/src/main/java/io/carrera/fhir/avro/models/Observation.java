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
public class Observation extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1560923457748360316L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Observation\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"status\",\"type\":\"string\"},{\"name\":\"category\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"CodeableConcept\",\"fields\":[{\"name\":\"coding\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userSelected\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}}],\"default\":null},{\"name\":\"text\",\"type\":[\"null\",\"string\"],\"default\":null}]}}],\"default\":null},{\"name\":\"code\",\"type\":\"CodeableConcept\"},{\"name\":\"subject\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Reference\",\"fields\":[{\"name\":\"reference\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"encounter\",\"type\":[\"null\",\"Reference\"],\"default\":null},{\"name\":\"effective\",\"type\":[\"null\",{\"type\":\"int\",\"logicalType\":\"date\"},{\"type\":\"record\",\"name\":\"DateTime\",\"fields\":[{\"name\":\"localDateTime\",\"type\":{\"type\":\"long\",\"logicalType\":\"timestamp-millis\"}},{\"name\":\"zoneId\",\"type\":\"string\"}]}],\"default\":null},{\"name\":\"issued\",\"type\":[\"null\",\"int\"],\"default\":null,\"logicalType\":\"date\"},{\"name\":\"value\",\"type\":[\"null\",\"string\",\"int\",\"boolean\",{\"type\":\"record\",\"name\":\"Quantity\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Decimal\",\"fields\":[{\"name\":\"unscaled_value\",\"type\":\"bytes\",\"logicalType\":\"decimal\"},{\"name\":\"precision\",\"type\":\"int\"},{\"name\":\"scale\",\"type\":\"int\"}]}],\"default\":null},{\"name\":\"unit\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"comparator\",\"type\":[\"null\",\"string\"],\"default\":null}]},\"CodeableConcept\"],\"default\":null},{\"name\":\"interpretation\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"CodeableConcept\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.TimestampMillisConversion());
  }

  private static final BinaryMessageEncoder<Observation> ENCODER =
      new BinaryMessageEncoder<Observation>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Observation> DECODER =
      new BinaryMessageDecoder<Observation>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Observation> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Observation> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Observation> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Observation>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Observation to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Observation from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Observation instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Observation fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence resourceType;
   private java.lang.CharSequence id;
   private java.lang.CharSequence status;
   private java.util.List<io.carrera.fhir.avro.models.CodeableConcept> category;
   private io.carrera.fhir.avro.models.CodeableConcept code;
   private io.carrera.fhir.avro.models.Reference subject;
   private io.carrera.fhir.avro.models.Reference encounter;
   private java.lang.Object effective;
   private java.lang.Integer issued;
   private java.lang.Object value;
   private java.util.List<io.carrera.fhir.avro.models.CodeableConcept> interpretation;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Observation() {}

  /**
   * All-args constructor.
   * @param resourceType The new value for resourceType
   * @param id The new value for id
   * @param status The new value for status
   * @param category The new value for category
   * @param code The new value for code
   * @param subject The new value for subject
   * @param encounter The new value for encounter
   * @param effective The new value for effective
   * @param issued The new value for issued
   * @param value The new value for value
   * @param interpretation The new value for interpretation
   */
  public Observation(java.lang.CharSequence resourceType, java.lang.CharSequence id, java.lang.CharSequence status, java.util.List<io.carrera.fhir.avro.models.CodeableConcept> category, io.carrera.fhir.avro.models.CodeableConcept code, io.carrera.fhir.avro.models.Reference subject, io.carrera.fhir.avro.models.Reference encounter, java.lang.Object effective, java.lang.Integer issued, java.lang.Object value, java.util.List<io.carrera.fhir.avro.models.CodeableConcept> interpretation) {
    this.resourceType = resourceType;
    this.id = id;
    this.status = status;
    this.category = category;
    this.code = code;
    this.subject = subject;
    this.encounter = encounter;
    this.effective = effective;
    this.issued = issued;
    this.value = value;
    this.interpretation = interpretation;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return resourceType;
    case 1: return id;
    case 2: return status;
    case 3: return category;
    case 4: return code;
    case 5: return subject;
    case 6: return encounter;
    case 7: return effective;
    case 8: return issued;
    case 9: return value;
    case 10: return interpretation;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: resourceType = (java.lang.CharSequence)value$; break;
    case 1: id = (java.lang.CharSequence)value$; break;
    case 2: status = (java.lang.CharSequence)value$; break;
    case 3: category = (java.util.List<io.carrera.fhir.avro.models.CodeableConcept>)value$; break;
    case 4: code = (io.carrera.fhir.avro.models.CodeableConcept)value$; break;
    case 5: subject = (io.carrera.fhir.avro.models.Reference)value$; break;
    case 6: encounter = (io.carrera.fhir.avro.models.Reference)value$; break;
    case 7: effective = value$; break;
    case 8: issued = (java.lang.Integer)value$; break;
    case 9: value = value$; break;
    case 10: interpretation = (java.util.List<io.carrera.fhir.avro.models.CodeableConcept>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'resourceType' field.
   * @return The value of the 'resourceType' field.
   */
  public java.lang.CharSequence getResourceType() {
    return resourceType;
  }


  /**
   * Sets the value of the 'resourceType' field.
   * @param value the value to set.
   */
  public void setResourceType(java.lang.CharSequence value) {
    this.resourceType = value;
  }

  /**
   * Gets the value of the 'id' field.
   * @return The value of the 'id' field.
   */
  public java.lang.CharSequence getId() {
    return id;
  }


  /**
   * Sets the value of the 'id' field.
   * @param value the value to set.
   */
  public void setId(java.lang.CharSequence value) {
    this.id = value;
  }

  /**
   * Gets the value of the 'status' field.
   * @return The value of the 'status' field.
   */
  public java.lang.CharSequence getStatus() {
    return status;
  }


  /**
   * Sets the value of the 'status' field.
   * @param value the value to set.
   */
  public void setStatus(java.lang.CharSequence value) {
    this.status = value;
  }

  /**
   * Gets the value of the 'category' field.
   * @return The value of the 'category' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.CodeableConcept> getCategory() {
    return category;
  }


  /**
   * Sets the value of the 'category' field.
   * @param value the value to set.
   */
  public void setCategory(java.util.List<io.carrera.fhir.avro.models.CodeableConcept> value) {
    this.category = value;
  }

  /**
   * Gets the value of the 'code' field.
   * @return The value of the 'code' field.
   */
  public io.carrera.fhir.avro.models.CodeableConcept getCode() {
    return code;
  }


  /**
   * Sets the value of the 'code' field.
   * @param value the value to set.
   */
  public void setCode(io.carrera.fhir.avro.models.CodeableConcept value) {
    this.code = value;
  }

  /**
   * Gets the value of the 'subject' field.
   * @return The value of the 'subject' field.
   */
  public io.carrera.fhir.avro.models.Reference getSubject() {
    return subject;
  }


  /**
   * Sets the value of the 'subject' field.
   * @param value the value to set.
   */
  public void setSubject(io.carrera.fhir.avro.models.Reference value) {
    this.subject = value;
  }

  /**
   * Gets the value of the 'encounter' field.
   * @return The value of the 'encounter' field.
   */
  public io.carrera.fhir.avro.models.Reference getEncounter() {
    return encounter;
  }


  /**
   * Sets the value of the 'encounter' field.
   * @param value the value to set.
   */
  public void setEncounter(io.carrera.fhir.avro.models.Reference value) {
    this.encounter = value;
  }

  /**
   * Gets the value of the 'effective' field.
   * @return The value of the 'effective' field.
   */
  public java.lang.Object getEffective() {
    return effective;
  }


  /**
   * Sets the value of the 'effective' field.
   * @param value the value to set.
   */
  public void setEffective(java.lang.Object value) {
    this.effective = value;
  }

  /**
   * Gets the value of the 'issued' field.
   * @return The value of the 'issued' field.
   */
  public java.lang.Integer getIssued() {
    return issued;
  }


  /**
   * Sets the value of the 'issued' field.
   * @param value the value to set.
   */
  public void setIssued(java.lang.Integer value) {
    this.issued = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public java.lang.Object getValue() {
    return value;
  }


  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(java.lang.Object value) {
    this.value = value;
  }

  /**
   * Gets the value of the 'interpretation' field.
   * @return The value of the 'interpretation' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.CodeableConcept> getInterpretation() {
    return interpretation;
  }


  /**
   * Sets the value of the 'interpretation' field.
   * @param value the value to set.
   */
  public void setInterpretation(java.util.List<io.carrera.fhir.avro.models.CodeableConcept> value) {
    this.interpretation = value;
  }

  /**
   * Creates a new Observation RecordBuilder.
   * @return A new Observation RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Observation.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Observation.Builder();
  }

  /**
   * Creates a new Observation RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Observation RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Observation.Builder newBuilder(io.carrera.fhir.avro.models.Observation.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Observation.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Observation.Builder(other);
    }
  }

  /**
   * Creates a new Observation RecordBuilder by copying an existing Observation instance.
   * @param other The existing instance to copy.
   * @return A new Observation RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Observation.Builder newBuilder(io.carrera.fhir.avro.models.Observation other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Observation.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Observation.Builder(other);
    }
  }

  /**
   * RecordBuilder for Observation instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Observation>
    implements org.apache.avro.data.RecordBuilder<Observation> {

    private java.lang.CharSequence resourceType;
    private java.lang.CharSequence id;
    private java.lang.CharSequence status;
    private java.util.List<io.carrera.fhir.avro.models.CodeableConcept> category;
    private io.carrera.fhir.avro.models.CodeableConcept code;
    private io.carrera.fhir.avro.models.CodeableConcept.Builder codeBuilder;
    private io.carrera.fhir.avro.models.Reference subject;
    private io.carrera.fhir.avro.models.Reference.Builder subjectBuilder;
    private io.carrera.fhir.avro.models.Reference encounter;
    private io.carrera.fhir.avro.models.Reference.Builder encounterBuilder;
    private java.lang.Object effective;
    private java.lang.Integer issued;
    private java.lang.Object value;
    private java.util.List<io.carrera.fhir.avro.models.CodeableConcept> interpretation;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Observation.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[0].schema(), other.resourceType);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.status)) {
        this.status = data().deepCopy(fields()[2].schema(), other.status);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.category)) {
        this.category = data().deepCopy(fields()[3].schema(), other.category);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.code)) {
        this.code = data().deepCopy(fields()[4].schema(), other.code);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (other.hasCodeBuilder()) {
        this.codeBuilder = io.carrera.fhir.avro.models.CodeableConcept.newBuilder(other.getCodeBuilder());
      }
      if (isValidValue(fields()[5], other.subject)) {
        this.subject = data().deepCopy(fields()[5].schema(), other.subject);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (other.hasSubjectBuilder()) {
        this.subjectBuilder = io.carrera.fhir.avro.models.Reference.newBuilder(other.getSubjectBuilder());
      }
      if (isValidValue(fields()[6], other.encounter)) {
        this.encounter = data().deepCopy(fields()[6].schema(), other.encounter);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (other.hasEncounterBuilder()) {
        this.encounterBuilder = io.carrera.fhir.avro.models.Reference.newBuilder(other.getEncounterBuilder());
      }
      if (isValidValue(fields()[7], other.effective)) {
        this.effective = data().deepCopy(fields()[7].schema(), other.effective);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.issued)) {
        this.issued = data().deepCopy(fields()[8].schema(), other.issued);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
      if (isValidValue(fields()[9], other.value)) {
        this.value = data().deepCopy(fields()[9].schema(), other.value);
        fieldSetFlags()[9] = other.fieldSetFlags()[9];
      }
      if (isValidValue(fields()[10], other.interpretation)) {
        this.interpretation = data().deepCopy(fields()[10].schema(), other.interpretation);
        fieldSetFlags()[10] = other.fieldSetFlags()[10];
      }
    }

    /**
     * Creates a Builder by copying an existing Observation instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Observation other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[0].schema(), other.resourceType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.status)) {
        this.status = data().deepCopy(fields()[2].schema(), other.status);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.category)) {
        this.category = data().deepCopy(fields()[3].schema(), other.category);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.code)) {
        this.code = data().deepCopy(fields()[4].schema(), other.code);
        fieldSetFlags()[4] = true;
      }
      this.codeBuilder = null;
      if (isValidValue(fields()[5], other.subject)) {
        this.subject = data().deepCopy(fields()[5].schema(), other.subject);
        fieldSetFlags()[5] = true;
      }
      this.subjectBuilder = null;
      if (isValidValue(fields()[6], other.encounter)) {
        this.encounter = data().deepCopy(fields()[6].schema(), other.encounter);
        fieldSetFlags()[6] = true;
      }
      this.encounterBuilder = null;
      if (isValidValue(fields()[7], other.effective)) {
        this.effective = data().deepCopy(fields()[7].schema(), other.effective);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.issued)) {
        this.issued = data().deepCopy(fields()[8].schema(), other.issued);
        fieldSetFlags()[8] = true;
      }
      if (isValidValue(fields()[9], other.value)) {
        this.value = data().deepCopy(fields()[9].schema(), other.value);
        fieldSetFlags()[9] = true;
      }
      if (isValidValue(fields()[10], other.interpretation)) {
        this.interpretation = data().deepCopy(fields()[10].schema(), other.interpretation);
        fieldSetFlags()[10] = true;
      }
    }

    /**
      * Gets the value of the 'resourceType' field.
      * @return The value.
      */
    public java.lang.CharSequence getResourceType() {
      return resourceType;
    }


    /**
      * Sets the value of the 'resourceType' field.
      * @param value The value of 'resourceType'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder setResourceType(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.resourceType = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'resourceType' field has been set.
      * @return True if the 'resourceType' field has been set, false otherwise.
      */
    public boolean hasResourceType() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'resourceType' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder clearResourceType() {
      resourceType = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'id' field.
      * @return The value.
      */
    public java.lang.CharSequence getId() {
      return id;
    }


    /**
      * Sets the value of the 'id' field.
      * @param value The value of 'id'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder setId(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.id = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'status' field.
      * @return The value.
      */
    public java.lang.CharSequence getStatus() {
      return status;
    }


    /**
      * Sets the value of the 'status' field.
      * @param value The value of 'status'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.status = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder clearStatus() {
      status = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'category' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.CodeableConcept> getCategory() {
      return category;
    }


    /**
      * Sets the value of the 'category' field.
      * @param value The value of 'category'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder setCategory(java.util.List<io.carrera.fhir.avro.models.CodeableConcept> value) {
      validate(fields()[3], value);
      this.category = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'category' field has been set.
      * @return True if the 'category' field has been set, false otherwise.
      */
    public boolean hasCategory() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'category' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder clearCategory() {
      category = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'code' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.CodeableConcept getCode() {
      return code;
    }


    /**
      * Sets the value of the 'code' field.
      * @param value The value of 'code'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder setCode(io.carrera.fhir.avro.models.CodeableConcept value) {
      validate(fields()[4], value);
      this.codeBuilder = null;
      this.code = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'code' field has been set.
      * @return True if the 'code' field has been set, false otherwise.
      */
    public boolean hasCode() {
      return fieldSetFlags()[4];
    }

    /**
     * Gets the Builder instance for the 'code' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.CodeableConcept.Builder getCodeBuilder() {
      if (codeBuilder == null) {
        if (hasCode()) {
          setCodeBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder(code));
        } else {
          setCodeBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder());
        }
      }
      return codeBuilder;
    }

    /**
     * Sets the Builder instance for the 'code' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Observation.Builder setCodeBuilder(io.carrera.fhir.avro.models.CodeableConcept.Builder value) {
      clearCode();
      codeBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'code' field has an active Builder instance
     * @return True if the 'code' field has an active Builder instance
     */
    public boolean hasCodeBuilder() {
      return codeBuilder != null;
    }

    /**
      * Clears the value of the 'code' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder clearCode() {
      code = null;
      codeBuilder = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'subject' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.Reference getSubject() {
      return subject;
    }


    /**
      * Sets the value of the 'subject' field.
      * @param value The value of 'subject'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder setSubject(io.carrera.fhir.avro.models.Reference value) {
      validate(fields()[5], value);
      this.subjectBuilder = null;
      this.subject = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'subject' field has been set.
      * @return True if the 'subject' field has been set, false otherwise.
      */
    public boolean hasSubject() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'subject' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Reference.Builder getSubjectBuilder() {
      if (subjectBuilder == null) {
        if (hasSubject()) {
          setSubjectBuilder(io.carrera.fhir.avro.models.Reference.newBuilder(subject));
        } else {
          setSubjectBuilder(io.carrera.fhir.avro.models.Reference.newBuilder());
        }
      }
      return subjectBuilder;
    }

    /**
     * Sets the Builder instance for the 'subject' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Observation.Builder setSubjectBuilder(io.carrera.fhir.avro.models.Reference.Builder value) {
      clearSubject();
      subjectBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'subject' field has an active Builder instance
     * @return True if the 'subject' field has an active Builder instance
     */
    public boolean hasSubjectBuilder() {
      return subjectBuilder != null;
    }

    /**
      * Clears the value of the 'subject' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder clearSubject() {
      subject = null;
      subjectBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'encounter' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.Reference getEncounter() {
      return encounter;
    }


    /**
      * Sets the value of the 'encounter' field.
      * @param value The value of 'encounter'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder setEncounter(io.carrera.fhir.avro.models.Reference value) {
      validate(fields()[6], value);
      this.encounterBuilder = null;
      this.encounter = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'encounter' field has been set.
      * @return True if the 'encounter' field has been set, false otherwise.
      */
    public boolean hasEncounter() {
      return fieldSetFlags()[6];
    }

    /**
     * Gets the Builder instance for the 'encounter' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Reference.Builder getEncounterBuilder() {
      if (encounterBuilder == null) {
        if (hasEncounter()) {
          setEncounterBuilder(io.carrera.fhir.avro.models.Reference.newBuilder(encounter));
        } else {
          setEncounterBuilder(io.carrera.fhir.avro.models.Reference.newBuilder());
        }
      }
      return encounterBuilder;
    }

    /**
     * Sets the Builder instance for the 'encounter' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Observation.Builder setEncounterBuilder(io.carrera.fhir.avro.models.Reference.Builder value) {
      clearEncounter();
      encounterBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'encounter' field has an active Builder instance
     * @return True if the 'encounter' field has an active Builder instance
     */
    public boolean hasEncounterBuilder() {
      return encounterBuilder != null;
    }

    /**
      * Clears the value of the 'encounter' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder clearEncounter() {
      encounter = null;
      encounterBuilder = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'effective' field.
      * @return The value.
      */
    public java.lang.Object getEffective() {
      return effective;
    }


    /**
      * Sets the value of the 'effective' field.
      * @param value The value of 'effective'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder setEffective(java.lang.Object value) {
      validate(fields()[7], value);
      this.effective = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'effective' field has been set.
      * @return True if the 'effective' field has been set, false otherwise.
      */
    public boolean hasEffective() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'effective' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder clearEffective() {
      effective = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'issued' field.
      * @return The value.
      */
    public java.lang.Integer getIssued() {
      return issued;
    }


    /**
      * Sets the value of the 'issued' field.
      * @param value The value of 'issued'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder setIssued(java.lang.Integer value) {
      validate(fields()[8], value);
      this.issued = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'issued' field has been set.
      * @return True if the 'issued' field has been set, false otherwise.
      */
    public boolean hasIssued() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'issued' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder clearIssued() {
      issued = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public java.lang.Object getValue() {
      return value;
    }


    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder setValue(java.lang.Object value) {
      validate(fields()[9], value);
      this.value = value;
      fieldSetFlags()[9] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[9];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder clearValue() {
      value = null;
      fieldSetFlags()[9] = false;
      return this;
    }

    /**
      * Gets the value of the 'interpretation' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.CodeableConcept> getInterpretation() {
      return interpretation;
    }


    /**
      * Sets the value of the 'interpretation' field.
      * @param value The value of 'interpretation'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder setInterpretation(java.util.List<io.carrera.fhir.avro.models.CodeableConcept> value) {
      validate(fields()[10], value);
      this.interpretation = value;
      fieldSetFlags()[10] = true;
      return this;
    }

    /**
      * Checks whether the 'interpretation' field has been set.
      * @return True if the 'interpretation' field has been set, false otherwise.
      */
    public boolean hasInterpretation() {
      return fieldSetFlags()[10];
    }


    /**
      * Clears the value of the 'interpretation' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Observation.Builder clearInterpretation() {
      interpretation = null;
      fieldSetFlags()[10] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Observation build() {
      try {
        Observation record = new Observation();
        record.resourceType = fieldSetFlags()[0] ? this.resourceType : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.status = fieldSetFlags()[2] ? this.status : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.category = fieldSetFlags()[3] ? this.category : (java.util.List<io.carrera.fhir.avro.models.CodeableConcept>) defaultValue(fields()[3]);
        if (codeBuilder != null) {
          try {
            record.code = this.codeBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("code"));
            throw e;
          }
        } else {
          record.code = fieldSetFlags()[4] ? this.code : (io.carrera.fhir.avro.models.CodeableConcept) defaultValue(fields()[4]);
        }
        if (subjectBuilder != null) {
          try {
            record.subject = this.subjectBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("subject"));
            throw e;
          }
        } else {
          record.subject = fieldSetFlags()[5] ? this.subject : (io.carrera.fhir.avro.models.Reference) defaultValue(fields()[5]);
        }
        if (encounterBuilder != null) {
          try {
            record.encounter = this.encounterBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("encounter"));
            throw e;
          }
        } else {
          record.encounter = fieldSetFlags()[6] ? this.encounter : (io.carrera.fhir.avro.models.Reference) defaultValue(fields()[6]);
        }
        record.effective = fieldSetFlags()[7] ? this.effective :  defaultValue(fields()[7]);
        record.issued = fieldSetFlags()[8] ? this.issued : (java.lang.Integer) defaultValue(fields()[8]);
        record.value = fieldSetFlags()[9] ? this.value :  defaultValue(fields()[9]);
        record.interpretation = fieldSetFlags()[10] ? this.interpretation : (java.util.List<io.carrera.fhir.avro.models.CodeableConcept>) defaultValue(fields()[10]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Observation>
    WRITER$ = (org.apache.avro.io.DatumWriter<Observation>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Observation>
    READER$ = (org.apache.avro.io.DatumReader<Observation>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}











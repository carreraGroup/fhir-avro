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
public class Patient extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -801831956588833655L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Patient\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"identifier\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"identifier_record\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"string\"],\"default\":null}]}}],\"default\":null},{\"name\":\"name\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"name_record\",\"fields\":[{\"name\":\"use\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"family\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"given\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null},{\"name\":\"prefix\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"string\"}],\"default\":null}]}}],\"default\":null},{\"name\":\"gender\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"birthDate\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Date\",\"fields\":[{\"name\":\"value\",\"type\":[{\"type\":\"record\",\"name\":\"XsDate\",\"fields\":[{\"name\":\"value\",\"type\":{\"type\":\"int\",\"logicalType\":\"date\"}}]},{\"type\":\"record\",\"name\":\"XsYearMonth\",\"fields\":[{\"name\":\"year\",\"type\":\"int\"},{\"name\":\"month\",\"type\":\"int\"}]},{\"type\":\"record\",\"name\":\"XsYear\",\"fields\":[{\"name\":\"value\",\"type\":\"int\"}]}]}]}],\"default\":null},{\"name\":\"maritalStatus\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"CodeableConcept\",\"fields\":[{\"name\":\"coding\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userSelected\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}}],\"default\":null},{\"name\":\"text\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"extension\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Extension\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"]},{\"name\":\"extension\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Extension\"}],\"default\":null},{\"name\":\"url\",\"type\":[\"null\",\"string\"]},{\"name\":\"value\",\"type\":[\"null\",\"string\",\"int\",\"boolean\",{\"type\":\"record\",\"name\":\"Quantity\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Decimal\",\"fields\":[{\"name\":\"unscaled_value\",\"type\":\"bytes\",\"logicalType\":\"decimal\"},{\"name\":\"precision\",\"type\":\"int\"},{\"name\":\"scale\",\"type\":\"int\"}]}],\"default\":null},{\"name\":\"unit\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"comparator\",\"type\":[\"null\",\"string\"],\"default\":null}]},\"Coding\",{\"type\":\"record\",\"name\":\"Reference\",\"fields\":[{\"name\":\"reference\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"type\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null}]}}],\"default\":null},{\"name\":\"modifierExtension\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Extension\"}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();
static {
    MODEL$.addLogicalTypeConversion(new org.apache.avro.data.TimeConversions.DateConversion());
  }

  private static final BinaryMessageEncoder<Patient> ENCODER =
      new BinaryMessageEncoder<Patient>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Patient> DECODER =
      new BinaryMessageDecoder<Patient>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Patient> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Patient> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Patient> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Patient>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Patient to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Patient from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Patient instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Patient fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence resourceType;
   private java.lang.CharSequence id;
   private java.util.List<io.carrera.fhir.avro.models.identifier_record> identifier;
   private java.util.List<io.carrera.fhir.avro.models.name_record> name;
   private java.lang.CharSequence gender;
   private io.carrera.fhir.avro.models.Date birthDate;
   private io.carrera.fhir.avro.models.CodeableConcept maritalStatus;
   private java.util.List<io.carrera.fhir.avro.models.Extension> extension;
   private java.util.List<io.carrera.fhir.avro.models.Extension> modifierExtension;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Patient() {}

  /**
   * All-args constructor.
   * @param resourceType The new value for resourceType
   * @param id The new value for id
   * @param identifier The new value for identifier
   * @param name The new value for name
   * @param gender The new value for gender
   * @param birthDate The new value for birthDate
   * @param maritalStatus The new value for maritalStatus
   * @param extension The new value for extension
   * @param modifierExtension The new value for modifierExtension
   */
  public Patient(java.lang.CharSequence resourceType, java.lang.CharSequence id, java.util.List<io.carrera.fhir.avro.models.identifier_record> identifier, java.util.List<io.carrera.fhir.avro.models.name_record> name, java.lang.CharSequence gender, io.carrera.fhir.avro.models.Date birthDate, io.carrera.fhir.avro.models.CodeableConcept maritalStatus, java.util.List<io.carrera.fhir.avro.models.Extension> extension, java.util.List<io.carrera.fhir.avro.models.Extension> modifierExtension) {
    this.resourceType = resourceType;
    this.id = id;
    this.identifier = identifier;
    this.name = name;
    this.gender = gender;
    this.birthDate = birthDate;
    this.maritalStatus = maritalStatus;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return resourceType;
    case 1: return id;
    case 2: return identifier;
    case 3: return name;
    case 4: return gender;
    case 5: return birthDate;
    case 6: return maritalStatus;
    case 7: return extension;
    case 8: return modifierExtension;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: resourceType = (java.lang.CharSequence)value$; break;
    case 1: id = (java.lang.CharSequence)value$; break;
    case 2: identifier = (java.util.List<io.carrera.fhir.avro.models.identifier_record>)value$; break;
    case 3: name = (java.util.List<io.carrera.fhir.avro.models.name_record>)value$; break;
    case 4: gender = (java.lang.CharSequence)value$; break;
    case 5: birthDate = (io.carrera.fhir.avro.models.Date)value$; break;
    case 6: maritalStatus = (io.carrera.fhir.avro.models.CodeableConcept)value$; break;
    case 7: extension = (java.util.List<io.carrera.fhir.avro.models.Extension>)value$; break;
    case 8: modifierExtension = (java.util.List<io.carrera.fhir.avro.models.Extension>)value$; break;
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
   * Gets the value of the 'identifier' field.
   * @return The value of the 'identifier' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.identifier_record> getIdentifier() {
    return identifier;
  }


  /**
   * Sets the value of the 'identifier' field.
   * @param value the value to set.
   */
  public void setIdentifier(java.util.List<io.carrera.fhir.avro.models.identifier_record> value) {
    this.identifier = value;
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.name_record> getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.util.List<io.carrera.fhir.avro.models.name_record> value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'gender' field.
   * @return The value of the 'gender' field.
   */
  public java.lang.CharSequence getGender() {
    return gender;
  }


  /**
   * Sets the value of the 'gender' field.
   * @param value the value to set.
   */
  public void setGender(java.lang.CharSequence value) {
    this.gender = value;
  }

  /**
   * Gets the value of the 'birthDate' field.
   * @return The value of the 'birthDate' field.
   */
  public io.carrera.fhir.avro.models.Date getBirthDate() {
    return birthDate;
  }


  /**
   * Sets the value of the 'birthDate' field.
   * @param value the value to set.
   */
  public void setBirthDate(io.carrera.fhir.avro.models.Date value) {
    this.birthDate = value;
  }

  /**
   * Gets the value of the 'maritalStatus' field.
   * @return The value of the 'maritalStatus' field.
   */
  public io.carrera.fhir.avro.models.CodeableConcept getMaritalStatus() {
    return maritalStatus;
  }


  /**
   * Sets the value of the 'maritalStatus' field.
   * @param value the value to set.
   */
  public void setMaritalStatus(io.carrera.fhir.avro.models.CodeableConcept value) {
    this.maritalStatus = value;
  }

  /**
   * Gets the value of the 'extension' field.
   * @return The value of the 'extension' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.Extension> getExtension() {
    return extension;
  }


  /**
   * Sets the value of the 'extension' field.
   * @param value the value to set.
   */
  public void setExtension(java.util.List<io.carrera.fhir.avro.models.Extension> value) {
    this.extension = value;
  }

  /**
   * Gets the value of the 'modifierExtension' field.
   * @return The value of the 'modifierExtension' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.Extension> getModifierExtension() {
    return modifierExtension;
  }


  /**
   * Sets the value of the 'modifierExtension' field.
   * @param value the value to set.
   */
  public void setModifierExtension(java.util.List<io.carrera.fhir.avro.models.Extension> value) {
    this.modifierExtension = value;
  }

  /**
   * Creates a new Patient RecordBuilder.
   * @return A new Patient RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Patient.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Patient.Builder();
  }

  /**
   * Creates a new Patient RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Patient RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Patient.Builder newBuilder(io.carrera.fhir.avro.models.Patient.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Patient.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Patient.Builder(other);
    }
  }

  /**
   * Creates a new Patient RecordBuilder by copying an existing Patient instance.
   * @param other The existing instance to copy.
   * @return A new Patient RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Patient.Builder newBuilder(io.carrera.fhir.avro.models.Patient other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Patient.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Patient.Builder(other);
    }
  }

  /**
   * RecordBuilder for Patient instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Patient>
    implements org.apache.avro.data.RecordBuilder<Patient> {

    private java.lang.CharSequence resourceType;
    private java.lang.CharSequence id;
    private java.util.List<io.carrera.fhir.avro.models.identifier_record> identifier;
    private java.util.List<io.carrera.fhir.avro.models.name_record> name;
    private java.lang.CharSequence gender;
    private io.carrera.fhir.avro.models.Date birthDate;
    private io.carrera.fhir.avro.models.Date.Builder birthDateBuilder;
    private io.carrera.fhir.avro.models.CodeableConcept maritalStatus;
    private io.carrera.fhir.avro.models.CodeableConcept.Builder maritalStatusBuilder;
    private java.util.List<io.carrera.fhir.avro.models.Extension> extension;
    private java.util.List<io.carrera.fhir.avro.models.Extension> modifierExtension;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Patient.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[0].schema(), other.resourceType);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.identifier)) {
        this.identifier = data().deepCopy(fields()[2].schema(), other.identifier);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.gender)) {
        this.gender = data().deepCopy(fields()[4].schema(), other.gender);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.birthDate)) {
        this.birthDate = data().deepCopy(fields()[5].schema(), other.birthDate);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
      if (other.hasBirthDateBuilder()) {
        this.birthDateBuilder = io.carrera.fhir.avro.models.Date.newBuilder(other.getBirthDateBuilder());
      }
      if (isValidValue(fields()[6], other.maritalStatus)) {
        this.maritalStatus = data().deepCopy(fields()[6].schema(), other.maritalStatus);
        fieldSetFlags()[6] = other.fieldSetFlags()[6];
      }
      if (other.hasMaritalStatusBuilder()) {
        this.maritalStatusBuilder = io.carrera.fhir.avro.models.CodeableConcept.newBuilder(other.getMaritalStatusBuilder());
      }
      if (isValidValue(fields()[7], other.extension)) {
        this.extension = data().deepCopy(fields()[7].schema(), other.extension);
        fieldSetFlags()[7] = other.fieldSetFlags()[7];
      }
      if (isValidValue(fields()[8], other.modifierExtension)) {
        this.modifierExtension = data().deepCopy(fields()[8].schema(), other.modifierExtension);
        fieldSetFlags()[8] = other.fieldSetFlags()[8];
      }
    }

    /**
     * Creates a Builder by copying an existing Patient instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Patient other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.resourceType)) {
        this.resourceType = data().deepCopy(fields()[0].schema(), other.resourceType);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.id)) {
        this.id = data().deepCopy(fields()[1].schema(), other.id);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.identifier)) {
        this.identifier = data().deepCopy(fields()[2].schema(), other.identifier);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.name)) {
        this.name = data().deepCopy(fields()[3].schema(), other.name);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.gender)) {
        this.gender = data().deepCopy(fields()[4].schema(), other.gender);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.birthDate)) {
        this.birthDate = data().deepCopy(fields()[5].schema(), other.birthDate);
        fieldSetFlags()[5] = true;
      }
      this.birthDateBuilder = null;
      if (isValidValue(fields()[6], other.maritalStatus)) {
        this.maritalStatus = data().deepCopy(fields()[6].schema(), other.maritalStatus);
        fieldSetFlags()[6] = true;
      }
      this.maritalStatusBuilder = null;
      if (isValidValue(fields()[7], other.extension)) {
        this.extension = data().deepCopy(fields()[7].schema(), other.extension);
        fieldSetFlags()[7] = true;
      }
      if (isValidValue(fields()[8], other.modifierExtension)) {
        this.modifierExtension = data().deepCopy(fields()[8].schema(), other.modifierExtension);
        fieldSetFlags()[8] = true;
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
    public io.carrera.fhir.avro.models.Patient.Builder setResourceType(java.lang.CharSequence value) {
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
    public io.carrera.fhir.avro.models.Patient.Builder clearResourceType() {
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
    public io.carrera.fhir.avro.models.Patient.Builder setId(java.lang.CharSequence value) {
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
    public io.carrera.fhir.avro.models.Patient.Builder clearId() {
      id = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'identifier' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.identifier_record> getIdentifier() {
      return identifier;
    }


    /**
      * Sets the value of the 'identifier' field.
      * @param value The value of 'identifier'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder setIdentifier(java.util.List<io.carrera.fhir.avro.models.identifier_record> value) {
      validate(fields()[2], value);
      this.identifier = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'identifier' field has been set.
      * @return True if the 'identifier' field has been set, false otherwise.
      */
    public boolean hasIdentifier() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'identifier' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder clearIdentifier() {
      identifier = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.name_record> getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder setName(java.util.List<io.carrera.fhir.avro.models.name_record> value) {
      validate(fields()[3], value);
      this.name = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder clearName() {
      name = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'gender' field.
      * @return The value.
      */
    public java.lang.CharSequence getGender() {
      return gender;
    }


    /**
      * Sets the value of the 'gender' field.
      * @param value The value of 'gender'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder setGender(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.gender = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'gender' field has been set.
      * @return True if the 'gender' field has been set, false otherwise.
      */
    public boolean hasGender() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'gender' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder clearGender() {
      gender = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'birthDate' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.Date getBirthDate() {
      return birthDate;
    }


    /**
      * Sets the value of the 'birthDate' field.
      * @param value The value of 'birthDate'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder setBirthDate(io.carrera.fhir.avro.models.Date value) {
      validate(fields()[5], value);
      this.birthDateBuilder = null;
      this.birthDate = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'birthDate' field has been set.
      * @return True if the 'birthDate' field has been set, false otherwise.
      */
    public boolean hasBirthDate() {
      return fieldSetFlags()[5];
    }

    /**
     * Gets the Builder instance for the 'birthDate' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Date.Builder getBirthDateBuilder() {
      if (birthDateBuilder == null) {
        if (hasBirthDate()) {
          setBirthDateBuilder(io.carrera.fhir.avro.models.Date.newBuilder(birthDate));
        } else {
          setBirthDateBuilder(io.carrera.fhir.avro.models.Date.newBuilder());
        }
      }
      return birthDateBuilder;
    }

    /**
     * Sets the Builder instance for the 'birthDate' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Patient.Builder setBirthDateBuilder(io.carrera.fhir.avro.models.Date.Builder value) {
      clearBirthDate();
      birthDateBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'birthDate' field has an active Builder instance
     * @return True if the 'birthDate' field has an active Builder instance
     */
    public boolean hasBirthDateBuilder() {
      return birthDateBuilder != null;
    }

    /**
      * Clears the value of the 'birthDate' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder clearBirthDate() {
      birthDate = null;
      birthDateBuilder = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'maritalStatus' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.CodeableConcept getMaritalStatus() {
      return maritalStatus;
    }


    /**
      * Sets the value of the 'maritalStatus' field.
      * @param value The value of 'maritalStatus'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder setMaritalStatus(io.carrera.fhir.avro.models.CodeableConcept value) {
      validate(fields()[6], value);
      this.maritalStatusBuilder = null;
      this.maritalStatus = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'maritalStatus' field has been set.
      * @return True if the 'maritalStatus' field has been set, false otherwise.
      */
    public boolean hasMaritalStatus() {
      return fieldSetFlags()[6];
    }

    /**
     * Gets the Builder instance for the 'maritalStatus' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.CodeableConcept.Builder getMaritalStatusBuilder() {
      if (maritalStatusBuilder == null) {
        if (hasMaritalStatus()) {
          setMaritalStatusBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder(maritalStatus));
        } else {
          setMaritalStatusBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder());
        }
      }
      return maritalStatusBuilder;
    }

    /**
     * Sets the Builder instance for the 'maritalStatus' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.Patient.Builder setMaritalStatusBuilder(io.carrera.fhir.avro.models.CodeableConcept.Builder value) {
      clearMaritalStatus();
      maritalStatusBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'maritalStatus' field has an active Builder instance
     * @return True if the 'maritalStatus' field has an active Builder instance
     */
    public boolean hasMaritalStatusBuilder() {
      return maritalStatusBuilder != null;
    }

    /**
      * Clears the value of the 'maritalStatus' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder clearMaritalStatus() {
      maritalStatus = null;
      maritalStatusBuilder = null;
      fieldSetFlags()[6] = false;
      return this;
    }

    /**
      * Gets the value of the 'extension' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.Extension> getExtension() {
      return extension;
    }


    /**
      * Sets the value of the 'extension' field.
      * @param value The value of 'extension'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder setExtension(java.util.List<io.carrera.fhir.avro.models.Extension> value) {
      validate(fields()[7], value);
      this.extension = value;
      fieldSetFlags()[7] = true;
      return this;
    }

    /**
      * Checks whether the 'extension' field has been set.
      * @return True if the 'extension' field has been set, false otherwise.
      */
    public boolean hasExtension() {
      return fieldSetFlags()[7];
    }


    /**
      * Clears the value of the 'extension' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder clearExtension() {
      extension = null;
      fieldSetFlags()[7] = false;
      return this;
    }

    /**
      * Gets the value of the 'modifierExtension' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.Extension> getModifierExtension() {
      return modifierExtension;
    }


    /**
      * Sets the value of the 'modifierExtension' field.
      * @param value The value of 'modifierExtension'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder setModifierExtension(java.util.List<io.carrera.fhir.avro.models.Extension> value) {
      validate(fields()[8], value);
      this.modifierExtension = value;
      fieldSetFlags()[8] = true;
      return this;
    }

    /**
      * Checks whether the 'modifierExtension' field has been set.
      * @return True if the 'modifierExtension' field has been set, false otherwise.
      */
    public boolean hasModifierExtension() {
      return fieldSetFlags()[8];
    }


    /**
      * Clears the value of the 'modifierExtension' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Patient.Builder clearModifierExtension() {
      modifierExtension = null;
      fieldSetFlags()[8] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Patient build() {
      try {
        Patient record = new Patient();
        record.resourceType = fieldSetFlags()[0] ? this.resourceType : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.identifier = fieldSetFlags()[2] ? this.identifier : (java.util.List<io.carrera.fhir.avro.models.identifier_record>) defaultValue(fields()[2]);
        record.name = fieldSetFlags()[3] ? this.name : (java.util.List<io.carrera.fhir.avro.models.name_record>) defaultValue(fields()[3]);
        record.gender = fieldSetFlags()[4] ? this.gender : (java.lang.CharSequence) defaultValue(fields()[4]);
        if (birthDateBuilder != null) {
          try {
            record.birthDate = this.birthDateBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("birthDate"));
            throw e;
          }
        } else {
          record.birthDate = fieldSetFlags()[5] ? this.birthDate : (io.carrera.fhir.avro.models.Date) defaultValue(fields()[5]);
        }
        if (maritalStatusBuilder != null) {
          try {
            record.maritalStatus = this.maritalStatusBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("maritalStatus"));
            throw e;
          }
        } else {
          record.maritalStatus = fieldSetFlags()[6] ? this.maritalStatus : (io.carrera.fhir.avro.models.CodeableConcept) defaultValue(fields()[6]);
        }
        record.extension = fieldSetFlags()[7] ? this.extension : (java.util.List<io.carrera.fhir.avro.models.Extension>) defaultValue(fields()[7]);
        record.modifierExtension = fieldSetFlags()[8] ? this.modifierExtension : (java.util.List<io.carrera.fhir.avro.models.Extension>) defaultValue(fields()[8]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Patient>
    WRITER$ = (org.apache.avro.io.DatumWriter<Patient>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Patient>
    READER$ = (org.apache.avro.io.DatumReader<Patient>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}











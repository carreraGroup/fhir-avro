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
public class CareTeam extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3495859397769774591L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"CareTeam\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"resourceType\",\"type\":\"string\"},{\"name\":\"id\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"identifier\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"identifier_record\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"string\"],\"default\":null}]}}],\"default\":null},{\"name\":\"status\",\"type\":\"string\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<CareTeam> ENCODER =
      new BinaryMessageEncoder<CareTeam>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<CareTeam> DECODER =
      new BinaryMessageDecoder<CareTeam>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<CareTeam> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<CareTeam> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<CareTeam> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<CareTeam>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this CareTeam to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a CareTeam from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a CareTeam instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static CareTeam fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence resourceType;
   private java.lang.CharSequence id;
   private java.util.List<io.carrera.fhir.avro.models.identifier_record> identifier;
   private java.lang.CharSequence status;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public CareTeam() {}

  /**
   * All-args constructor.
   * @param resourceType The new value for resourceType
   * @param id The new value for id
   * @param identifier The new value for identifier
   * @param status The new value for status
   */
  public CareTeam(java.lang.CharSequence resourceType, java.lang.CharSequence id, java.util.List<io.carrera.fhir.avro.models.identifier_record> identifier, java.lang.CharSequence status) {
    this.resourceType = resourceType;
    this.id = id;
    this.identifier = identifier;
    this.status = status;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return resourceType;
    case 1: return id;
    case 2: return identifier;
    case 3: return status;
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
    case 3: status = (java.lang.CharSequence)value$; break;
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
   * Creates a new CareTeam RecordBuilder.
   * @return A new CareTeam RecordBuilder
   */
  public static io.carrera.fhir.avro.models.CareTeam.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.CareTeam.Builder();
  }

  /**
   * Creates a new CareTeam RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new CareTeam RecordBuilder
   */
  public static io.carrera.fhir.avro.models.CareTeam.Builder newBuilder(io.carrera.fhir.avro.models.CareTeam.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.CareTeam.Builder();
    } else {
      return new io.carrera.fhir.avro.models.CareTeam.Builder(other);
    }
  }

  /**
   * Creates a new CareTeam RecordBuilder by copying an existing CareTeam instance.
   * @param other The existing instance to copy.
   * @return A new CareTeam RecordBuilder
   */
  public static io.carrera.fhir.avro.models.CareTeam.Builder newBuilder(io.carrera.fhir.avro.models.CareTeam other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.CareTeam.Builder();
    } else {
      return new io.carrera.fhir.avro.models.CareTeam.Builder(other);
    }
  }

  /**
   * RecordBuilder for CareTeam instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<CareTeam>
    implements org.apache.avro.data.RecordBuilder<CareTeam> {

    private java.lang.CharSequence resourceType;
    private java.lang.CharSequence id;
    private java.util.List<io.carrera.fhir.avro.models.identifier_record> identifier;
    private java.lang.CharSequence status;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.CareTeam.Builder other) {
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
      if (isValidValue(fields()[3], other.status)) {
        this.status = data().deepCopy(fields()[3].schema(), other.status);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing CareTeam instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.CareTeam other) {
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
      if (isValidValue(fields()[3], other.status)) {
        this.status = data().deepCopy(fields()[3].schema(), other.status);
        fieldSetFlags()[3] = true;
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
    public io.carrera.fhir.avro.models.CareTeam.Builder setResourceType(java.lang.CharSequence value) {
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
    public io.carrera.fhir.avro.models.CareTeam.Builder clearResourceType() {
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
    public io.carrera.fhir.avro.models.CareTeam.Builder setId(java.lang.CharSequence value) {
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
    public io.carrera.fhir.avro.models.CareTeam.Builder clearId() {
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
    public io.carrera.fhir.avro.models.CareTeam.Builder setIdentifier(java.util.List<io.carrera.fhir.avro.models.identifier_record> value) {
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
    public io.carrera.fhir.avro.models.CareTeam.Builder clearIdentifier() {
      identifier = null;
      fieldSetFlags()[2] = false;
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
    public io.carrera.fhir.avro.models.CareTeam.Builder setStatus(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.status = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'status' field has been set.
      * @return True if the 'status' field has been set, false otherwise.
      */
    public boolean hasStatus() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'status' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.CareTeam.Builder clearStatus() {
      status = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public CareTeam build() {
      try {
        CareTeam record = new CareTeam();
        record.resourceType = fieldSetFlags()[0] ? this.resourceType : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.id = fieldSetFlags()[1] ? this.id : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.identifier = fieldSetFlags()[2] ? this.identifier : (java.util.List<io.carrera.fhir.avro.models.identifier_record>) defaultValue(fields()[2]);
        record.status = fieldSetFlags()[3] ? this.status : (java.lang.CharSequence) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<CareTeam>
    WRITER$ = (org.apache.avro.io.DatumWriter<CareTeam>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<CareTeam>
    READER$ = (org.apache.avro.io.DatumReader<CareTeam>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.resourceType);

    if (this.id == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeString(this.id);
    }

    if (this.identifier == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.identifier.size();
      out.writeArrayStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (io.carrera.fhir.avro.models.identifier_record e0: this.identifier) {
        actualSize0++;
        out.startItem();
        e0.customEncode(out);
      }
      out.writeArrayEnd();
      if (actualSize0 != size0)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

    out.writeString(this.status);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.resourceType = in.readString(this.resourceType instanceof Utf8 ? (Utf8)this.resourceType : null);

      if (in.readIndex() != 1) {
        in.readNull();
        this.id = null;
      } else {
        this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.identifier = null;
      } else {
        long size0 = in.readArrayStart();
        java.util.List<io.carrera.fhir.avro.models.identifier_record> a0 = this.identifier;
        if (a0 == null) {
          a0 = new SpecificData.Array<io.carrera.fhir.avro.models.identifier_record>((int)size0, SCHEMA$.getField("identifier").schema().getTypes().get(1));
          this.identifier = a0;
        } else a0.clear();
        SpecificData.Array<io.carrera.fhir.avro.models.identifier_record> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<io.carrera.fhir.avro.models.identifier_record>)a0 : null);
        for ( ; 0 < size0; size0 = in.arrayNext()) {
          for ( ; size0 != 0; size0--) {
            io.carrera.fhir.avro.models.identifier_record e0 = (ga0 != null ? ga0.peek() : null);
            if (e0 == null) {
              e0 = new io.carrera.fhir.avro.models.identifier_record();
            }
            e0.customDecode(in);
            a0.add(e0);
          }
        }
      }

      this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.resourceType = in.readString(this.resourceType instanceof Utf8 ? (Utf8)this.resourceType : null);
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.id = null;
          } else {
            this.id = in.readString(this.id instanceof Utf8 ? (Utf8)this.id : null);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.identifier = null;
          } else {
            long size0 = in.readArrayStart();
            java.util.List<io.carrera.fhir.avro.models.identifier_record> a0 = this.identifier;
            if (a0 == null) {
              a0 = new SpecificData.Array<io.carrera.fhir.avro.models.identifier_record>((int)size0, SCHEMA$.getField("identifier").schema().getTypes().get(1));
              this.identifier = a0;
            } else a0.clear();
            SpecificData.Array<io.carrera.fhir.avro.models.identifier_record> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<io.carrera.fhir.avro.models.identifier_record>)a0 : null);
            for ( ; 0 < size0; size0 = in.arrayNext()) {
              for ( ; size0 != 0; size0--) {
                io.carrera.fhir.avro.models.identifier_record e0 = (ga0 != null ? ga0.peek() : null);
                if (e0 == null) {
                  e0 = new io.carrera.fhir.avro.models.identifier_record();
                }
                e0.customDecode(in);
                a0.add(e0);
              }
            }
          }
          break;

        case 3:
          this.status = in.readString(this.status instanceof Utf8 ? (Utf8)this.status : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}











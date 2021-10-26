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
public class Extension extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 138794737985682050L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Extension\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"id\",\"type\":[\"null\",\"string\"]},{\"name\":\"extension\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"Extension\"}],\"default\":null},{\"name\":\"url\",\"type\":[\"null\",\"string\"]},{\"name\":\"value\",\"type\":[\"null\",\"string\",\"int\",\"boolean\",{\"type\":\"record\",\"name\":\"Quantity\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"unit\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"comparator\",\"type\":[\"null\",\"string\"],\"default\":null}]},{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userSelected\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Extension> ENCODER =
      new BinaryMessageEncoder<Extension>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Extension> DECODER =
      new BinaryMessageDecoder<Extension>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Extension> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Extension> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Extension> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Extension>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Extension to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Extension from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Extension instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Extension fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence id;
   private java.util.List<io.carrera.fhir.avro.models.Extension> extension;
   private java.lang.CharSequence url;
   private java.lang.Object value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Extension() {}

  /**
   * All-args constructor.
   * @param id The new value for id
   * @param extension The new value for extension
   * @param url The new value for url
   * @param value The new value for value
   */
  public Extension(java.lang.CharSequence id, java.util.List<io.carrera.fhir.avro.models.Extension> extension, java.lang.CharSequence url, java.lang.Object value) {
    this.id = id;
    this.extension = extension;
    this.url = url;
    this.value = value;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return id;
    case 1: return extension;
    case 2: return url;
    case 3: return value;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: id = (java.lang.CharSequence)value$; break;
    case 1: extension = (java.util.List<io.carrera.fhir.avro.models.Extension>)value$; break;
    case 2: url = (java.lang.CharSequence)value$; break;
    case 3: value = value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
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
   * Gets the value of the 'url' field.
   * @return The value of the 'url' field.
   */
  public java.lang.CharSequence getUrl() {
    return url;
  }


  /**
   * Sets the value of the 'url' field.
   * @param value the value to set.
   */
  public void setUrl(java.lang.CharSequence value) {
    this.url = value;
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
   * Creates a new Extension RecordBuilder.
   * @return A new Extension RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Extension.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.Extension.Builder();
  }

  /**
   * Creates a new Extension RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Extension RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Extension.Builder newBuilder(io.carrera.fhir.avro.models.Extension.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Extension.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Extension.Builder(other);
    }
  }

  /**
   * Creates a new Extension RecordBuilder by copying an existing Extension instance.
   * @param other The existing instance to copy.
   * @return A new Extension RecordBuilder
   */
  public static io.carrera.fhir.avro.models.Extension.Builder newBuilder(io.carrera.fhir.avro.models.Extension other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.Extension.Builder();
    } else {
      return new io.carrera.fhir.avro.models.Extension.Builder(other);
    }
  }

  /**
   * RecordBuilder for Extension instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Extension>
    implements org.apache.avro.data.RecordBuilder<Extension> {

    private java.lang.CharSequence id;
    private java.util.List<io.carrera.fhir.avro.models.Extension> extension;
    private java.lang.CharSequence url;
    private java.lang.Object value;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Extension.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.extension)) {
        this.extension = data().deepCopy(fields()[1].schema(), other.extension);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.url)) {
        this.url = data().deepCopy(fields()[2].schema(), other.url);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.value)) {
        this.value = data().deepCopy(fields()[3].schema(), other.value);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing Extension instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.Extension other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.id)) {
        this.id = data().deepCopy(fields()[0].schema(), other.id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.extension)) {
        this.extension = data().deepCopy(fields()[1].schema(), other.extension);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.url)) {
        this.url = data().deepCopy(fields()[2].schema(), other.url);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.value)) {
        this.value = data().deepCopy(fields()[3].schema(), other.value);
        fieldSetFlags()[3] = true;
      }
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
    public io.carrera.fhir.avro.models.Extension.Builder setId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'id' field has been set.
      * @return True if the 'id' field has been set, false otherwise.
      */
    public boolean hasId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'id' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Extension.Builder clearId() {
      id = null;
      fieldSetFlags()[0] = false;
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
    public io.carrera.fhir.avro.models.Extension.Builder setExtension(java.util.List<io.carrera.fhir.avro.models.Extension> value) {
      validate(fields()[1], value);
      this.extension = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'extension' field has been set.
      * @return True if the 'extension' field has been set, false otherwise.
      */
    public boolean hasExtension() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'extension' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Extension.Builder clearExtension() {
      extension = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'url' field.
      * @return The value.
      */
    public java.lang.CharSequence getUrl() {
      return url;
    }


    /**
      * Sets the value of the 'url' field.
      * @param value The value of 'url'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Extension.Builder setUrl(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.url = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'url' field has been set.
      * @return True if the 'url' field has been set, false otherwise.
      */
    public boolean hasUrl() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'url' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Extension.Builder clearUrl() {
      url = null;
      fieldSetFlags()[2] = false;
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
    public io.carrera.fhir.avro.models.Extension.Builder setValue(java.lang.Object value) {
      validate(fields()[3], value);
      this.value = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'value' field has been set.
      * @return True if the 'value' field has been set, false otherwise.
      */
    public boolean hasValue() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.Extension.Builder clearValue() {
      value = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Extension build() {
      try {
        Extension record = new Extension();
        record.id = fieldSetFlags()[0] ? this.id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.extension = fieldSetFlags()[1] ? this.extension : (java.util.List<io.carrera.fhir.avro.models.Extension>) defaultValue(fields()[1]);
        record.url = fieldSetFlags()[2] ? this.url : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.value = fieldSetFlags()[3] ? this.value :  defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Extension>
    WRITER$ = (org.apache.avro.io.DatumWriter<Extension>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Extension>
    READER$ = (org.apache.avro.io.DatumReader<Extension>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}











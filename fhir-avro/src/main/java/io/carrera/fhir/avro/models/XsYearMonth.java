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
public class XsYearMonth extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3544649924524822100L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"XsYearMonth\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"year\",\"type\":\"int\"},{\"name\":\"month\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<XsYearMonth> ENCODER =
      new BinaryMessageEncoder<XsYearMonth>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<XsYearMonth> DECODER =
      new BinaryMessageDecoder<XsYearMonth>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<XsYearMonth> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<XsYearMonth> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<XsYearMonth> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<XsYearMonth>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this XsYearMonth to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a XsYearMonth from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a XsYearMonth instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static XsYearMonth fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int year;
   private int month;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public XsYearMonth() {}

  /**
   * All-args constructor.
   * @param year The new value for year
   * @param month The new value for month
   */
  public XsYearMonth(java.lang.Integer year, java.lang.Integer month) {
    this.year = year;
    this.month = month;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return year;
    case 1: return month;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: year = (java.lang.Integer)value$; break;
    case 1: month = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'year' field.
   * @return The value of the 'year' field.
   */
  public int getYear() {
    return year;
  }


  /**
   * Sets the value of the 'year' field.
   * @param value the value to set.
   */
  public void setYear(int value) {
    this.year = value;
  }

  /**
   * Gets the value of the 'month' field.
   * @return The value of the 'month' field.
   */
  public int getMonth() {
    return month;
  }


  /**
   * Sets the value of the 'month' field.
   * @param value the value to set.
   */
  public void setMonth(int value) {
    this.month = value;
  }

  /**
   * Creates a new XsYearMonth RecordBuilder.
   * @return A new XsYearMonth RecordBuilder
   */
  public static io.carrera.fhir.avro.models.XsYearMonth.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.XsYearMonth.Builder();
  }

  /**
   * Creates a new XsYearMonth RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new XsYearMonth RecordBuilder
   */
  public static io.carrera.fhir.avro.models.XsYearMonth.Builder newBuilder(io.carrera.fhir.avro.models.XsYearMonth.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.XsYearMonth.Builder();
    } else {
      return new io.carrera.fhir.avro.models.XsYearMonth.Builder(other);
    }
  }

  /**
   * Creates a new XsYearMonth RecordBuilder by copying an existing XsYearMonth instance.
   * @param other The existing instance to copy.
   * @return A new XsYearMonth RecordBuilder
   */
  public static io.carrera.fhir.avro.models.XsYearMonth.Builder newBuilder(io.carrera.fhir.avro.models.XsYearMonth other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.XsYearMonth.Builder();
    } else {
      return new io.carrera.fhir.avro.models.XsYearMonth.Builder(other);
    }
  }

  /**
   * RecordBuilder for XsYearMonth instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<XsYearMonth>
    implements org.apache.avro.data.RecordBuilder<XsYearMonth> {

    private int year;
    private int month;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.XsYearMonth.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.year)) {
        this.year = data().deepCopy(fields()[0].schema(), other.year);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.month)) {
        this.month = data().deepCopy(fields()[1].schema(), other.month);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing XsYearMonth instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.XsYearMonth other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.year)) {
        this.year = data().deepCopy(fields()[0].schema(), other.year);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.month)) {
        this.month = data().deepCopy(fields()[1].schema(), other.month);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'year' field.
      * @return The value.
      */
    public int getYear() {
      return year;
    }


    /**
      * Sets the value of the 'year' field.
      * @param value The value of 'year'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.XsYearMonth.Builder setYear(int value) {
      validate(fields()[0], value);
      this.year = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'year' field has been set.
      * @return True if the 'year' field has been set, false otherwise.
      */
    public boolean hasYear() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'year' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.XsYearMonth.Builder clearYear() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'month' field.
      * @return The value.
      */
    public int getMonth() {
      return month;
    }


    /**
      * Sets the value of the 'month' field.
      * @param value The value of 'month'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.XsYearMonth.Builder setMonth(int value) {
      validate(fields()[1], value);
      this.month = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'month' field has been set.
      * @return True if the 'month' field has been set, false otherwise.
      */
    public boolean hasMonth() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'month' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.XsYearMonth.Builder clearMonth() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public XsYearMonth build() {
      try {
        XsYearMonth record = new XsYearMonth();
        record.year = fieldSetFlags()[0] ? this.year : (java.lang.Integer) defaultValue(fields()[0]);
        record.month = fieldSetFlags()[1] ? this.month : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<XsYearMonth>
    WRITER$ = (org.apache.avro.io.DatumWriter<XsYearMonth>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<XsYearMonth>
    READER$ = (org.apache.avro.io.DatumReader<XsYearMonth>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.year);

    out.writeInt(this.month);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.year = in.readInt();

      this.month = in.readInt();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.year = in.readInt();
          break;

        case 1:
          this.month = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}











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
public class ClaimResponse_Item extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 1685755420272795111L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ClaimResponse_Item\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"itemSequence\",\"type\":\"int\"},{\"name\":\"noteNumber\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"int\"}],\"default\":null},{\"name\":\"adjudication\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ClaimResponse_Item_Adjudication\",\"fields\":[{\"name\":\"category\",\"type\":{\"type\":\"record\",\"name\":\"CodeableConcept\",\"fields\":[{\"name\":\"coding\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userSelected\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}}],\"default\":null},{\"name\":\"text\",\"type\":[\"null\",\"string\"],\"default\":null}]}},{\"name\":\"reason\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"amount\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Money\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Decimal\",\"fields\":[{\"name\":\"unscaled_value\",\"type\":\"bytes\",\"logicalType\":\"decimal\"},{\"name\":\"precision\",\"type\":\"int\"},{\"name\":\"scale\",\"type\":\"int\"}]}],\"default\":null},{\"name\":\"currency\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"Decimal\"],\"default\":null}]}}},{\"name\":\"detail\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ClaimResponse_Item_Detail\",\"fields\":[{\"name\":\"detailSequence\",\"type\":\"int\"},{\"name\":\"noteNumber\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"int\"}],\"default\":null},{\"name\":\"adjudication\",\"type\":{\"type\":\"array\",\"items\":\"ClaimResponse_Item_Adjudication\"}},{\"name\":\"subDetail\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ClaimResponse_Item_Detail_SubDetail\",\"fields\":[{\"name\":\"subDetailSequence\",\"type\":\"int\"},{\"name\":\"noteNumber\",\"type\":[\"null\",{\"type\":\"array\",\"items\":\"int\"}],\"default\":null},{\"name\":\"adjudication\",\"type\":{\"type\":\"array\",\"items\":\"ClaimResponse_Item_Adjudication\"}}]}}}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ClaimResponse_Item> ENCODER =
      new BinaryMessageEncoder<ClaimResponse_Item>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ClaimResponse_Item> DECODER =
      new BinaryMessageDecoder<ClaimResponse_Item>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ClaimResponse_Item> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ClaimResponse_Item> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ClaimResponse_Item> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ClaimResponse_Item>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ClaimResponse_Item to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ClaimResponse_Item from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ClaimResponse_Item instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ClaimResponse_Item fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int itemSequence;
   private java.util.List<java.lang.Integer> noteNumber;
   private java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication> adjudication;
   private java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail> detail;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ClaimResponse_Item() {}

  /**
   * All-args constructor.
   * @param itemSequence The new value for itemSequence
   * @param noteNumber The new value for noteNumber
   * @param adjudication The new value for adjudication
   * @param detail The new value for detail
   */
  public ClaimResponse_Item(java.lang.Integer itemSequence, java.util.List<java.lang.Integer> noteNumber, java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication> adjudication, java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail> detail) {
    this.itemSequence = itemSequence;
    this.noteNumber = noteNumber;
    this.adjudication = adjudication;
    this.detail = detail;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return itemSequence;
    case 1: return noteNumber;
    case 2: return adjudication;
    case 3: return detail;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: itemSequence = (java.lang.Integer)value$; break;
    case 1: noteNumber = (java.util.List<java.lang.Integer>)value$; break;
    case 2: adjudication = (java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication>)value$; break;
    case 3: detail = (java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'itemSequence' field.
   * @return The value of the 'itemSequence' field.
   */
  public int getItemSequence() {
    return itemSequence;
  }


  /**
   * Sets the value of the 'itemSequence' field.
   * @param value the value to set.
   */
  public void setItemSequence(int value) {
    this.itemSequence = value;
  }

  /**
   * Gets the value of the 'noteNumber' field.
   * @return The value of the 'noteNumber' field.
   */
  public java.util.List<java.lang.Integer> getNoteNumber() {
    return noteNumber;
  }


  /**
   * Sets the value of the 'noteNumber' field.
   * @param value the value to set.
   */
  public void setNoteNumber(java.util.List<java.lang.Integer> value) {
    this.noteNumber = value;
  }

  /**
   * Gets the value of the 'adjudication' field.
   * @return The value of the 'adjudication' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication> getAdjudication() {
    return adjudication;
  }


  /**
   * Sets the value of the 'adjudication' field.
   * @param value the value to set.
   */
  public void setAdjudication(java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication> value) {
    this.adjudication = value;
  }

  /**
   * Gets the value of the 'detail' field.
   * @return The value of the 'detail' field.
   */
  public java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail> getDetail() {
    return detail;
  }


  /**
   * Sets the value of the 'detail' field.
   * @param value the value to set.
   */
  public void setDetail(java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail> value) {
    this.detail = value;
  }

  /**
   * Creates a new ClaimResponse_Item RecordBuilder.
   * @return A new ClaimResponse_Item RecordBuilder
   */
  public static io.carrera.fhir.avro.models.ClaimResponse_Item.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.ClaimResponse_Item.Builder();
  }

  /**
   * Creates a new ClaimResponse_Item RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ClaimResponse_Item RecordBuilder
   */
  public static io.carrera.fhir.avro.models.ClaimResponse_Item.Builder newBuilder(io.carrera.fhir.avro.models.ClaimResponse_Item.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.ClaimResponse_Item.Builder();
    } else {
      return new io.carrera.fhir.avro.models.ClaimResponse_Item.Builder(other);
    }
  }

  /**
   * Creates a new ClaimResponse_Item RecordBuilder by copying an existing ClaimResponse_Item instance.
   * @param other The existing instance to copy.
   * @return A new ClaimResponse_Item RecordBuilder
   */
  public static io.carrera.fhir.avro.models.ClaimResponse_Item.Builder newBuilder(io.carrera.fhir.avro.models.ClaimResponse_Item other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.ClaimResponse_Item.Builder();
    } else {
      return new io.carrera.fhir.avro.models.ClaimResponse_Item.Builder(other);
    }
  }

  /**
   * RecordBuilder for ClaimResponse_Item instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ClaimResponse_Item>
    implements org.apache.avro.data.RecordBuilder<ClaimResponse_Item> {

    private int itemSequence;
    private java.util.List<java.lang.Integer> noteNumber;
    private java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication> adjudication;
    private java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail> detail;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.ClaimResponse_Item.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.itemSequence)) {
        this.itemSequence = data().deepCopy(fields()[0].schema(), other.itemSequence);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.noteNumber)) {
        this.noteNumber = data().deepCopy(fields()[1].schema(), other.noteNumber);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.adjudication)) {
        this.adjudication = data().deepCopy(fields()[2].schema(), other.adjudication);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.detail)) {
        this.detail = data().deepCopy(fields()[3].schema(), other.detail);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing ClaimResponse_Item instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.ClaimResponse_Item other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.itemSequence)) {
        this.itemSequence = data().deepCopy(fields()[0].schema(), other.itemSequence);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.noteNumber)) {
        this.noteNumber = data().deepCopy(fields()[1].schema(), other.noteNumber);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.adjudication)) {
        this.adjudication = data().deepCopy(fields()[2].schema(), other.adjudication);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.detail)) {
        this.detail = data().deepCopy(fields()[3].schema(), other.detail);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'itemSequence' field.
      * @return The value.
      */
    public int getItemSequence() {
      return itemSequence;
    }


    /**
      * Sets the value of the 'itemSequence' field.
      * @param value The value of 'itemSequence'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item.Builder setItemSequence(int value) {
      validate(fields()[0], value);
      this.itemSequence = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'itemSequence' field has been set.
      * @return True if the 'itemSequence' field has been set, false otherwise.
      */
    public boolean hasItemSequence() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'itemSequence' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item.Builder clearItemSequence() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'noteNumber' field.
      * @return The value.
      */
    public java.util.List<java.lang.Integer> getNoteNumber() {
      return noteNumber;
    }


    /**
      * Sets the value of the 'noteNumber' field.
      * @param value The value of 'noteNumber'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item.Builder setNoteNumber(java.util.List<java.lang.Integer> value) {
      validate(fields()[1], value);
      this.noteNumber = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'noteNumber' field has been set.
      * @return True if the 'noteNumber' field has been set, false otherwise.
      */
    public boolean hasNoteNumber() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'noteNumber' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item.Builder clearNoteNumber() {
      noteNumber = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'adjudication' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication> getAdjudication() {
      return adjudication;
    }


    /**
      * Sets the value of the 'adjudication' field.
      * @param value The value of 'adjudication'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item.Builder setAdjudication(java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication> value) {
      validate(fields()[2], value);
      this.adjudication = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'adjudication' field has been set.
      * @return True if the 'adjudication' field has been set, false otherwise.
      */
    public boolean hasAdjudication() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'adjudication' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item.Builder clearAdjudication() {
      adjudication = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'detail' field.
      * @return The value.
      */
    public java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail> getDetail() {
      return detail;
    }


    /**
      * Sets the value of the 'detail' field.
      * @param value The value of 'detail'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item.Builder setDetail(java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail> value) {
      validate(fields()[3], value);
      this.detail = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'detail' field has been set.
      * @return True if the 'detail' field has been set, false otherwise.
      */
    public boolean hasDetail() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'detail' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item.Builder clearDetail() {
      detail = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ClaimResponse_Item build() {
      try {
        ClaimResponse_Item record = new ClaimResponse_Item();
        record.itemSequence = fieldSetFlags()[0] ? this.itemSequence : (java.lang.Integer) defaultValue(fields()[0]);
        record.noteNumber = fieldSetFlags()[1] ? this.noteNumber : (java.util.List<java.lang.Integer>) defaultValue(fields()[1]);
        record.adjudication = fieldSetFlags()[2] ? this.adjudication : (java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication>) defaultValue(fields()[2]);
        record.detail = fieldSetFlags()[3] ? this.detail : (java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail>) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ClaimResponse_Item>
    WRITER$ = (org.apache.avro.io.DatumWriter<ClaimResponse_Item>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ClaimResponse_Item>
    READER$ = (org.apache.avro.io.DatumReader<ClaimResponse_Item>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.itemSequence);

    if (this.noteNumber == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      long size0 = this.noteNumber.size();
      out.writeArrayStart();
      out.setItemCount(size0);
      long actualSize0 = 0;
      for (java.lang.Integer e0: this.noteNumber) {
        actualSize0++;
        out.startItem();
        out.writeInt(e0);
      }
      out.writeArrayEnd();
      if (actualSize0 != size0)
        throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");
    }

    long size1 = this.adjudication.size();
    out.writeArrayStart();
    out.setItemCount(size1);
    long actualSize1 = 0;
    for (io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication e1: this.adjudication) {
      actualSize1++;
      out.startItem();
      e1.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize1 != size1)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size1 + ", but element count was " + actualSize1 + ".");

    long size2 = this.detail.size();
    out.writeArrayStart();
    out.setItemCount(size2);
    long actualSize2 = 0;
    for (io.carrera.fhir.avro.models.ClaimResponse_Item_Detail e2: this.detail) {
      actualSize2++;
      out.startItem();
      e2.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize2 != size2)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size2 + ", but element count was " + actualSize2 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.itemSequence = in.readInt();

      if (in.readIndex() != 1) {
        in.readNull();
        this.noteNumber = null;
      } else {
        long size0 = in.readArrayStart();
        java.util.List<java.lang.Integer> a0 = this.noteNumber;
        if (a0 == null) {
          a0 = new SpecificData.Array<java.lang.Integer>((int)size0, SCHEMA$.getField("noteNumber").schema().getTypes().get(1));
          this.noteNumber = a0;
        } else a0.clear();
        SpecificData.Array<java.lang.Integer> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.Integer>)a0 : null);
        for ( ; 0 < size0; size0 = in.arrayNext()) {
          for ( ; size0 != 0; size0--) {
            java.lang.Integer e0 = (ga0 != null ? ga0.peek() : null);
            e0 = in.readInt();
            a0.add(e0);
          }
        }
      }

      long size1 = in.readArrayStart();
      java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication> a1 = this.adjudication;
      if (a1 == null) {
        a1 = new SpecificData.Array<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication>((int)size1, SCHEMA$.getField("adjudication").schema());
        this.adjudication = a1;
      } else a1.clear();
      SpecificData.Array<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication>)a1 : null);
      for ( ; 0 < size1; size1 = in.arrayNext()) {
        for ( ; size1 != 0; size1--) {
          io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication e1 = (ga1 != null ? ga1.peek() : null);
          if (e1 == null) {
            e1 = new io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication();
          }
          e1.customDecode(in);
          a1.add(e1);
        }
      }

      long size2 = in.readArrayStart();
      java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail> a2 = this.detail;
      if (a2 == null) {
        a2 = new SpecificData.Array<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail>((int)size2, SCHEMA$.getField("detail").schema());
        this.detail = a2;
      } else a2.clear();
      SpecificData.Array<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail> ga2 = (a2 instanceof SpecificData.Array ? (SpecificData.Array<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail>)a2 : null);
      for ( ; 0 < size2; size2 = in.arrayNext()) {
        for ( ; size2 != 0; size2--) {
          io.carrera.fhir.avro.models.ClaimResponse_Item_Detail e2 = (ga2 != null ? ga2.peek() : null);
          if (e2 == null) {
            e2 = new io.carrera.fhir.avro.models.ClaimResponse_Item_Detail();
          }
          e2.customDecode(in);
          a2.add(e2);
        }
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.itemSequence = in.readInt();
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.noteNumber = null;
          } else {
            long size0 = in.readArrayStart();
            java.util.List<java.lang.Integer> a0 = this.noteNumber;
            if (a0 == null) {
              a0 = new SpecificData.Array<java.lang.Integer>((int)size0, SCHEMA$.getField("noteNumber").schema().getTypes().get(1));
              this.noteNumber = a0;
            } else a0.clear();
            SpecificData.Array<java.lang.Integer> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.Integer>)a0 : null);
            for ( ; 0 < size0; size0 = in.arrayNext()) {
              for ( ; size0 != 0; size0--) {
                java.lang.Integer e0 = (ga0 != null ? ga0.peek() : null);
                e0 = in.readInt();
                a0.add(e0);
              }
            }
          }
          break;

        case 2:
          long size1 = in.readArrayStart();
          java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication> a1 = this.adjudication;
          if (a1 == null) {
            a1 = new SpecificData.Array<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication>((int)size1, SCHEMA$.getField("adjudication").schema());
            this.adjudication = a1;
          } else a1.clear();
          SpecificData.Array<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication> ga1 = (a1 instanceof SpecificData.Array ? (SpecificData.Array<io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication>)a1 : null);
          for ( ; 0 < size1; size1 = in.arrayNext()) {
            for ( ; size1 != 0; size1--) {
              io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication e1 = (ga1 != null ? ga1.peek() : null);
              if (e1 == null) {
                e1 = new io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication();
              }
              e1.customDecode(in);
              a1.add(e1);
            }
          }
          break;

        case 3:
          long size2 = in.readArrayStart();
          java.util.List<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail> a2 = this.detail;
          if (a2 == null) {
            a2 = new SpecificData.Array<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail>((int)size2, SCHEMA$.getField("detail").schema());
            this.detail = a2;
          } else a2.clear();
          SpecificData.Array<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail> ga2 = (a2 instanceof SpecificData.Array ? (SpecificData.Array<io.carrera.fhir.avro.models.ClaimResponse_Item_Detail>)a2 : null);
          for ( ; 0 < size2; size2 = in.arrayNext()) {
            for ( ; size2 != 0; size2--) {
              io.carrera.fhir.avro.models.ClaimResponse_Item_Detail e2 = (ga2 != null ? ga2.peek() : null);
              if (e2 == null) {
                e2 = new io.carrera.fhir.avro.models.ClaimResponse_Item_Detail();
              }
              e2.customDecode(in);
              a2.add(e2);
            }
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










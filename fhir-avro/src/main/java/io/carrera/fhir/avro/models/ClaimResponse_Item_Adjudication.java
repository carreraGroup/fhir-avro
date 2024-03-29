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
public class ClaimResponse_Item_Adjudication extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2335220689987527671L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ClaimResponse_Item_Adjudication\",\"namespace\":\"io.carrera.fhir.avro.models\",\"fields\":[{\"name\":\"category\",\"type\":{\"type\":\"record\",\"name\":\"CodeableConcept\",\"fields\":[{\"name\":\"coding\",\"type\":[\"null\",{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"Coding\",\"fields\":[{\"name\":\"system\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"code\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"display\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"version\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"userSelected\",\"type\":[\"null\",\"boolean\"],\"default\":null}]}}],\"default\":null},{\"name\":\"text\",\"type\":[\"null\",\"string\"],\"default\":null}]}},{\"name\":\"reason\",\"type\":[\"null\",\"CodeableConcept\"],\"default\":null},{\"name\":\"amount\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Money\",\"fields\":[{\"name\":\"value\",\"type\":[\"null\",{\"type\":\"record\",\"name\":\"Decimal\",\"fields\":[{\"name\":\"unscaled_value\",\"type\":\"bytes\",\"logicalType\":\"decimal\"},{\"name\":\"precision\",\"type\":\"int\"},{\"name\":\"scale\",\"type\":\"int\"}]}],\"default\":null},{\"name\":\"currency\",\"type\":[\"null\",\"string\"],\"default\":null}]}],\"default\":null},{\"name\":\"value\",\"type\":[\"null\",\"Decimal\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ClaimResponse_Item_Adjudication> ENCODER =
      new BinaryMessageEncoder<ClaimResponse_Item_Adjudication>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ClaimResponse_Item_Adjudication> DECODER =
      new BinaryMessageDecoder<ClaimResponse_Item_Adjudication>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ClaimResponse_Item_Adjudication> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ClaimResponse_Item_Adjudication> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ClaimResponse_Item_Adjudication> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ClaimResponse_Item_Adjudication>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ClaimResponse_Item_Adjudication to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ClaimResponse_Item_Adjudication from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ClaimResponse_Item_Adjudication instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ClaimResponse_Item_Adjudication fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private io.carrera.fhir.avro.models.CodeableConcept category;
   private io.carrera.fhir.avro.models.CodeableConcept reason;
   private io.carrera.fhir.avro.models.Money amount;
   private io.carrera.fhir.avro.models.Decimal value;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ClaimResponse_Item_Adjudication() {}

  /**
   * All-args constructor.
   * @param category The new value for category
   * @param reason The new value for reason
   * @param amount The new value for amount
   * @param value The new value for value
   */
  public ClaimResponse_Item_Adjudication(io.carrera.fhir.avro.models.CodeableConcept category, io.carrera.fhir.avro.models.CodeableConcept reason, io.carrera.fhir.avro.models.Money amount, io.carrera.fhir.avro.models.Decimal value) {
    this.category = category;
    this.reason = reason;
    this.amount = amount;
    this.value = value;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return category;
    case 1: return reason;
    case 2: return amount;
    case 3: return value;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: category = (io.carrera.fhir.avro.models.CodeableConcept)value$; break;
    case 1: reason = (io.carrera.fhir.avro.models.CodeableConcept)value$; break;
    case 2: amount = (io.carrera.fhir.avro.models.Money)value$; break;
    case 3: value = (io.carrera.fhir.avro.models.Decimal)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'category' field.
   * @return The value of the 'category' field.
   */
  public io.carrera.fhir.avro.models.CodeableConcept getCategory() {
    return category;
  }


  /**
   * Sets the value of the 'category' field.
   * @param value the value to set.
   */
  public void setCategory(io.carrera.fhir.avro.models.CodeableConcept value) {
    this.category = value;
  }

  /**
   * Gets the value of the 'reason' field.
   * @return The value of the 'reason' field.
   */
  public io.carrera.fhir.avro.models.CodeableConcept getReason() {
    return reason;
  }


  /**
   * Sets the value of the 'reason' field.
   * @param value the value to set.
   */
  public void setReason(io.carrera.fhir.avro.models.CodeableConcept value) {
    this.reason = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The value of the 'amount' field.
   */
  public io.carrera.fhir.avro.models.Money getAmount() {
    return amount;
  }


  /**
   * Sets the value of the 'amount' field.
   * @param value the value to set.
   */
  public void setAmount(io.carrera.fhir.avro.models.Money value) {
    this.amount = value;
  }

  /**
   * Gets the value of the 'value' field.
   * @return The value of the 'value' field.
   */
  public io.carrera.fhir.avro.models.Decimal getValue() {
    return value;
  }


  /**
   * Sets the value of the 'value' field.
   * @param value the value to set.
   */
  public void setValue(io.carrera.fhir.avro.models.Decimal value) {
    this.value = value;
  }

  /**
   * Creates a new ClaimResponse_Item_Adjudication RecordBuilder.
   * @return A new ClaimResponse_Item_Adjudication RecordBuilder
   */
  public static io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder newBuilder() {
    return new io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder();
  }

  /**
   * Creates a new ClaimResponse_Item_Adjudication RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ClaimResponse_Item_Adjudication RecordBuilder
   */
  public static io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder newBuilder(io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder();
    } else {
      return new io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder(other);
    }
  }

  /**
   * Creates a new ClaimResponse_Item_Adjudication RecordBuilder by copying an existing ClaimResponse_Item_Adjudication instance.
   * @param other The existing instance to copy.
   * @return A new ClaimResponse_Item_Adjudication RecordBuilder
   */
  public static io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder newBuilder(io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication other) {
    if (other == null) {
      return new io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder();
    } else {
      return new io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder(other);
    }
  }

  /**
   * RecordBuilder for ClaimResponse_Item_Adjudication instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ClaimResponse_Item_Adjudication>
    implements org.apache.avro.data.RecordBuilder<ClaimResponse_Item_Adjudication> {

    private io.carrera.fhir.avro.models.CodeableConcept category;
    private io.carrera.fhir.avro.models.CodeableConcept.Builder categoryBuilder;
    private io.carrera.fhir.avro.models.CodeableConcept reason;
    private io.carrera.fhir.avro.models.CodeableConcept.Builder reasonBuilder;
    private io.carrera.fhir.avro.models.Money amount;
    private io.carrera.fhir.avro.models.Money.Builder amountBuilder;
    private io.carrera.fhir.avro.models.Decimal value;
    private io.carrera.fhir.avro.models.Decimal.Builder valueBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.category)) {
        this.category = data().deepCopy(fields()[0].schema(), other.category);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasCategoryBuilder()) {
        this.categoryBuilder = io.carrera.fhir.avro.models.CodeableConcept.newBuilder(other.getCategoryBuilder());
      }
      if (isValidValue(fields()[1], other.reason)) {
        this.reason = data().deepCopy(fields()[1].schema(), other.reason);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasReasonBuilder()) {
        this.reasonBuilder = io.carrera.fhir.avro.models.CodeableConcept.newBuilder(other.getReasonBuilder());
      }
      if (isValidValue(fields()[2], other.amount)) {
        this.amount = data().deepCopy(fields()[2].schema(), other.amount);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (other.hasAmountBuilder()) {
        this.amountBuilder = io.carrera.fhir.avro.models.Money.newBuilder(other.getAmountBuilder());
      }
      if (isValidValue(fields()[3], other.value)) {
        this.value = data().deepCopy(fields()[3].schema(), other.value);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (other.hasValueBuilder()) {
        this.valueBuilder = io.carrera.fhir.avro.models.Decimal.newBuilder(other.getValueBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing ClaimResponse_Item_Adjudication instance
     * @param other The existing instance to copy.
     */
    private Builder(io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.category)) {
        this.category = data().deepCopy(fields()[0].schema(), other.category);
        fieldSetFlags()[0] = true;
      }
      this.categoryBuilder = null;
      if (isValidValue(fields()[1], other.reason)) {
        this.reason = data().deepCopy(fields()[1].schema(), other.reason);
        fieldSetFlags()[1] = true;
      }
      this.reasonBuilder = null;
      if (isValidValue(fields()[2], other.amount)) {
        this.amount = data().deepCopy(fields()[2].schema(), other.amount);
        fieldSetFlags()[2] = true;
      }
      this.amountBuilder = null;
      if (isValidValue(fields()[3], other.value)) {
        this.value = data().deepCopy(fields()[3].schema(), other.value);
        fieldSetFlags()[3] = true;
      }
      this.valueBuilder = null;
    }

    /**
      * Gets the value of the 'category' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.CodeableConcept getCategory() {
      return category;
    }


    /**
      * Sets the value of the 'category' field.
      * @param value The value of 'category'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder setCategory(io.carrera.fhir.avro.models.CodeableConcept value) {
      validate(fields()[0], value);
      this.categoryBuilder = null;
      this.category = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'category' field has been set.
      * @return True if the 'category' field has been set, false otherwise.
      */
    public boolean hasCategory() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'category' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.CodeableConcept.Builder getCategoryBuilder() {
      if (categoryBuilder == null) {
        if (hasCategory()) {
          setCategoryBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder(category));
        } else {
          setCategoryBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder());
        }
      }
      return categoryBuilder;
    }

    /**
     * Sets the Builder instance for the 'category' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder setCategoryBuilder(io.carrera.fhir.avro.models.CodeableConcept.Builder value) {
      clearCategory();
      categoryBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'category' field has an active Builder instance
     * @return True if the 'category' field has an active Builder instance
     */
    public boolean hasCategoryBuilder() {
      return categoryBuilder != null;
    }

    /**
      * Clears the value of the 'category' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder clearCategory() {
      category = null;
      categoryBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'reason' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.CodeableConcept getReason() {
      return reason;
    }


    /**
      * Sets the value of the 'reason' field.
      * @param value The value of 'reason'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder setReason(io.carrera.fhir.avro.models.CodeableConcept value) {
      validate(fields()[1], value);
      this.reasonBuilder = null;
      this.reason = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'reason' field has been set.
      * @return True if the 'reason' field has been set, false otherwise.
      */
    public boolean hasReason() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'reason' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.CodeableConcept.Builder getReasonBuilder() {
      if (reasonBuilder == null) {
        if (hasReason()) {
          setReasonBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder(reason));
        } else {
          setReasonBuilder(io.carrera.fhir.avro.models.CodeableConcept.newBuilder());
        }
      }
      return reasonBuilder;
    }

    /**
     * Sets the Builder instance for the 'reason' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder setReasonBuilder(io.carrera.fhir.avro.models.CodeableConcept.Builder value) {
      clearReason();
      reasonBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'reason' field has an active Builder instance
     * @return True if the 'reason' field has an active Builder instance
     */
    public boolean hasReasonBuilder() {
      return reasonBuilder != null;
    }

    /**
      * Clears the value of the 'reason' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder clearReason() {
      reason = null;
      reasonBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.Money getAmount() {
      return amount;
    }


    /**
      * Sets the value of the 'amount' field.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder setAmount(io.carrera.fhir.avro.models.Money value) {
      validate(fields()[2], value);
      this.amountBuilder = null;
      this.amount = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[2];
    }

    /**
     * Gets the Builder instance for the 'amount' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Money.Builder getAmountBuilder() {
      if (amountBuilder == null) {
        if (hasAmount()) {
          setAmountBuilder(io.carrera.fhir.avro.models.Money.newBuilder(amount));
        } else {
          setAmountBuilder(io.carrera.fhir.avro.models.Money.newBuilder());
        }
      }
      return amountBuilder;
    }

    /**
     * Sets the Builder instance for the 'amount' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder setAmountBuilder(io.carrera.fhir.avro.models.Money.Builder value) {
      clearAmount();
      amountBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'amount' field has an active Builder instance
     * @return True if the 'amount' field has an active Builder instance
     */
    public boolean hasAmountBuilder() {
      return amountBuilder != null;
    }

    /**
      * Clears the value of the 'amount' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder clearAmount() {
      amount = null;
      amountBuilder = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'value' field.
      * @return The value.
      */
    public io.carrera.fhir.avro.models.Decimal getValue() {
      return value;
    }


    /**
      * Sets the value of the 'value' field.
      * @param value The value of 'value'.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder setValue(io.carrera.fhir.avro.models.Decimal value) {
      validate(fields()[3], value);
      this.valueBuilder = null;
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
     * Gets the Builder instance for the 'value' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public io.carrera.fhir.avro.models.Decimal.Builder getValueBuilder() {
      if (valueBuilder == null) {
        if (hasValue()) {
          setValueBuilder(io.carrera.fhir.avro.models.Decimal.newBuilder(value));
        } else {
          setValueBuilder(io.carrera.fhir.avro.models.Decimal.newBuilder());
        }
      }
      return valueBuilder;
    }

    /**
     * Sets the Builder instance for the 'value' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder setValueBuilder(io.carrera.fhir.avro.models.Decimal.Builder value) {
      clearValue();
      valueBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'value' field has an active Builder instance
     * @return True if the 'value' field has an active Builder instance
     */
    public boolean hasValueBuilder() {
      return valueBuilder != null;
    }

    /**
      * Clears the value of the 'value' field.
      * @return This builder.
      */
    public io.carrera.fhir.avro.models.ClaimResponse_Item_Adjudication.Builder clearValue() {
      value = null;
      valueBuilder = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ClaimResponse_Item_Adjudication build() {
      try {
        ClaimResponse_Item_Adjudication record = new ClaimResponse_Item_Adjudication();
        if (categoryBuilder != null) {
          try {
            record.category = this.categoryBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("category"));
            throw e;
          }
        } else {
          record.category = fieldSetFlags()[0] ? this.category : (io.carrera.fhir.avro.models.CodeableConcept) defaultValue(fields()[0]);
        }
        if (reasonBuilder != null) {
          try {
            record.reason = this.reasonBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("reason"));
            throw e;
          }
        } else {
          record.reason = fieldSetFlags()[1] ? this.reason : (io.carrera.fhir.avro.models.CodeableConcept) defaultValue(fields()[1]);
        }
        if (amountBuilder != null) {
          try {
            record.amount = this.amountBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("amount"));
            throw e;
          }
        } else {
          record.amount = fieldSetFlags()[2] ? this.amount : (io.carrera.fhir.avro.models.Money) defaultValue(fields()[2]);
        }
        if (valueBuilder != null) {
          try {
            record.value = this.valueBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("value"));
            throw e;
          }
        } else {
          record.value = fieldSetFlags()[3] ? this.value : (io.carrera.fhir.avro.models.Decimal) defaultValue(fields()[3]);
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
  private static final org.apache.avro.io.DatumWriter<ClaimResponse_Item_Adjudication>
    WRITER$ = (org.apache.avro.io.DatumWriter<ClaimResponse_Item_Adjudication>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ClaimResponse_Item_Adjudication>
    READER$ = (org.apache.avro.io.DatumReader<ClaimResponse_Item_Adjudication>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.category.customEncode(out);

    if (this.reason == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.reason.customEncode(out);
    }

    if (this.amount == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.amount.customEncode(out);
    }

    if (this.value == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      this.value.customEncode(out);
    }

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.category == null) {
        this.category = new io.carrera.fhir.avro.models.CodeableConcept();
      }
      this.category.customDecode(in);

      if (in.readIndex() != 1) {
        in.readNull();
        this.reason = null;
      } else {
        if (this.reason == null) {
          this.reason = new io.carrera.fhir.avro.models.CodeableConcept();
        }
        this.reason.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.amount = null;
      } else {
        if (this.amount == null) {
          this.amount = new io.carrera.fhir.avro.models.Money();
        }
        this.amount.customDecode(in);
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.value = null;
      } else {
        if (this.value == null) {
          this.value = new io.carrera.fhir.avro.models.Decimal();
        }
        this.value.customDecode(in);
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.category == null) {
            this.category = new io.carrera.fhir.avro.models.CodeableConcept();
          }
          this.category.customDecode(in);
          break;

        case 1:
          if (in.readIndex() != 1) {
            in.readNull();
            this.reason = null;
          } else {
            if (this.reason == null) {
              this.reason = new io.carrera.fhir.avro.models.CodeableConcept();
            }
            this.reason.customDecode(in);
          }
          break;

        case 2:
          if (in.readIndex() != 1) {
            in.readNull();
            this.amount = null;
          } else {
            if (this.amount == null) {
              this.amount = new io.carrera.fhir.avro.models.Money();
            }
            this.amount.customDecode(in);
          }
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.value = null;
          } else {
            if (this.value == null) {
              this.value = new io.carrera.fhir.avro.models.Decimal();
            }
            this.value.customDecode(in);
          }
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}











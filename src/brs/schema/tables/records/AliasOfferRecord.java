/*
 * This file is generated by jOOQ.
 */
package brs.schema.tables.records;


import brs.schema.tables.AliasOffer;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AliasOfferRecord extends UpdatableRecordImpl<AliasOfferRecord> implements Record6<Long, Long, Long, Long, Integer, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>DB.alias_offer.db_id</code>.
     */
    public void setDbId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>DB.alias_offer.db_id</code>.
     */
    public Long getDbId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>DB.alias_offer.id</code>.
     */
    public void setId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>DB.alias_offer.id</code>.
     */
    public Long getId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>DB.alias_offer.price</code>.
     */
    public void setPrice(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>DB.alias_offer.price</code>.
     */
    public Long getPrice() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>DB.alias_offer.buyer_id</code>.
     */
    public void setBuyerId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>DB.alias_offer.buyer_id</code>.
     */
    public Long getBuyerId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>DB.alias_offer.height</code>.
     */
    public void setHeight(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>DB.alias_offer.height</code>.
     */
    public Integer getHeight() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>DB.alias_offer.latest</code>.
     */
    public void setLatest(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>DB.alias_offer.latest</code>.
     */
    public Boolean getLatest() {
        return (Boolean) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, Long, Long, Integer, Boolean> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, Long, Long, Long, Integer, Boolean> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AliasOffer.ALIAS_OFFER.DB_ID;
    }

    @Override
    public Field<Long> field2() {
        return AliasOffer.ALIAS_OFFER.ID;
    }

    @Override
    public Field<Long> field3() {
        return AliasOffer.ALIAS_OFFER.PRICE;
    }

    @Override
    public Field<Long> field4() {
        return AliasOffer.ALIAS_OFFER.BUYER_ID;
    }

    @Override
    public Field<Integer> field5() {
        return AliasOffer.ALIAS_OFFER.HEIGHT;
    }

    @Override
    public Field<Boolean> field6() {
        return AliasOffer.ALIAS_OFFER.LATEST;
    }

    @Override
    public Long component1() {
        return getDbId();
    }

    @Override
    public Long component2() {
        return getId();
    }

    @Override
    public Long component3() {
        return getPrice();
    }

    @Override
    public Long component4() {
        return getBuyerId();
    }

    @Override
    public Integer component5() {
        return getHeight();
    }

    @Override
    public Boolean component6() {
        return getLatest();
    }

    @Override
    public Long value1() {
        return getDbId();
    }

    @Override
    public Long value2() {
        return getId();
    }

    @Override
    public Long value3() {
        return getPrice();
    }

    @Override
    public Long value4() {
        return getBuyerId();
    }

    @Override
    public Integer value5() {
        return getHeight();
    }

    @Override
    public Boolean value6() {
        return getLatest();
    }

    @Override
    public AliasOfferRecord value1(Long value) {
        setDbId(value);
        return this;
    }

    @Override
    public AliasOfferRecord value2(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AliasOfferRecord value3(Long value) {
        setPrice(value);
        return this;
    }

    @Override
    public AliasOfferRecord value4(Long value) {
        setBuyerId(value);
        return this;
    }

    @Override
    public AliasOfferRecord value5(Integer value) {
        setHeight(value);
        return this;
    }

    @Override
    public AliasOfferRecord value6(Boolean value) {
        setLatest(value);
        return this;
    }

    @Override
    public AliasOfferRecord values(Long value1, Long value2, Long value3, Long value4, Integer value5, Boolean value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AliasOfferRecord
     */
    public AliasOfferRecord() {
        super(AliasOffer.ALIAS_OFFER);
    }

    /**
     * Create a detached, initialised AliasOfferRecord
     */
    public AliasOfferRecord(Long dbId, Long id, Long price, Long buyerId, Integer height, Boolean latest) {
        super(AliasOffer.ALIAS_OFFER);

        setDbId(dbId);
        setId(id);
        setPrice(price);
        setBuyerId(buyerId);
        setHeight(height);
        setLatest(latest);
    }
}

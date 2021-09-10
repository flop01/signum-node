/*
 * This file is generated by jOOQ.
 */
package brs.schema.tables;


import brs.schema.Db;
import brs.schema.Indexes;
import brs.schema.Keys;
import brs.schema.tables.records.BidOrderRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BidOrder extends TableImpl<BidOrderRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DB.bid_order</code>
     */
    public static final BidOrder BID_ORDER = new BidOrder();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BidOrderRecord> getRecordType() {
        return BidOrderRecord.class;
    }

    /**
     * The column <code>DB.bid_order.db_id</code>.
     */
    public final TableField<BidOrderRecord, Long> DB_ID = createField(DSL.name("db_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>DB.bid_order.id</code>.
     */
    public final TableField<BidOrderRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.bid_order.account_id</code>.
     */
    public final TableField<BidOrderRecord, Long> ACCOUNT_ID = createField(DSL.name("account_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.bid_order.asset_id</code>.
     */
    public final TableField<BidOrderRecord, Long> ASSET_ID = createField(DSL.name("asset_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.bid_order.price</code>.
     */
    public final TableField<BidOrderRecord, Long> PRICE = createField(DSL.name("price"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.bid_order.quantity</code>.
     */
    public final TableField<BidOrderRecord, Long> QUANTITY = createField(DSL.name("quantity"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>DB.bid_order.creation_height</code>.
     */
    public final TableField<BidOrderRecord, Integer> CREATION_HEIGHT = createField(DSL.name("creation_height"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DB.bid_order.height</code>.
     */
    public final TableField<BidOrderRecord, Integer> HEIGHT = createField(DSL.name("height"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>DB.bid_order.latest</code>.
     */
    public final TableField<BidOrderRecord, Boolean> LATEST = createField(DSL.name("latest"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field("1", SQLDataType.BOOLEAN)), this, "");

    private BidOrder(Name alias, Table<BidOrderRecord> aliased) {
        this(alias, aliased, null);
    }

    private BidOrder(Name alias, Table<BidOrderRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>DB.bid_order</code> table reference
     */
    public BidOrder(String alias) {
        this(DSL.name(alias), BID_ORDER);
    }

    /**
     * Create an aliased <code>DB.bid_order</code> table reference
     */
    public BidOrder(Name alias) {
        this(alias, BID_ORDER);
    }

    /**
     * Create a <code>DB.bid_order</code> table reference
     */
    public BidOrder() {
        this(DSL.name("bid_order"), null);
    }

    public <O extends Record> BidOrder(Table<O> child, ForeignKey<O, BidOrderRecord> key) {
        super(child, key, BID_ORDER);
    }

    @Override
    public Schema getSchema() {
        return Db.DB;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.BID_ORDER_BID_ORDER_ACCOUNT_ID_IDX, Indexes.BID_ORDER_BID_ORDER_ASSET_ID_PRICE_IDX, Indexes.BID_ORDER_BID_ORDER_CREATION_IDX);
    }

    @Override
    public Identity<BidOrderRecord, Long> getIdentity() {
        return (Identity<BidOrderRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<BidOrderRecord> getPrimaryKey() {
        return Keys.KEY_BID_ORDER_PRIMARY;
    }

    @Override
    public List<UniqueKey<BidOrderRecord>> getKeys() {
        return Arrays.<UniqueKey<BidOrderRecord>>asList(Keys.KEY_BID_ORDER_PRIMARY, Keys.KEY_BID_ORDER_BID_ORDER_ID_HEIGHT_IDX);
    }

    @Override
    public BidOrder as(String alias) {
        return new BidOrder(DSL.name(alias), this);
    }

    @Override
    public BidOrder as(Name alias) {
        return new BidOrder(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BidOrder rename(String name) {
        return new BidOrder(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BidOrder rename(Name name) {
        return new BidOrder(name, null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, Long, Long, Long, Long, Integer, Integer, Boolean> fieldsRow() {
        return (Row9) super.fieldsRow();
    }
}

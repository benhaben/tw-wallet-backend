/*
 * This file is generated by jOOQ.
 */
package com.thoughtworks.wallet.gen.tables;


import com.thoughtworks.wallet.gen.Indexes;
import com.thoughtworks.wallet.gen.Keys;
import com.thoughtworks.wallet.gen.Public;
import com.thoughtworks.wallet.gen.tables.records.TblTransactionsRecord;

import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblTransactions extends TableImpl<TblTransactionsRecord> {

    private static final long serialVersionUID = -1091570631;

    /**
     * The reference instance of <code>public.tbl_transactions</code>
     */
    public static final TblTransactions TBL_TRANSACTIONS = new TblTransactions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblTransactionsRecord> getRecordType() {
        return TblTransactionsRecord.class;
    }

    /**
     * The column <code>public.tbl_transactions.hash</code>.
     */
    public final TableField<TblTransactionsRecord, String> HASH = createField(DSL.name("hash"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("''''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tbl_transactions.tx_type</code>.
     */
    public final TableField<TblTransactionsRecord, String> TX_TYPE = createField(DSL.name("tx_type"), org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.tbl_transactions.create_time</code>.
     */
    public final TableField<TblTransactionsRecord, OffsetDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>public.tbl_transactions.height</code>.
     */
    public final TableField<TblTransactionsRecord, Long> HEIGHT = createField(DSL.name("height"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tbl_transactions.amount</code>.
     */
    public final TableField<TblTransactionsRecord, BigInteger> AMOUNT = createField(DSL.name("amount"), org.jooq.impl.SQLDataType.DECIMAL_INTEGER.precision(60), this, "");

    /**
     * The column <code>public.tbl_transactions.asset_name</code>.
     */
    public final TableField<TblTransactionsRecord, String> ASSET_NAME = createField(DSL.name("asset_name"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("''''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tbl_transactions.from_address</code>.
     */
    public final TableField<TblTransactionsRecord, String> FROM_ADDRESS = createField(DSL.name("from_address"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("''''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tbl_transactions.to_address</code>.
     */
    public final TableField<TblTransactionsRecord, String> TO_ADDRESS = createField(DSL.name("to_address"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.field("''''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.tbl_transactions.tx_index</code>.
     */
    public final TableField<TblTransactionsRecord, Long> TX_INDEX = createField(DSL.name("tx_index"), org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>public.tbl_transactions.event_type</code>.
     */
    public final TableField<TblTransactionsRecord, Short> EVENT_TYPE = createField(DSL.name("event_type"), org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>public.tbl_transactions.contract_hash</code>.
     */
    public final TableField<TblTransactionsRecord, String> CONTRACT_HASH = createField(DSL.name("contract_hash"), org.jooq.impl.SQLDataType.VARCHAR(255).defaultValue(org.jooq.impl.DSL.field("''''::character varying", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * Create a <code>public.tbl_transactions</code> table reference
     */
    public TblTransactions() {
        this(DSL.name("tbl_transactions"), null);
    }

    /**
     * Create an aliased <code>public.tbl_transactions</code> table reference
     */
    public TblTransactions(String alias) {
        this(DSL.name(alias), TBL_TRANSACTIONS);
    }

    /**
     * Create an aliased <code>public.tbl_transactions</code> table reference
     */
    public TblTransactions(Name alias) {
        this(alias, TBL_TRANSACTIONS);
    }

    private TblTransactions(Name alias, Table<TblTransactionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblTransactions(Name alias, Table<TblTransactionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TblTransactions(Table<O> child, ForeignKey<O, TblTransactionsRecord> key) {
        super(child, key, TBL_TRANSACTIONS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TBL_TRANSACTIONS_HASH_INDEX);
    }

    @Override
    public UniqueKey<TblTransactionsRecord> getPrimaryKey() {
        return Keys.TBL_TRANSACTIONS_PKEY;
    }

    @Override
    public List<UniqueKey<TblTransactionsRecord>> getKeys() {
        return Arrays.<UniqueKey<TblTransactionsRecord>>asList(Keys.TBL_TRANSACTIONS_PKEY);
    }

    @Override
    public TblTransactions as(String alias) {
        return new TblTransactions(DSL.name(alias), this);
    }

    @Override
    public TblTransactions as(Name alias) {
        return new TblTransactions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TblTransactions rename(String name) {
        return new TblTransactions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TblTransactions rename(Name name) {
        return new TblTransactions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<String, String, OffsetDateTime, Long, BigInteger, String, String, String, Long, Short, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}

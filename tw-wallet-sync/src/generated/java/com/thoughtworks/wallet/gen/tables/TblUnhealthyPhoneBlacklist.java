/*
 * This file is generated by jOOQ.
 */
package com.thoughtworks.wallet.gen.tables;


import com.thoughtworks.wallet.gen.Keys;
import com.thoughtworks.wallet.gen.Public;
import com.thoughtworks.wallet.gen.tables.records.TblUnhealthyPhoneBlacklistRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
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
public class TblUnhealthyPhoneBlacklist extends TableImpl<TblUnhealthyPhoneBlacklistRecord> {

    private static final long serialVersionUID = 1804062200;

    /**
     * The reference instance of <code>public.tbl_unhealthy_phone_blacklist</code>
     */
    public static final TblUnhealthyPhoneBlacklist TBL_UNHEALTHY_PHONE_BLACKLIST = new TblUnhealthyPhoneBlacklist();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblUnhealthyPhoneBlacklistRecord> getRecordType() {
        return TblUnhealthyPhoneBlacklistRecord.class;
    }

    /**
     * The column <code>public.tbl_unhealthy_phone_blacklist.phone</code>.
     */
    public final TableField<TblUnhealthyPhoneBlacklistRecord, String> PHONE = createField(DSL.name("phone"), org.jooq.impl.SQLDataType.VARCHAR(20).nullable(false), this, "");

    /**
     * The column <code>public.tbl_unhealthy_phone_blacklist.create_time</code>.
     */
    public final TableField<TblUnhealthyPhoneBlacklistRecord, OffsetDateTime> CREATE_TIME = createField(DSL.name("create_time"), org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false).defaultValue(org.jooq.impl.DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * Create a <code>public.tbl_unhealthy_phone_blacklist</code> table reference
     */
    public TblUnhealthyPhoneBlacklist() {
        this(DSL.name("tbl_unhealthy_phone_blacklist"), null);
    }

    /**
     * Create an aliased <code>public.tbl_unhealthy_phone_blacklist</code> table reference
     */
    public TblUnhealthyPhoneBlacklist(String alias) {
        this(DSL.name(alias), TBL_UNHEALTHY_PHONE_BLACKLIST);
    }

    /**
     * Create an aliased <code>public.tbl_unhealthy_phone_blacklist</code> table reference
     */
    public TblUnhealthyPhoneBlacklist(Name alias) {
        this(alias, TBL_UNHEALTHY_PHONE_BLACKLIST);
    }

    private TblUnhealthyPhoneBlacklist(Name alias, Table<TblUnhealthyPhoneBlacklistRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblUnhealthyPhoneBlacklist(Name alias, Table<TblUnhealthyPhoneBlacklistRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TblUnhealthyPhoneBlacklist(Table<O> child, ForeignKey<O, TblUnhealthyPhoneBlacklistRecord> key) {
        super(child, key, TBL_UNHEALTHY_PHONE_BLACKLIST);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<TblUnhealthyPhoneBlacklistRecord> getPrimaryKey() {
        return Keys.TBL_UNHEALTHY_PHONE_BLACKLIST_PKEY;
    }

    @Override
    public List<UniqueKey<TblUnhealthyPhoneBlacklistRecord>> getKeys() {
        return Arrays.<UniqueKey<TblUnhealthyPhoneBlacklistRecord>>asList(Keys.TBL_UNHEALTHY_PHONE_BLACKLIST_PKEY);
    }

    @Override
    public TblUnhealthyPhoneBlacklist as(String alias) {
        return new TblUnhealthyPhoneBlacklist(DSL.name(alias), this);
    }

    @Override
    public TblUnhealthyPhoneBlacklist as(Name alias) {
        return new TblUnhealthyPhoneBlacklist(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TblUnhealthyPhoneBlacklist rename(String name) {
        return new TblUnhealthyPhoneBlacklist(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TblUnhealthyPhoneBlacklist rename(Name name) {
        return new TblUnhealthyPhoneBlacklist(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, OffsetDateTime> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}

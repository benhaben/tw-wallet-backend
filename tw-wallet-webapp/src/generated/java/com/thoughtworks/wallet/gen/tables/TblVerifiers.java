/*
 * This file is generated by jOOQ.
 */
package com.thoughtworks.wallet.gen.tables;


import com.thoughtworks.wallet.gen.Keys;
import com.thoughtworks.wallet.gen.Public;
import com.thoughtworks.wallet.gen.tables.records.TblVerifiersRecord;

import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class TblVerifiers extends TableImpl<TblVerifiersRecord> {

    private static final long serialVersionUID = 393880460;

    /**
     * The reference instance of <code>public.tbl_verifiers</code>
     */
    public static final TblVerifiers TBL_VERIFIERS = new TblVerifiers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TblVerifiersRecord> getRecordType() {
        return TblVerifiersRecord.class;
    }

    /**
     * The column <code>public.tbl_verifiers.id</code>.
     */
    public final TableField<TblVerifiersRecord, String> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.tbl_verifiers.name</code>.
     */
    public final TableField<TblVerifiersRecord, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>public.tbl_verifiers.vc_types</code>.
     */
    public final TableField<TblVerifiersRecord, String[]> VC_TYPES = createField(DSL.name("vc_types"), org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * Create a <code>public.tbl_verifiers</code> table reference
     */
    public TblVerifiers() {
        this(DSL.name("tbl_verifiers"), null);
    }

    /**
     * Create an aliased <code>public.tbl_verifiers</code> table reference
     */
    public TblVerifiers(String alias) {
        this(DSL.name(alias), TBL_VERIFIERS);
    }

    /**
     * Create an aliased <code>public.tbl_verifiers</code> table reference
     */
    public TblVerifiers(Name alias) {
        this(alias, TBL_VERIFIERS);
    }

    private TblVerifiers(Name alias, Table<TblVerifiersRecord> aliased) {
        this(alias, aliased, null);
    }

    private TblVerifiers(Name alias, Table<TblVerifiersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> TblVerifiers(Table<O> child, ForeignKey<O, TblVerifiersRecord> key) {
        super(child, key, TBL_VERIFIERS);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<TblVerifiersRecord> getPrimaryKey() {
        return Keys.TBL_VERIFIERS_PKEY;
    }

    @Override
    public List<UniqueKey<TblVerifiersRecord>> getKeys() {
        return Arrays.<UniqueKey<TblVerifiersRecord>>asList(Keys.TBL_VERIFIERS_PKEY);
    }

    @Override
    public TblVerifiers as(String alias) {
        return new TblVerifiers(DSL.name(alias), this);
    }

    @Override
    public TblVerifiers as(Name alias) {
        return new TblVerifiers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TblVerifiers rename(String name) {
        return new TblVerifiers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TblVerifiers rename(Name name) {
        return new TblVerifiers(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, String[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}

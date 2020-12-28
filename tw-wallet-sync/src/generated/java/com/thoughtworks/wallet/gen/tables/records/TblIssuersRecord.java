/*
 * This file is generated by jOOQ.
 */
package com.thoughtworks.wallet.gen.tables.records;


import com.thoughtworks.wallet.gen.tables.TblIssuers;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblIssuersRecord extends UpdatableRecordImpl<TblIssuersRecord> implements Record2<Integer, String> {

    private static final long serialVersionUID = 315295252;

    /**
     * Setter for <code>public.tbl_issuers.id</code>.
     */
    public TblIssuersRecord setId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_issuers.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.tbl_issuers.name</code>.
     */
    public TblIssuersRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_issuers.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    @Override
    public Row2<Integer, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TblIssuers.TBL_ISSUERS.ID;
    }

    @Override
    public Field<String> field2() {
        return TblIssuers.TBL_ISSUERS.NAME;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public TblIssuersRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TblIssuersRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public TblIssuersRecord values(Integer value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblIssuersRecord
     */
    public TblIssuersRecord() {
        super(TblIssuers.TBL_ISSUERS);
    }

    /**
     * Create a detached, initialised TblIssuersRecord
     */
    public TblIssuersRecord(Integer id, String name) {
        super(TblIssuers.TBL_ISSUERS);

        set(0, id);
        set(1, name);
    }
}

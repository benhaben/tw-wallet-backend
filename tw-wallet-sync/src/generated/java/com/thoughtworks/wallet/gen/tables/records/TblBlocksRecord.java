/*
 * This file is generated by jOOQ.
 */
package com.thoughtworks.wallet.gen.tables.records;


import com.thoughtworks.wallet.gen.tables.TblBlocks;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TblBlocksRecord extends UpdatableRecordImpl<TblBlocksRecord> implements Record3<Long, String, OffsetDateTime> {

    private static final long serialVersionUID = 1707349878;

    /**
     * Setter for <code>public.tbl_blocks.height</code>.
     */
    public TblBlocksRecord setHeight(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_blocks.height</code>.
     */
    public Long getHeight() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.tbl_blocks.hash</code>.
     */
    public TblBlocksRecord setHash(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_blocks.hash</code>.
     */
    public String getHash() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.tbl_blocks.create_time</code>.
     */
    public TblBlocksRecord setCreateTime(OffsetDateTime value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.tbl_blocks.create_time</code>.
     */
    public OffsetDateTime getCreateTime() {
        return (OffsetDateTime) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, OffsetDateTime> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, OffsetDateTime> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TblBlocks.TBL_BLOCKS.HEIGHT;
    }

    @Override
    public Field<String> field2() {
        return TblBlocks.TBL_BLOCKS.HASH;
    }

    @Override
    public Field<OffsetDateTime> field3() {
        return TblBlocks.TBL_BLOCKS.CREATE_TIME;
    }

    @Override
    public Long component1() {
        return getHeight();
    }

    @Override
    public String component2() {
        return getHash();
    }

    @Override
    public OffsetDateTime component3() {
        return getCreateTime();
    }

    @Override
    public Long value1() {
        return getHeight();
    }

    @Override
    public String value2() {
        return getHash();
    }

    @Override
    public OffsetDateTime value3() {
        return getCreateTime();
    }

    @Override
    public TblBlocksRecord value1(Long value) {
        setHeight(value);
        return this;
    }

    @Override
    public TblBlocksRecord value2(String value) {
        setHash(value);
        return this;
    }

    @Override
    public TblBlocksRecord value3(OffsetDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public TblBlocksRecord values(Long value1, String value2, OffsetDateTime value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TblBlocksRecord
     */
    public TblBlocksRecord() {
        super(TblBlocks.TBL_BLOCKS);
    }

    /**
     * Create a detached, initialised TblBlocksRecord
     */
    public TblBlocksRecord(Long height, String hash, OffsetDateTime createTime) {
        super(TblBlocks.TBL_BLOCKS);

        set(0, height);
        set(1, hash);
        set(2, createTime);
    }
}
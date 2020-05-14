/*
 * This file is generated by jOOQ.
 */
package com.thoughtworks.wallet.gen;


import com.thoughtworks.wallet.gen.tables.FlywaySchemaHistory;
import com.thoughtworks.wallet.gen.tables.TblBlocks;
import com.thoughtworks.wallet.gen.tables.TblHealthyVerificationClaim;
import com.thoughtworks.wallet.gen.tables.TblIdentities;
import com.thoughtworks.wallet.gen.tables.TblSuspectedPatientsPhoneList;
import com.thoughtworks.wallet.gen.tables.TblTransactions;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Public extends SchemaImpl {

    private static final long serialVersionUID = 331071086;

    /**
     * The reference instance of <code>public</code>
     */
    public static final Public PUBLIC = new Public();

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    public final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>public.tbl_blocks</code>.
     */
    public final TblBlocks TBL_BLOCKS = TblBlocks.TBL_BLOCKS;

    /**
     * The table <code>public.tbl_healthy_verification_claim</code>.
     */
    public final TblHealthyVerificationClaim TBL_HEALTHY_VERIFICATION_CLAIM = TblHealthyVerificationClaim.TBL_HEALTHY_VERIFICATION_CLAIM;

    /**
     * The table <code>public.tbl_identities</code>.
     */
    public final TblIdentities TBL_IDENTITIES = TblIdentities.TBL_IDENTITIES;

    /**
     * The table <code>public.tbl_suspected_patients_phone_list</code>.
     */
    public final TblSuspectedPatientsPhoneList TBL_SUSPECTED_PATIENTS_PHONE_LIST = TblSuspectedPatientsPhoneList.TBL_SUSPECTED_PATIENTS_PHONE_LIST;

    /**
     * The table <code>public.tbl_transactions</code>.
     */
    public final TblTransactions TBL_TRANSACTIONS = TblTransactions.TBL_TRANSACTIONS;

    /**
     * No further instances allowed
     */
    private Public() {
        super("public", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY,
            TblBlocks.TBL_BLOCKS,
            TblHealthyVerificationClaim.TBL_HEALTHY_VERIFICATION_CLAIM,
            TblIdentities.TBL_IDENTITIES,
            TblSuspectedPatientsPhoneList.TBL_SUSPECTED_PATIENTS_PHONE_LIST,
            TblTransactions.TBL_TRANSACTIONS);
    }
}

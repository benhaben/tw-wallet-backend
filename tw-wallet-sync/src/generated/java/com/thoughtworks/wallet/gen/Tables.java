/*
 * This file is generated by jOOQ.
 */
package com.thoughtworks.wallet.gen;


import com.thoughtworks.wallet.gen.tables.FlywaySchemaHistory;
import com.thoughtworks.wallet.gen.tables.TblBlocks;
import com.thoughtworks.wallet.gen.tables.TblHealthyVerificationClaim;
import com.thoughtworks.wallet.gen.tables.TblIdentities;
import com.thoughtworks.wallet.gen.tables.TblTransactions;
import com.thoughtworks.wallet.gen.tables.TblUnhealthyPhoneBlacklist;


/**
 * Convenience access to all tables in public
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.flyway_schema_history</code>.
     */
    public static final FlywaySchemaHistory FLYWAY_SCHEMA_HISTORY = FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY;

    /**
     * The table <code>public.tbl_blocks</code>.
     */
    public static final TblBlocks TBL_BLOCKS = TblBlocks.TBL_BLOCKS;

    /**
     * The table <code>public.tbl_healthy_verification_claim</code>.
     */
    public static final TblHealthyVerificationClaim TBL_HEALTHY_VERIFICATION_CLAIM = TblHealthyVerificationClaim.TBL_HEALTHY_VERIFICATION_CLAIM;

    /**
     * The table <code>public.tbl_identities</code>.
     */
    public static final TblIdentities TBL_IDENTITIES = TblIdentities.TBL_IDENTITIES;

    /**
     * The table <code>public.tbl_transactions</code>.
     */
    public static final TblTransactions TBL_TRANSACTIONS = TblTransactions.TBL_TRANSACTIONS;

    /**
     * The table <code>public.tbl_unhealthy_phone_blacklist</code>.
     */
    public static final TblUnhealthyPhoneBlacklist TBL_UNHEALTHY_PHONE_BLACKLIST = TblUnhealthyPhoneBlacklist.TBL_UNHEALTHY_PHONE_BLACKLIST;
}

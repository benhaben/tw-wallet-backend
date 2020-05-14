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
import com.thoughtworks.wallet.gen.tables.records.FlywaySchemaHistoryRecord;
import com.thoughtworks.wallet.gen.tables.records.TblBlocksRecord;
import com.thoughtworks.wallet.gen.tables.records.TblHealthyVerificationClaimRecord;
import com.thoughtworks.wallet.gen.tables.records.TblIdentitiesRecord;
import com.thoughtworks.wallet.gen.tables.records.TblTransactionsRecord;
import com.thoughtworks.wallet.gen.tables.records.TblUnhealthyPhoneBlacklistRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = UniqueKeys0.FLYWAY_SCHEMA_HISTORY_PK;
    public static final UniqueKey<TblBlocksRecord> TBL_BLOCKS_PKEY = UniqueKeys0.TBL_BLOCKS_PKEY;
    public static final UniqueKey<TblHealthyVerificationClaimRecord> TBL_HEALTHY_VERIFICATION_CLAIM_PKEY = UniqueKeys0.TBL_HEALTHY_VERIFICATION_CLAIM_PKEY;
    public static final UniqueKey<TblIdentitiesRecord> TBL_IDENTITIES_PKEY = UniqueKeys0.TBL_IDENTITIES_PKEY;
    public static final UniqueKey<TblTransactionsRecord> TBL_TRANSACTIONS_PKEY = UniqueKeys0.TBL_TRANSACTIONS_PKEY;
    public static final UniqueKey<TblUnhealthyPhoneBlacklistRecord> TBL_UNHEALTHY_PHONE_BLACKLIST_PKEY = UniqueKeys0.TBL_UNHEALTHY_PHONE_BLACKLIST_PKEY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 {
        public static final UniqueKey<FlywaySchemaHistoryRecord> FLYWAY_SCHEMA_HISTORY_PK = Internal.createUniqueKey(FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY, "flyway_schema_history_pk", new TableField[] { FlywaySchemaHistory.FLYWAY_SCHEMA_HISTORY.INSTALLED_RANK }, true);
        public static final UniqueKey<TblBlocksRecord> TBL_BLOCKS_PKEY = Internal.createUniqueKey(TblBlocks.TBL_BLOCKS, "tbl_blocks_pkey", new TableField[] { TblBlocks.TBL_BLOCKS.HEIGHT }, true);
        public static final UniqueKey<TblHealthyVerificationClaimRecord> TBL_HEALTHY_VERIFICATION_CLAIM_PKEY = Internal.createUniqueKey(TblHealthyVerificationClaim.TBL_HEALTHY_VERIFICATION_CLAIM, "tbl_healthy_verification_claim_pkey", new TableField[] { TblHealthyVerificationClaim.TBL_HEALTHY_VERIFICATION_CLAIM.ID }, true);
        public static final UniqueKey<TblIdentitiesRecord> TBL_IDENTITIES_PKEY = Internal.createUniqueKey(TblIdentities.TBL_IDENTITIES, "tbl_identities_pkey", new TableField[] { TblIdentities.TBL_IDENTITIES.HEIGHT, TblIdentities.TBL_IDENTITIES.TX_INDEX }, true);
        public static final UniqueKey<TblTransactionsRecord> TBL_TRANSACTIONS_PKEY = Internal.createUniqueKey(TblTransactions.TBL_TRANSACTIONS, "tbl_transactions_pkey", new TableField[] { TblTransactions.TBL_TRANSACTIONS.HEIGHT, TblTransactions.TBL_TRANSACTIONS.TX_INDEX }, true);
        public static final UniqueKey<TblUnhealthyPhoneBlacklistRecord> TBL_UNHEALTHY_PHONE_BLACKLIST_PKEY = Internal.createUniqueKey(TblUnhealthyPhoneBlacklist.TBL_UNHEALTHY_PHONE_BLACKLIST, "tbl_unhealthy_phone_blacklist_pkey", new TableField[] { TblUnhealthyPhoneBlacklist.TBL_UNHEALTHY_PHONE_BLACKLIST.PHONE }, true);
    }
}

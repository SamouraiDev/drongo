package com.sparrowwallet.drongo.wallet;

import com.sparrowwallet.drongo.protocol.Sha256Hash;
import com.sparrowwallet.drongo.protocol.Transaction;

import java.util.Date;

public class BlockTransaction extends BlockTransactionHash implements Comparable<BlockTransaction> {
    private final Transaction transaction;

    public BlockTransaction(Sha256Hash hash, int height, Date date, Long fee, Transaction transaction) {
        super(hash, height, date, fee);
        this.transaction = transaction;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    @Override
    public int compareTo(BlockTransaction blockchainTransaction) {
        return super.compareTo(blockchainTransaction);
    }
}

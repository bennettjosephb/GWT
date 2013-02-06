package com.sample.guice;

import com.google.inject.ProvidedBy;

@ProvidedBy(MySqlDatabaseTransactionLogProvider.class)
public interface TransactionLog {

}

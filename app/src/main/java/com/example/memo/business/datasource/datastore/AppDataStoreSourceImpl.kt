package com.example.memo.business.datasource.datastore

import com.example.memo.framework.datasource.datastore.AppDataStoreService
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppDataStoreSourceImpl
@Inject
constructor(
    private val appDataStore: AppDataStoreService
): AppDataStoreSource {

    override suspend fun setValue(key: String, value: String) {
        return appDataStore.setValue(key, value)
    }

    override suspend fun readValue(key: String): String? {
        return appDataStore.readValue(key)
    }
}
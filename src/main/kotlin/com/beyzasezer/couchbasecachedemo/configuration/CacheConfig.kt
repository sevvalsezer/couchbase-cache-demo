package com.beyzasezer.couchbasecachedemo.configuration

import com.couchbase.client.java.Cluster
import org.springframework.beans.factory.annotation.Value
import org.springframework.cache.CacheManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.couchbase.SimpleCouchbaseClientFactory
import org.springframework.data.couchbase.cache.CouchbaseCacheManager

@Configuration
class CacheConfig {
    @Value("\${couchbase.url}")
    private val url: String? = null

    @Value("\${couchbase.username}")
    private val username: String? = null

    @Value("\${couchbase.password}")
    private val password: String? = null

    @Value("\${couchbase.bucket}")
    private val bucket: String? = null

    @Bean
    fun cluster(): Cluster {
        return Cluster.connect(url, username, password)
    }

    @Bean
    fun cacheManager(cluster: Cluster): CacheManager {
        return CouchbaseCacheManager.create(SimpleCouchbaseClientFactory(cluster, bucket, null))
    }
}

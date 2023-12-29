package com.beyzasezer.couchbasecachedemo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class CouchbaseCacheDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(CouchbaseCacheDemoApplication::class.java, *args)
}

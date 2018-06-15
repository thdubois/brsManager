package com.brs.brsManager

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class BrsManagerApplication

fun main(args: Array<String>) {
    runApplication<BrsManagerApplication>(*args)
}

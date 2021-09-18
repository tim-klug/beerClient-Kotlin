package com.theothertim.beerclient

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BeerClientApplication

fun main(args: Array<String>) {
    runApplication<BeerClientApplication>(*args)
}

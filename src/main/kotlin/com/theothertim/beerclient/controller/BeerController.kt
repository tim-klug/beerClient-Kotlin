package com.theothertim.beerclient.controller

import org.springframework.stereotype.Controller
import org.springframework.web.reactive.function.client.ClientResponse
import reactor.core.publisher.Mono
import java.util.*

@Controller
class BeerController {

    companion object Configs {
        const val API_URL: String = "https://sfg-beer-works.github.io/brewery-api/"
    }

    fun listBeers(
        pageNumber: Int = 1,
        pageSize: Int = 25,
        beerName: String,
        beerStyle: Beer.BeerStyle,
        showInventoryOnHand: Boolean = false
    ): Mono<List<Beer>> = Mono.just(listOf(Beer()))


    fun getBeerById(id: UUID?, showInventoryOnHand: Boolean): Mono<Beer>? {
        return Mono.just(Beer())
    }

    fun getBeerByUpcCode(upc: String): Mono<Beer> = Mono.just(Beer())

    fun updateBeerById(
        id: UUID?,
        bearName: String,
        beerStyle: Beer.BeerStyle,
        upc: String,
        quantityOnHand: Int,
        price: String
    ): ClientResponse = TODO()

    fun deleteBeerById(id: UUID): ClientResponse = TODO()

    fun createNewBear(
        beerName: String,
        beerStyle: Beer.BeerStyle,
        upc: String,
        price: String
    ): Mono<String> = Mono.just("")

    data class Beer(
        val id: UUID = UUID.randomUUID(),
        val beerName: String = "",
        val beerStyle: BeerStyle = BeerStyle.PILSNER,
        val upc: String = "",
        val quantityOnHand: Int = 0,
        val price: String = ""
    ) {
        enum class BeerStyle {
            LAGER, PILSNER, STOUT, GOSE, PORTER, ALE, WHEAT, IPA, PALE_ALE, SAISON
        }
    }
}

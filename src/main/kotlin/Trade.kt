sealed class Trade(protected val id: Int=0) {
    var counterParty: String = ""
    fun printId(){
        println(id)
    }
}

class EquityTrade(val name: String) : Trade()

class FxTrade(val currency1: String,
              val currency2: String) : Trade()

class InterestRateSwap(val fixedRate: Double,
                       val floatingRate: Double) : Trade()

class Swaption(val data: String) : Trade()
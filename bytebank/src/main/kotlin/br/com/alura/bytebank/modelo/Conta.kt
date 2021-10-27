package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    var titular: Cliente,
    val numero: Int,
) {
    var saldo = 0.0
        protected set

    companion object {
        var total = 0
            private set
    }

    init {
        println("Criando conta")
        total++
    }


    fun deposita(valor: Double) {
        if (valor > 0) {
            saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta) {
        if (saldo < valor){
            throw SaldoInsuficienteException()
        }
            saldo -= valor
            destino.deposita(valor)
    }

}
fun testaLacos() {
    var i = 0
    while (i < 5) {
        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println(i)
    }


    for (i in 10 downTo 1 step 2) {
        val titular = "Alex $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo da conta: $saldo")
        println(i)

    }
}
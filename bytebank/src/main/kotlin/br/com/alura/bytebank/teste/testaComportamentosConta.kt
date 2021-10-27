import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaComportamentosConta() {

    val alex = Cliente("Alex", "", Endereco(),1)

    val contaAlex = ContaCorrente(alex, 1000)
    contaAlex.deposita(200.0)

    val fran = Cliente("Fran", "", Endereco(), 2)

    val contaFran = ContaPoupanca(fran, 1001)
    contaFran.deposita(300.0)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println("Depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("Depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("Sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("Sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(500.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("Transferencia da conta da fran para o alex")

    try{
        contaFran.transfere(200.0, contaAlex)
        println("Transferencia bem sucedida")
    } catch (e: SaldoInsuficienteException) {
        println("Falha na transferencia")
        println("Saldo insuficiente")
        e.printStackTrace()
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(Cliente("Alex", "111.111.111-11", Endereco(logradouro = "Rua Vergueiro"), 1), 1000)
    println("titular ${contaCorrente.titular}")
    println("nome do titular ${contaCorrente.titular.nome}")
    println("cpf do titular ${contaCorrente.titular.cpf}")
    println("Endereco titular ${contaCorrente.titular.endereco.logradouro}")

    val contaPoupanca = ContaPoupanca(Cliente("Fran", "",Endereco() ,2), 1001)

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("Saldo Corrente: ${contaCorrente.saldo}")
    println("Saldo Poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo Corrente após saque: ${contaCorrente.saldo}")
    println("Saldo Poupanca após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Saldo Corrente após transferir para poupanca: ${contaCorrente.saldo}")
    println("Saldo Poupanca após receber transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("Saldo Corrente após receber transferencia: ${contaCorrente.saldo}")
    println("Saldo Poupanca após transferir para corrente: ${contaPoupanca.saldo}")
}
import br.com.alura.bytebank.modelo.Analista
import br.com.alura.bytebank.modelo.CalculadoraBonificacao
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente

fun testaFuncionarios() {
    val alex = Analista("Alex", "111.111.111-11", 1000.0)
    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificacao ${alex.bonificacao}")

    val fran = Gerente("Fran", "222.222.222-22", 2000.0, 1234)
    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificacao ${fran.bonificacao}")

    if (fran.autentica(1234)) {
        println("autenticou com sucesso")
    } else {
        println("falha na autenticacao")
    }

    val gui = Diretor("Gui", "333.333.333-33", 4000.0, 1234, 200.0)
    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificacao ${gui.bonificacao}")
    println("plr ${gui.plr}")

    val maria = Analista("Maria", "444.444.444-44", 3000.0)


    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
    calculadora.registra(maria)

    println("total de bonificacao: ${calculadora.total}")
}
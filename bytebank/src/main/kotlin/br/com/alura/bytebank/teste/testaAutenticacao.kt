import br.com.alura.bytebank.modelo.*

fun testaAutenticacao() {
    val gerente = Gerente("Alex", "111.111.111-11", 1000.00, 1000)

    val diretor = Diretor("Fran", "222.222.222-22", 2000.0, 2000, 200.0)

    val cliente = Cliente("Gui", "333.333.333-33", Endereco() ,1234)

    val sistema = SistemaInterno()
    sistema.entra(gerente, 1000)
    sistema.entra(diretor, 2000)
    sistema.entra(cliente, 1234)



}
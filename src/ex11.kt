fun main() {
    println("Digite a largura da parede:")
    val largura: Double = readLine()!!.toDouble()

    println("Digite a altura da parede:")
    val altura: Double = readLine()!!.toDouble()

    val area = (altura * largura)
    val tinta: Double = (area / 2)

    println("Área a ser pintada é de $area")
    println("Quantidade de tinta necessária para o serviço: $tinta")
}


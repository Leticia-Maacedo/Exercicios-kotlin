//Exercício resolvendo a formula f = m * a


fun calcularforca(massa:Double,aceleracao:Double): Double {
    return massa * aceleracao
}



fun main(){
    println("Digite o valor da massa:")
    val massa:Double = readln().toDouble()
    println("Digite o valor da aceleração:")
    val aceleracao:Double = readln().toDouble()
    val forca = calcularforca(massa, aceleracao)
    println("Á força é de ${forca}")



}
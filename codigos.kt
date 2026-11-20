fun main() {
    println("BLOCO I: ARRAYS UNIDIMENSIONAIS\n")
    exercicio1()
    exercicio2()
    exercicio3()
    exercicio4()
    exercicio5()

    println("\nBLOCO II: MATRIZES BIDIMENSIONAIS\n")
    exercicio6()
    exercicio7()
    exercicio8()
    exercicio9()
    exercicio10()
}

// BLOCO I: ARRAYS UNIDIMENSIONAIS

fun exercicio1() {
    println("--- 1. Inversão de Vetor ---")
    val intArray = intArrayOf(10, 20, 30, 40, 50, 60)
    println("Original: ${intArray.joinToString()}")

    var inicio = 0
    var fim = intArray.size - 1

    while (inicio < fim) {
        val temp = intArray[inicio]
        intArray[inicio] = intArray[fim]
        intArray[fim] = temp
        inicio++
        fim--
    }
    println("Invertido: ${intArray.joinToString()}\n")
}

fun exercicio2() {
    println("--- 2. Busca e Interrupção ---")
    val codigos = arrayOf("TX100", "TX200", "TX300", "TX400", "TX500")
    val alvo = "TX300"

    for (i in codigos.indices) {
        if (codigos[i] == alvo) {
            println("Código '$alvo' encontrado na posição (índice): $i")
            break
        }
    }
    println()
}

fun exercicio3() {
    println("--- 3. Média de Temperaturas ---")
    val temperaturas = doubleArrayOf(23.5, 25.0, 19.8, 28.2, 22.1, 24.5, 21.0)
    var soma = 0.0

    for (temp in temperaturas) {
        soma += temp
    }
    val media = soma / temperaturas.size
    println("Média semanal: %.2f".format(media))

    print("Dias (índices) acima da média: ")
    for (i in temperaturas.indices) {
        if (temperaturas[i] > media) {
            print("$i ")
        }
    }
    println("\n")
}

fun exercicio4() {
    println("--- 4. Filtragem de Pares com Step ---")
    val numeros = IntArray(20) { it + 1 } 
    var soma = 0

    for (i in 0 until numeros.size step 2) {
        soma += numeros[i]
    }
    println("Soma dos valores em índices pares: $soma\n")
}

fun exercicio5() {
    println("--- 5. Listagem com Índices ---")
    val tarefas = listOf("Estudar Kotlin", "Fazer compras", "Lavar o carro", "Treinar", "Ler um livro")

    for ((index, tarefa) in tarefas.withIndex()) {
        println("${index + 1} - $tarefa")
    }
    println()
}

// BLOCO II: MATRIZES BIDIMENSIONAIS

fun exercicio6() {
    println("--- 6. Soma por Linhas ---")
    val matriz = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12)
    )

    for (i in matriz.indices) {
        var somaLinha = 0
        for (j in matriz[i].indices) {
            somaLinha += matriz[i][j]
        }
        println("Soma da linha $i: $somaLinha")
    }
    println()
}

fun exercicio7() {
    println("--- 7. Matriz Transposta ---")
    val matrizOriginal = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )
    val transposta = Array(3) { IntArray(2) }

    for (i in matrizOriginal.indices) {
        for (j in matrizOriginal[i].indices) {
            transposta[j][i] = matrizOriginal[i][j]
        }
    }

    println("Matriz Original:")
    for (linha in matrizOriginal) println(linha.joinToString("\t"))

    println("\nMatriz Transposta:")
    for (linha in transposta) println(linha.joinToString("\t"))
    println()
}

fun exercicio8() {
    println("--- 8. Análise de Diagonais ---")
    val matriz = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(13, 14, 15, 16)
    )
    var somaDiagonalPrincipal = 0

    println("Matriz:")
    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            print("${matriz[i][j]}\t")
            if (i == j) {
                somaDiagonalPrincipal += matriz[i][j]
            }
        }
        println() 
    }
    println("Soma da Diagonal Principal: $somaDiagonalPrincipal\n")
}

fun exercicio9() {
    println("--- 9. Identificação de Zeros com Continue ---")
    val matriz = arrayOf(
        intArrayOf(5, 0, 3),
        intArrayOf(0, 8, 2),
        intArrayOf(7, 4, 0)
    )
    var somaValoresValidos = 0

    for (linha in matriz) {
        for (valor in linha) {
            if (valor == 0) {
                continue 
            }
            somaValoresValidos += valor
        }
    }
    println("Soma dos valores maiores que zero: $somaValoresValidos\n")
}

fun exercicio10() {
    println("--- 10. Boletim de Alunos ---")
    val notas = arrayOf(
        doubleArrayOf(8.0, 7.5), 
        doubleArrayOf(5.0, 6.0), 
        doubleArrayOf(9.0, 9.5)  
    )
    var somaMedias = 0.0

    for (i in notas.indices) {
        val mediaIndividual = (notas[i][0] + notas[i][1]) / 2.0
        somaMedias += mediaIndividual
        val status = if (mediaIndividual >= 7.0) "Aprovado" else "Reprovado"
        
        println("Aluno ${i + 1} | Média: %.2f | Situação: %s".format(mediaIndividual, status))
    }

    val mediaGeralTurma = somaMedias / notas.size
    println("\nMédia geral da turma: %.2f".format(mediaGeralTurma))
}

package org.example

fun main() {
    val encryptedMessage = "F2p)v\"y233{0->c}ttelciFc"
    val half = encryptedMessage.chunked(encryptedMessage.length / 2)
    println(decryptedFirstHalf(half[0]) + decryptedSecondHalf(half[1]))
}

fun decryptedFirstHalf(encryptedFirstHalf: String): String { //decoding the first half
    /*    return encryptedFirstHalf.map {it + 1}.joinToString("").replace('5', 's').
            replace('4', 'u').map {it - 3}.joinToString("").replace('0','o') decryption without shift */
    var firstHalf = shift(encryptedFirstHalf) {it + 1}
    firstHalf = firstHalf.replace('5', 's')
    firstHalf = firstHalf.replace('4', 'u')
    firstHalf = shift(firstHalf) {it - 3}
    firstHalf = firstHalf.replace('0', 'o')
    return firstHalf

}

fun decryptedSecondHalf(encryptedSecondHalf: String): String{ //decoding the second half
//    return encryptedSecondHalf.reversed().map {it - 4}.joinToString("").replace('_',' ') //decryption without shift
    var secondHalf = encryptedSecondHalf.reversed()
    secondHalf = shift(secondHalf) {it - 4}
    secondHalf = secondHalf.replace('_',' ')
    return secondHalf
}

fun shift(sourceString: String, shifting: (sourceChar: Char) -> Char): String {
    var shiftedString = ""
    for(i in sourceString){
        shiftedString += shifting.invoke(i)
    }
    return shiftedString
}
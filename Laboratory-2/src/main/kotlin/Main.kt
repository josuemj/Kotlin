import jdk.dynalink.Operation
import javax.print.attribute.standard.NumberUp

private fun calculateProduct(numbers: List<Int>):Int{
    //acc represents the acumulated number so far
    return numbers.reduce{acc,num->acc*num}
}

private fun arrayMean(numbers:List<Double>): Double{
    return numbers.reduce{acc,number->acc+number}/numbers.size
}

private fun isPalindrome(word: String): Boolean{
    return word == word.reversed()
}

/**
 * Given an array of numbers
 * return: an array of arrays, one array will contain even numbers and the second one odd numbers if applicable
 * 0 index returns even numbers
 * 1 index returns odd numbers
 */
private fun evenOddList(randomNumbers: List<Int>):MutableList<List<Int>>{

    val evenNumbers = randomNumbers.filter { it % 2 == 0 }
    val oddNumbers = randomNumbers.filter {  it % 2 == 1}

    var myList: MutableList<List<Int>> = mutableListOf()
    myList.add(evenNumbers)
    myList.add(oddNumbers)
    return myList
}

/**
 * Create perfomOperation function that takes 2 numbers and lambda function
 *
 */

private fun perfomOperator(number1: Int, number2: Int,lambda: (Int,Int)->Int ={x,y -> x*y}): Int{
    return lambda(number2,number1)
}

fun main(args: Array<String>) {

    //Attempt 1
    val myNums: List<Int> = listOf(1,43,532,32)
    println(calculateProduct(myNums))

    //Filter function to extract even and odd
    print("\nSHOWING LIST OF EVEN NUMBERS")
    println(evenOddList(myNums).get(0))

    print("SHOWING LIST OF ODD NUMBERS")
    println(evenOddList(myNums).get(1))

    //IsPalindrome
    val myString = "holaMundo"
    val palindrome = "level"


    println("PALINDROME WORDS")
    print("Is $myString palindrome? :${isPalindrome(myString)}")
    print("\nIs $palindrome palindrome? :${isPalindrome(palindrome)}")

    //
    val names = listOf("Alice", "Bob", "Charlie")
    var namesMessage = names.map { "Hello $it" }

    println("\n==============\nMAPPING SAMPLE\n==============")
    namesMessage.forEach { println(it) }

    //Lambda as argument
    val myLambda: (Int,Int) -> Int = {a,b-> a * b}

    val productResutlt = perfomOperator(2, 3)
    print("\nResult of mult 2 and 3 is ${productResutlt}")

}

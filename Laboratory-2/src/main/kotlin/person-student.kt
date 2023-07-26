import kotlin.random.Random

data class Person(val name: String,val age: Int,val gender: String)
data class Student(val name: String,val age: Int,val gender: String, val studentId: String)

/**
 * Create a mapping function that receives Person and provides student
 *
 */

fun personMapping(person: Person): Student{
    return Student(person.name,person.age,person.gender,Random.nextInt(1000,2000).toString())
}

fun main(){

    val myPerson = Person("Josue",20,"Male")
    println("The student ${personMapping(myPerson).name} ${personMapping(myPerson).age} has years old")
}

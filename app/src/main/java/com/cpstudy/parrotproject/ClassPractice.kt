package com.cpstudy.parrotproject

val square: (Int) -> (Int) = { number -> number * number}

val nameAge = {name: String, age: Int ->
    println("$name / $age")
}

val pizzaIsGreat: String.() -> String = {
    this + "Pizza is the best!"
}

val calculate: (Int) -> String = {
    when(it) {
        in 0..40 -> "Flat"
        in 41..80 -> "Thin"
        else -> "None"
    }
}

fun invokeLambda(lambda: (Int) -> Boolean) : String {
    return "answer is ${lambda(5)}"
}

fun main() {
    println(square(2))

    val a = "moon said"
    val b = "ahn said"

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    print(invokeLambda { it > 6 })
}
fun main() {
    val a = 1;
    val b = 2;
    val max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            print("$i---$j")
            if (i == 1 && j == 2) break@loop
        }
    }

    foo()
    foo2()
    val isEmpty: Boolean
        get() =  1
    println(isEmpty)
}

fun foo() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda - the forEach loop
        println(it)
    }
    println(" done with explicit label")
}

fun foo2() {
    run loop@{
        listOf(1, 2, 3, 4, 5).forEach {
            if (it == 3) return@loop // non-local return from the lambda passed to run
            print(it)
        }
    }
    print(" done with nested loop")
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}

fun main(args: Array<String>) {
    println("Hello World!")
}
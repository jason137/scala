def isTrue(a: Any) = a match {
    case 0 | "" => false
    case _ => true
}

println(isTrue(1))

def signum(k: Int) = k match {
    case k if k > 0 => 1
    case k if k < 0 => -1
    case _ => 0
}

println(signum(-10))
println(signum(0))
println(signum(100))

for (i <- (1 to 10).reverse)
    print(i)

def countdown(k: Int) = 
    for (i <- (1 to k).reverse)
        println(i)

countdown(17)

// TODO make recursive!
def unicodeProduct(k: String): Long = {

    var p : Long = 1

    for (ch <- k) p *= ch
    p

}

unicodeProduct("Hello")
println

val k = 9415087488.toLong
assert(unicodeProduct("Hello") == k)

val k = "Hello".map(_.toLong).product
print(k)

// def unicodeProduct(k: String): Long = {
// 
//     var p : Long = 1
//     for (ch <- k)
//         p *= ch.toLong
// 
//     p
// 
// }

// unicodeProduct("Hello")

import math._
def xn(x: Int, n: Int): Double = n match {
    case n if (n > 0) && (n % 2 == 0) => pow(xn(x, n / 2), 2)
    case n if (n > 0) && (n % 2 != 0) => x * xn(x, n - 1)
    case n if (n == 0) => 1
    case n if (n < 0) => 1 / xn(x, -n)
}

assert(xn(2, 2) == 4)
assert(xn(2, 3) == 8)
assert(xn(2, 0) == 1)
assert(xn(2, -1) == 0.5)

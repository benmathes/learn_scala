// typed factorial w/ a BigInt
def factorial(x: BigInt): BigInt =
  if (x == 0) 1 else x * factorial(x - 1)


// can import Java code
import java.math.BigInteger
def factorialFromJava(x: BigInteger): BigInteger =
  if (x == BigInteger.ZERO)
    BigInteger.ONE
  else
    x.multiply(factorialFromJava(x.subtract(BigInteger.ONE)))


// "Actors" as parrallelism construct. Example from book. Doesn't compile
/**
checksum {
  var sum = 0
  loop {
    receive {
      case Data(bytes) => sum += hash(bytes)
      case GetSum(requester) => requester ! sum
    }
  }
}
  */

// creates private instanve vars and a constructor
class MyClass(index: Int, name: String)
var instance = new MyClass(3, "foobar")

// the "_" is shorthand for running against all in any set-like object
// e.g. a set, a string (all chars), etc.
/**
var name = "asalkj F"
val hasUpperCase = name.exists(_.isUpperCase)
println(hasUpperCase)
*/

val msg2: java.lang.String = "java lang String"
val msg3: String = "String"



//args.foreach(arg => println(arg))
//args.foreach(println)
//for (arg <- args)
//  println("arg: " + arg)


//val strings = Array.apply("a", "b", "c", "d")
//for (i <- 0 to strings.length-1)
//  print(strings(i))


val list = List(1,2,3,4)
val list2 = List(5,6,7)
//println("number of even: " + List(1,2,3,4,5).count(i => i%2 == 0))
//println("   which are: " + List(1,2,3,4,5).filter(i => i%2 == 0))

var jets = Set("boeing", "airbus", "lear")
//println("contains lear? " + jets.contains("lear"))

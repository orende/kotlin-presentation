@file:Suppress("unused", "USELESS_IS_CHECK", "UNUSED_VARIABLE", "ReplaceCallWithComparison", "UnusedEquals", "USELESS_CAST", "UNNECESSARY_SAFE_CALL", "UNNECESSARY_NOT_NULL_ASSERTION", "ObjectPropertyName")

import java.awt.Desktop.*
import java.net.URI
import java.util.*
import javax.swing.JOptionPane
import kotlin.test.assertEquals

val rubrik = """
         __  ___   ______   .___________. __       __  .__   __.
        |  |/  /  /  __  \  |           ||  |     |  | |  \ |  |
        |  '  /  |  |  |  | `---|  |----`|  |     |  | |   \|  |
        |    <   |  |  |  |     |  |     |  |     |  | |  . `  |
        |  .  \  |  `--'  |     |  |     |  `----.|  | |  |\   |
        |__|\__\  \______/      |__|     |_______||__| |__| \__|

        Presenter: Ola Rende
"""



















































/**
 * Kotlin was created by Jetbrain, known for Intellij IDEA and other ideas
 * The first release was in 2011.
 * The language supports both object-oriented and functional programming.
 * It was conceived in the industry, not in academia.
 * The name alludes to an island outside of St Petersburg.
 */


























































fun sayHello() {
    println("Hello world!")
}

























































fun anotherExample(args: Array<String>) {
    val name = if (args.isEmpty()) {
        "world"
    } else {
        args[0]
    }
    println("Hello, $name!")
}

























































class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name")
    }
}

fun yetAnotherGreeting() {
    Greeter("Johan").greet()
}

























































val foo: String = "b"
var bar: Int = 0
fun hello() {
    val str = "Hello"
    print("$str World")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun maxOf(a: Float, b: Float) = if (a > b) a else b



























































/**
 * Why would you want to use Kotlin rather than other JVM languages?
 */

//Kotlin is 100% compatible with Java:

val msgDialog = JOptionPane.showMessageDialog(null, "This is a Java Swing window")

val randomNumber = Random().nextInt()





















































//You can even call into Kotlin code from Java
/**


// example.kt
package demo
class Foo
fun bar(baz: String) {}



// example.java
new demo.Foo();
demo.ExampleKt.bar("test");


*/






















































fun typeInference() {
    val foo = "abc"
    var bar = 123
    val obj = foo

    if (obj is String) {
        print(obj.toUpperCase())
    }
}




























































fun namedArgsAndDefaultValues() {

    fun exponential(base: Int, exponent: Int = 2): Double {
        return Math.pow(base.toDouble(), exponent.toDouble())
    }

    exponential(2, 4) //which parameter is which anyway?

    exponential(base = 2, exponent = 4)

    exponential(base = 2)
}




























































/**
 * A data class creates a number of useful methods automatically.
 */
data class Pixel(val red: Int, val green: Int, val blue: Int, val alpha: Int = 0)

fun doSomethingWithPixel() {
    val pixel = Pixel(1, 2, 3)
    val transparentPixel = Pixel(1, 2, 3, 1)

    pixel.toString()
    pixel.equals(transparentPixel)
    pixel.hashCode()
    pixel.copy()

    // ComponentN functions for destructuring
    pixel.component1()
    pixel.component2()
    pixel.component3()
    pixel.component4()
    val (r,g,b,a) = pixel
    println("Red=$r Green=$g Blue=$b Alpha=$a")
}
























































fun java.util.ArrayList<Int>.reverse(): java.util.ArrayList<Int> {
    return this.reversed() as java.util.ArrayList<Int>
}

fun extensionMethods() {
    var myList = (1..4).toList() as java.util.ArrayList<Int>
    myList = myList.reverse()
    myList.forEach({ t -> println(t) })
}
























































fun nullHandling() {
    val myString: String = null //compilation error

    val anotherString: String? = null

    val length1 = myString?.length
    println("Length of myString: $length1") //prints “null” for length

    val length2 = myString?.length ?: 0
    println("Length of myString: $length2") //prints 0 for length

    val length3 = myString!!.length //tries to convert to non-null or throws NPE

    val length4 = 1
    val aInt: Int? = length4 as? Int //on failed type case null is returned
}

























































/**
When shouldn't you use Kotlin?

● If you have a resource-constrained environment, such as embedded systems.
    ○ But... why are you using a JVM in that case?
● If you have to be compatible with Java 1.5 or earlier.
    ○ 2004 called, they want their Java compiler back...
● If you have an exotic runtime, such as iOS, Arduino or IBM AS/400.
    ○ Try GCC, it's available for any imaginable platform.
● If you have real-time requirements.
    ○ Kotlin depends on the JVM's garbage collector, which will cause pauses in execution.
● If you need to manage memory yourself.
    ○ Try C or C++ instead.

**/





























































/**
 * How can I get started quickly?
 */
fun quickestQuickStart() {
    getDesktop().browse(URI("https://try.kotlinglang.org")) // A web-based Kotlin REPL
}

// There's also built-in support right here in Intellij























































// Another way to get started is to start adding Kotlin for tests:
/**
// build.gradle

buildscript {
    dependencies {
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:1.1.4-3"
    }
}

apply plugin: "kotlin"

test {
    java {
        srcDirs = ["kotlin"]
    }
}

dependencies {
    compile "org.jetbrains.kotlin:kotlin-stdlib:1.1.4-3"
    testCompile "junit:junit:4.11"
    testCompile "org.jetbrains.kotlin:kotlin-test-junit:1.1.4-3"
}

*/

class GetTests {
    @Test
    fun onePlusOneShouldEqualTwo() {
        assertEquals(1+1, 2)
    }
}

























































const val furtherReading = """

    https://kotlinlang.org/

    https://github.com/JetBrains/kotlin-examples

    https://try.kotlinlang.org/#/Examples/

    Kotlin in Action

"""




























































/**

__/\\\\\\\\\\\\\\\_        __/\\\_________        ________________                        ________________        _______________        _________/\\\__
 _\///////\\\/////__        _\/\\\_________        ________________                        ________________        _______________        ________\/\\\__
  _______\/\\\_______        _\/\\\_________        ________________                        ________________        _______________        ________\/\\\__
   _______\/\\\_______        _\/\\\_________        _____/\\\\\\\\__                        _____/\\\\\\\\__        __/\\/\\\\\\___        ________\/\\\__
    _______\/\\\_______        _\/\\\\\\\\\\__        ___/\\\/////\\\_                        ___/\\\/////\\\_        _\/\\\////\\\__        ___/\\\\\\\\\__
     _______\/\\\_______        _\/\\\/////\\\_        __/\\\\\\\\\\\__                        __/\\\\\\\\\\\__        _\/\\\__\//\\\_        __/\\\////\\\__
      _______\/\\\_______        _\/\\\___\/\\\_        _\//\\///////___                        _\//\\///////___        _\/\\\___\/\\\_        _\/\\\__\/\\\__
       _______\/\\\_______        _\/\\\___\/\\\_        __\//\\\\\\\\\\_                        __\//\\\\\\\\\\_        _\/\\\___\/\\\_        _\//\\\\\\\/\\_
        _______\///________        _\///____\///__        ___\//////////__                        ___\//////////__        _\///____\///__        __\///////\//__


 */

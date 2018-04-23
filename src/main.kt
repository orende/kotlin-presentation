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

        Presentatör: Ola Rende
"""



















































/**
 * Kotlin skapades av Jetbrains, kända för bland annat Intellij Idea och andra IDE:er.
 * Den första releasen var 2011.
 * Språket stöder både objekt-orienterad och funktionell programmering.
 * Det har sina rötter i industrin, inte den akademiska världen.
 * Namnet kommer från en ö utanför St Petersburg.
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
 * Varför vill man använda Kotlin framför andra JVM-språk?
 */

//Kotlin är 100% kompatibelt med Java:

val msgDialog = JOptionPane.showMessageDialog(null, "This is a Java Swing window")

val randomNumber = Random().nextInt()





















































//Det går även att anropa Kotlin från Java
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

    exponential(2, 4) //vilken siffra är vilken egentligen?

    exponential(base = 2, exponent = 4)

    exponential(base = 2)
}




























































/**
 * En data-klass skapar ett antal användbara metoder automatiskt
 */
data class Pixel(val red: Int, val green: Int, val blue: Int, val alpha: Int = 0)

fun doSomethingWithPixel() {
    val pixel = Pixel(1, 2, 3)
    val transparentPixel = Pixel(1, 2, 3, 1)

    pixel.toString()
    pixel.equals(transparentPixel)
    pixel.hashCode()
    pixel.copy()

    // ComponentN-funktioner för destructuring
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
    val myString: String = null //kompileringsfel

    val anotherString: String? = null

    val length1 = myString?.length
    println("Length of myString: $length1") //skriver ut “null” för length

    val length2 = myString?.length ?: 0
    println("Length of myString: $length2") //skriver ut 0 för length

    val length3 = myString!!.length //konverterar till non-null eller kastar NPE

    val length4 = 1
    val aInt: Int? = length4 as? Int //vid misslyckat type cast returneras null
}

























































/**
När bör man inte använda Kotlin?

● Om du har en resursbegränsad miljö, tex inbyggda system.
    ○ Men… vad har du med en JVM att göra isåfall?
● Om du måste var kompatibel med Java 1.5 eller tidigare.
    ○ 2004 ringde, dom vill ha sin Java-kompilator tillbaka…
● Om du har en exotisk runtime, som iOS, Arduino eller IBM AS/400.
    ○ Prova GCC, den finns för varenda tänkbar plattform.
● Om du har krav på realtid.
    ○ Kotlin är beroende av JVM:ens garbage collector, vilket orsakar avbrott i exekveringen.
● Om du behöver sköta minneshanteringen själv.
    ○ Prova C eller C++ istället.

**/





























































/**
 * Hur kommer jag igång snabbt?
 */
fun quickestQuickStart() {
    getDesktop().browse(URI("https://try.kotlinglang.org")) // En webbaserad Kotlin-REPL
}

// Det finns även inbyggt stöd här i Intellij Idea























































// Ett annat sätt att komma igång är att börja lägga till Kotlin för tester:
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

























































const val vidareLäsning = """

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

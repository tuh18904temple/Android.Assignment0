import java.util.*
import kotlin.math.sqrt

open class Triangle(_name: String): Shape(_name) {
    var sideA: Double = 0.0
    var sideB: Double = 0.0
    var sideC: Double = 0.0



    override fun setDimensions()
    {
        var sc = Scanner(System.`in`)
        println("********************************\n")
        println("Triangle\n")
        println("Pleas enter first side of triangle: ")
        sideA = sc.nextDouble()
        println("Pleas enter second side of triangle: ")
        sideB = sc.nextDouble()
        println("Pleas enter third side of triangle: ")
        sideC = sc.nextDouble()

    }

    override fun printDimensions()
    {
        var s: Double = sideA + sideB + sideC
        println("First side of triangle is : $sideA\nSecond side of triangle is : $sideB\nThird side of triangle is : $sideC\nPerimeter of triangle is : $s\n")

    }

    override fun getArea()
    {
        var s: Double = sideA + sideB + sideC
        println("Area of triangle is : " + sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)))
        println("********************************\n")
    }
}

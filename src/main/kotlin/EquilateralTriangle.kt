import java.util.*
import kotlin.math.sqrt

class EquilateralTriangle(_name: String): Triangle(_name)
{

    var sA: Double = 0.0

    override fun setDimensions()
    {
        var sc = Scanner(System.`in`)
        println("********************************\n")
        println("Equilateral triangle\n")
        println("Pleas enter side of Equilateral triangle: ")
        sA = sc.nextDouble()

    }

    override fun printDimensions()
    {
        println("The side of Equilateral Triangle is : $sA\n")

    }

    override fun getArea()
    {
        println("Area of Equilateral Triangle is : " + (sqrt(3.0) /4.0) * sA * sA )
        println("********************************\n")
    }
}

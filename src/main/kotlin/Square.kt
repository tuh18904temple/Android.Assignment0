import java.io.Reader
import java.util.Scanner

class Square(_name: String): Shape(_name)
{

    var _length: Double = 0.0
    var _height: Double = 0.0



      override fun setDimensions()
    {
        var sc = Scanner(System.`in`)
        println("********************************\n")
        println("Square\n")
        println("Pleas enter length of square: ")
        _length = sc.nextDouble()
        println("Pleas enter height of square: ")
        _height = sc.nextDouble()

    }

    override fun printDimensions()
    {
        println("\nLength of square is : $_length\nHeight of square is : $_height")

    }

    override fun getArea(): Double {
        var result: Double = _length * _height
        println("Area of square is : " + result)
        println("********************************\n")
        return result
    }
}
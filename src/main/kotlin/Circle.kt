import java.util.*

class Circle(_name: String): Shape (_name)
{
    var _radius:Double = 0.0


    override fun setDimensions()
    {
        var sc = Scanner(System.`in`)
        println("********************************\n")
        println("Circle\n")
        println("Pleas enter radius of circle: ")
        _radius = sc.nextDouble()


    }

    override fun printDimensions()
    {
        println("Radius of circle is : $_radius\n")

    }

    override fun getArea(): Double {
        var result :Double = Math.PI * _radius * _radius
        println("Area of circle is : " + result)
        println("********************************\n")
        return result

    }
}

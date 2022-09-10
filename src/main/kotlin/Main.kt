import java.util.*

fun main(args: Array<String>) {

     // Square
            val sq:Shape
            sq = Square("a")
            sq.setDimensions()
            sq.printDimensions()
            sq.getArea()

    // Circle
            val cir:Shape
            cir = Circle("b")
            cir.setDimensions()
            cir.printDimensions()
            cir.getArea()

    //Triangle
            val tri:Shape
            tri = Triangle("c")
            tri.setDimensions()
            tri.printDimensions()
            tri.getArea()

    //Equilateral Triangle
            val et:Shape
            et = EquilateralTriangle("d")
            et.setDimensions()
            et.printDimensions()
            et.getArea()

}
abstract class Shape (_name : String) : Dimensionable{
    var name = _name

    open fun setDimension()
    {
        println("Nothing")
    }

    override fun printDimensions()
    {
        println("Nothing")
    }

    open fun getArea()
    {
        println("Nothing")
    }


}

import kotlin.math.sqrt

abstract class Shape (_name : String) : Dimensionable{
    var name = _name

    open fun getArea() : Double {
        return 0.0
    }

}


class Square(_name : String) : Shape(_name){

    private var width = 0.0
    private var length = 0.0
    override fun printDimensions() {
        println("Width: $width")
        println("Length: $length")
        println("Area: ${this.getArea()}")
    }
    override fun getArea() : Double{
        return width * length
    }

    fun setDimensions(_width : Double, _length : Double){
        width = _width
        length = _length
    }
}


class Circle(_name : String) : Shape(_name){

    private var radius = 0.0
    private val pi = 3.14
    override fun printDimensions() {
        println("Radius: $radius")
        println("Area: ${this.getArea()}")
    }
    override fun getArea() : Double{
        return pi * (radius * radius)
    }

    fun setDimensions(_radius : Double){
        radius = _radius
    }
}


open class Triangle(_name : String) : Shape(_name){

    private var side1 = 0.0
    private var side2 = 0.0
    private var side3 = 0.0
    override fun printDimensions() {
        println("Side 1: $side1")
        println("Side 2: $side2")
        println("Side 3: $side3")
        println("Area: ${this.getArea()}")
    }
    override fun getArea() : Double{
        val s = (side1 + side2 + side3) / 2
        return sqrt((s * (s-side1) * (s-side2) * (s-side3)))
    }

    fun setDimensions(_side1 : Double, _side2 : Double, _side3 : Double){
        side1 = _side1
        side2 = _side2
        side3 = _side3
    }
}

class EquiTriangle(_name: String) : Triangle(_name){

    fun setDimensions(side : Double){
        side1 = side
        side2 = side
        side3 = side
    }
    private var side1 = 0.0
    private var side2 = 0.0
    private var side3 = 0.0
    override fun printDimensions() {
        println("Side 1: $side1")
        println("Side 2: $side2")
        println("Side 3: $side3")
        println("Area: ${this.getArea()}")
    }
    override fun getArea() : Double{
        val s = (side1 + side2 + side3) / 2
        return sqrt((s * (s-side1) * (s-side2) * (s-side3)))
    }
}
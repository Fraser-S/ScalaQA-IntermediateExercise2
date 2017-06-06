/**
  * Created by Fraser on 06/06/2017.
  */
object Main {

  def addUniqueNumbers(num1 : Int, num2 : Int, num3 : Int): Int ={
    //check for duplicates if duplicate
    var uniqueNumberSum : Int = 0
    if(num1 != num2 && num1 != num3)
      uniqueNumberSum+=num1
    if(num2 != num1 && num2 != num1)
      uniqueNumberSum+=num2
    if(num3 != num1 && num3 != num2)
      uniqueNumberSum+=num3
    uniqueNumberSum
  }

  def main(args : Array[String]) : Unit = {
    println("unique num addition : (1, 2, 3) = " + addUniqueNumbers(1, 2, 3))
    println("unique num addition : (3, 3, 3) = " + addUniqueNumbers(3, 3, 3))
    println("unique num addition : (1, 1, 2) = " + addUniqueNumbers(1, 1, 2))
  }
}

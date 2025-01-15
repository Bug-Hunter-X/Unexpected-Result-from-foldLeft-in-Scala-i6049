```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Correct usage of foldLeft
  val sum = list.foldLeft(0) { (acc, elem) =>
    if (elem % 2 == 0) acc + elem else acc + elem
  }
  println(sum) // Output: 10
  
  //Alternative solution using sum and filter
  val sumEven = list.filter(_ % 2 == 0).sum
  val sumOdd = list.filter(_ % 2 != 0).sum
  println(sumEven + sumOdd) // Output: 10
}
```
```scala
object Main extends App {
  val list = List(1, 2, 3, 4, 5)

  // Incorrect usage of foldLeft leading to unexpected results.
  val sum = list.foldLeft(0)((acc, elem) => if (elem % 2 == 0) acc + elem else acc - elem )

  println(sum) // Output: -1
}
```
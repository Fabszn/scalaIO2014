
object Sample extends App {

  case class Person(name: String)

  val p1: Person = null; // no value

  val p2: Person = Person("Harikovair") // instance of Person


  val opt1 = Option(p1)
  val opt2 = Option(p2)

  println("opt1 : " + opt1)
  println("opt2 : " + opt2)


}

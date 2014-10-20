/**
 * Created by fsznajderman on 20/10/2014.
 */
object Sample1 extends App {

  case class Person(name: String)

  val p1: Person = null;  // no value

  val p2: Person = Person("Harikovair") // instance of Person


  println(Option(p1))
  println(Option(p2))



}

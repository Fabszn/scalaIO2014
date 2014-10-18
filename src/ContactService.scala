import model.Contact
import repository.ContactRepository


object ContactService extends App {

  def findContact(id: Long): Option[Contact] = {
    Option(ContactRepository.getContactById(id));
  }


  println(findContact(3).map(c => c.age).getOrElse("Contact not found"))


  /*

  val c = findContact(2)
  if (c != null) {
    println(c.age)
  } else {
    println("Contact not found")
  }

  */


}

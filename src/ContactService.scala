import model.Contact
import repository.ContactRepository


object ContactService extends App {

  def findContact(id: Long): Contact = {
    ContactRepository.getContactById(id);
  }


  val c = findContact(2)

  if (c != null) {
    println(c.age)
  } else {
    println("Contact not found")
  }


}

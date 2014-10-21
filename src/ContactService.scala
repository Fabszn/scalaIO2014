import model.Contact
import repository.ContactRepository


object ContactService extends App {

  def findContact(id: Long): Contact = {
    ContactRepository.getContactById(id)
  }


  val c = findContact(2)

  println {
    if (c != null) {
      c.age
    } else {
      "Contact not found"
    }
  }

}

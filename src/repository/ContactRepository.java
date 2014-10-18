package repository;

import model.Contact;

import java.util.HashMap;
import java.util.Map;

public class ContactRepository {

    final static Map<Long, Contact> repo = new HashMap<Long, Contact>();

    public static Contact getContactById(final Long id) {
        repo.put(1l, new Contact("titi", "totot", 22));
        repo.put(2l, new Contact("Michel", "Louis", 35));


        return repo.get(id);
    }
}

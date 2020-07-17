package com.arului.UserModule.manager;

import javax.enterprise.context.ApplicationScoped;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

import com.arului.UserModule.modal.UserModal;

@ApplicationScoped
public class UserManager {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMM");
    private AtomicInteger userIdGenerator = new AtomicInteger(0);

    private ConcurrentMap<String, UserModal > inMemoryStore = new ConcurrentHashMap<> ();

    public UserManager(){
        UserModal userModal = new UserModal ();
        userModal.setId (getNextId ());
        userModal.setFirstName ("Jon");
        userModal.setLastName ("Mike");
        userModal.setDob ("23-01-1990");
        userModal.setLocation ("85032");
        userModal.setCountry ("USA");
        inMemoryStore.put (userModal.getId (), userModal);
    }

    private String getNextId() {
        String date = LocalDate.now().format(formatter);
        return String.format("%04d-%s", userIdGenerator.incrementAndGet(), date);
    }

    public UserModal getId(String id){
        return inMemoryStore.get (id);
    }

    public List<UserModal> getAllUserDetails(){
        List<UserModal> users = new ArrayList<> (  );
        users.addAll (inMemoryStore.values ());
        return users;
    }

}
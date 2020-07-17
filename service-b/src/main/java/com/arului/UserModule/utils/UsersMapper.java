package com.arului.UserModule.utils;

import com.arului.UserModule.modal.UserModal;

import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.json.JsonString;
import javax.json.Json;
import java.io.InputStream;

public class UsersMapper {

    public static JsonObject map( UserModal userModal) {
        JsonObjectBuilder builder = Json.createObjectBuilder();
        addValue(builder, "id", userModal.getId());
        addValue(builder, "isbn", userModal.getFirstName ());
        addValue(builder, "name", userModal.getLastName ());
        addValue(builder, "author", userModal.getDob ());
        addValue(builder, "pages", userModal.getLocation ());
        addValue(builder, "pages", userModal.getCountry ());
        return builder.build();
    }

    private static void addValue ( JsonObjectBuilder builder, String id, String id1 ) {
        if (id1 != null) {
            builder.add(id, id1.toString());
        } else {
            builder.addNull(id);
        }
    }

    private static String getStringFromJson(String key, JsonObject json) {
        String returnedString = null;
        if (json.containsKey(key)) {
            JsonString value = json.getJsonString(key);
            if (value != null) {
                returnedString = value.getString();
            }
        }
        return returnedString;
    }

    public static UserModal map( InputStream is) {
        try(JsonReader jsonReader = Json.createReader(is)) {
            JsonObject jsonObject = jsonReader.readObject();
            UserModal userModal = new UserModal();
            userModal.setId(getStringFromJson("id", jsonObject));
            userModal.setFirstName (getStringFromJson("name", jsonObject));
            userModal.setLastName (getStringFromJson("author", jsonObject));
            userModal.setDob (getStringFromJson("pages",jsonObject));
            userModal.setLocation(getStringFromJson("pages",jsonObject));
            userModal.setCountry(getStringFromJson("pages",jsonObject));

            return userModal;
        }
    }
}

package com.arului.UserModule.providers;

import com.arului.UserModule.modal.UserModal;
import com.arului.UserModule.utils.UsersMapper;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonWriter;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

@Provider
@Produces (MediaType.APPLICATION_JSON)
public class UsersListMessageBodyWriter implements MessageBodyWriter< UserModal > {
    @Override
    public boolean isWriteable ( Class aClass, Type type, Annotation[] annotations, MediaType mediaType ) {
        return type.equals (UserModal.class);
    }

    @Override
    public long getSize ( UserModal userModal, Class< ? > type, Type genericType, Annotation[] annotations, MediaType mediaType ) {
        return 0;
    }

    @Override
    public void writeTo ( UserModal userModal, Class< ? > aClass, Type type, Annotation[] annotations, MediaType mediaType, MultivaluedMap< String, Object > multivaluedMap, OutputStream outputStream ) throws IOException, WebApplicationException {
        try (JsonWriter jsonWriter = Json.createWriter (outputStream)) {
            JsonObject jsonObject = UsersMapper.map (userModal);
            jsonWriter.writeObject (jsonObject);
        } catch (Exception e) {
            System.out.println ("Error:" + e);
        }
    }
}
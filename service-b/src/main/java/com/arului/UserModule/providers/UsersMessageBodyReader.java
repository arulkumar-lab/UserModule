package com.arului.UserModule.providers;

import com.arului.UserModule.modal.UserModal;
import com.arului.UserModule.utils.UsersMapper;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
public class UsersMessageBodyReader implements MessageBodyReader< UserModal > {
    @Override
    public boolean isReadable ( Class aClass, Type type, Annotation[] annotations, MediaType mediaType ) {
        return type.equals (UserModal.class);
    }

    @Override
    public UserModal readFrom ( Class aClass, Type type, Annotation[] annotations, MediaType mediaType, MultivaluedMap multivaluedMap, InputStream inputStream ) throws IOException, WebApplicationException {
        return UsersMapper.map(inputStream);
    }
}

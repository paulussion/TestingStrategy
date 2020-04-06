package com.foo.domain;

import com.foo.gateway.usecase.AnotherThingDoer;
import com.foo.gateway.usecase.SomethingDoer;
import org.springframework.stereotype.Service;

import java.util.Base64;

// core domain business code
@Service
public class FooService {

    // functional interfaces
    private final SomethingDoer somethingDoer;
    private final AnotherThingDoer anotherThingDoer;

    public FooService(SomethingDoer somethingDoer, AnotherThingDoer anotherThingDoer) {
        this.somethingDoer = somethingDoer;
        this.anotherThingDoer = anotherThingDoer;
    }

    public Boolean someBusinessFunction(String input) {
        Integer integer = somethingDoer.doSomethingWithAPartner(input);
        String key = integer.toString();
        String value = Base64.getEncoder().encodeToString(key.getBytes());
        Boolean result = anotherThingDoer.doAnotherThingWithADatabase(key, value);
        return result;
    }
}

package com.foo.gateway;

import com.foo.gateway.usecase.AnotherThingDoer;
import com.foo.gateway.usecase.SomethingDoer;
import org.springframework.stereotype.Component;

@Component
public class SomethingGateway implements SomethingDoer, AnotherThingDoer {

    @Override
    public Boolean doAnotherThingWithADatabase(String key, String value) {
        // not implemented
        return key.compareTo(value) > 0;
    }

    @Override
    public Integer doSomethingWithAPartner(String randomString) {
        // not implemented
        return randomString.hashCode();
    }
}

package com.foo.domain;

import com.foo.gateway.usecase.AnotherThingDoer;
import com.foo.gateway.usecase.SomethingDoer;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FooServiceTest {

    @Test
    public void someBusinessFunction_should_return_true() {
        //given
        SomethingDoer somethingDoerMock = randomString -> 1;
        AnotherThingDoer anotherThingDoerMock = (key, value) -> true;
        FooService fooService = new FooService(somethingDoerMock, anotherThingDoerMock);
        //when
        Boolean result = fooService.someBusinessFunction("input");
        //then
        assertThat(result).isEqualTo(true);
    }
}

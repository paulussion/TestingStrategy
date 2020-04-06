package com.foo.facade;

import com.foo.controller.dtos.FooRequestDto;
import com.foo.controller.dtos.FooResponseDto;
import com.foo.domain.FooService;
import org.springframework.stereotype.Component;

@Component
public class FooFacade {

    private final FooService fooService;

    public FooFacade(FooService fooService) {
        this.fooService = fooService;
    }

    public FooResponseDto doSomething(FooRequestDto fooRequest) {
        //facade does orchestrate business layers calls and manage inputs/output from/for controller
        Boolean businessResult = fooService.someBusinessFunction(fooRequest.input);
        return new FooResponseDto(businessResult);
    }
}

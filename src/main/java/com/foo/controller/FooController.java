package com.foo.controller;

import com.foo.controller.dtos.FooRequestDto;
import com.foo.controller.dtos.FooResponseDto;
import com.foo.facade.FooFacade;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/foo")
public class FooController {

    private final FooFacade fooFacade;

    public FooController(FooFacade fooFacade) {
        this.fooFacade = fooFacade;
    }

    @GetMapping(path = "/do-something-endpoint")
    public FooResponseDto doSomethingEndpoint(FooRequestDto fooRequest) {
        return fooFacade.doSomething(fooRequest);
    }
}

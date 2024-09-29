package hu.cscs.nhw.timeout.poc.endpoint.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.SneakyThrows;

@RestController
public class TestController {

    @SneakyThrows
    @GetMapping("/test")
    public String test() {

        Thread.sleep(1000);

        return "OK";
    }
}

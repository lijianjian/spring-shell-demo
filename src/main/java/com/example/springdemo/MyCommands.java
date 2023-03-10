package com.example.springdemo;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class MyCommands {

    private final MyService myService;

    public MyCommands(MyService myService) {
        this.myService = myService;
    }

    @ShellMethod(key = "hello-world")
    public String helloWorld(
            @ShellOption(defaultValue = "spring") String arg
    ) {
        return "Helsssstttt" + arg + myService.someRestCall(arg);
    }


}

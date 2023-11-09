package br.com.fischer.ignitespring01.ioc_di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/component")
public class ComponentController {

    @Autowired // Dependency Injection - DI
    Component component;
    @GetMapping("")
    public String callComponent() {
        return component.callComponent();
    }

}

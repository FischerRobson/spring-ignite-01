package br.com.fischer.ignitespring01.ioc_di;

import org.springframework.stereotype.Service;

@Service() // Or @Component
public class Component {

    public String callComponent() {
        return "Calling component";
    }
}

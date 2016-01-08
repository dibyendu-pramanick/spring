package qcom.cas.sample.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("simple")
public class SampleController {

    @RequestMapping("/hello")
    public String helloWorld() {
        return "welcome Dibyendu";
    }
}

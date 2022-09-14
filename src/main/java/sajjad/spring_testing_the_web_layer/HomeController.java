package sajjad.spring_testing_the_web_layer;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {


    /*
    The preceding example does not specify GET versus PUT, POST, and so forth.
    By default @RequestMapping maps all HTTP operations.
    You can use @GetMapping or @RequestMapping(method=GET) to narrow this mapping
    */

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World";
    }

}

package eu.unicredit.jxp.gateway;

import eu.unicredit.jxp.gateway.model.Approvers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controller {

    @GetMapping("/")
    public String readme() {
        return "Hi from jxp utilities";
    }


    @GetMapping("/approval/mails")
    public Approvers mails(@RequestParam(value = "app", defaultValue = "") String app) {
        return new Approvers(app);
    }

    @GetMapping("/approval/userids")
    public Approvers userids (@RequestParam(value = "app", defaultValue = "") String app) {
        return new Approvers(app);
    }
}



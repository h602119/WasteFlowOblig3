package vallestad.henrik.wasteflow.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**

 This class serves as a controller for the homepage of the web application.

 It handles GET requests for the homepage and the booking page.
 */
@Controller
@RequestMapping("${app.url.home}")
public class HomeController {

    /**

     Handles GET requests for the homepage of the web application.
     @return the name of the homepage view
     */
    @GetMapping
    public String goToHomePage() {
        return "home";
    }


}

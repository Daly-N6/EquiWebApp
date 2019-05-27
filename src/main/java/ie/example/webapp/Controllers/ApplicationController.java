package ie.example.webapp.Controllers;
// Import framework dependencies - required to handle the HTTP request and send a response
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.beans.factory.annotation.Autowired; 
import java.util.*; 

import ie.example.webapp.models.Horses; 
import ie.example.webapp.dao.HorsesDao;

// The @ annotation identifies this as a Controller class
@Controller
public class ApplicationController {

    @Autowired
    private HorsesDao horsesData;

    // This method displays the horses page 
    @RequestMapping(value = "/horses", method = RequestMethod.GET) 
    // Uses a Model instance - which will be passed to a view 
    public String horses(Model model){ 
        // Get the horses list from the HorsesDao instance 
        List<Horses> horses = horsesData.findAll();
         model.addAttribute("horses", horses); 
         // Return the view return
         return "horses";
    }
 // This method, index(), serves as the site index - the default page
 // Requests for the root '/' will be handled by this method
 @RequestMapping(value = "/", method = RequestMethod.GET)
 // Send a direct response without a view template
 public String index(
     @RequestParam(name = "name", required = false, defaultValue = "") String name, Model model) 
     {
 // Return some text (this will be the response back to the browser)
 model.addAttribute("name", name);
 return "index";
 }

 // The about page will be accessed using /about from the browser 
 @RequestMapping(value = "/about", method = RequestMethod.GET) 
 public String about() { 
     //Load and return the about view 
     return "about"; 
    }

// The about page will be accessed using /about from the browser 
@RequestMapping(value = "/vaccinations", method = RequestMethod.GET) 
public String vaccinations() { 
    //Load and return the about view 
    return "vaccinations"; 
   }

   // The about page will be accessed using /about from the browser 
 @RequestMapping(value = "/wormers", method = RequestMethod.GET) 
 public String wormers() { 
     //Load and return the about view 
     return "wormers"; 
    }

    // The about page will be accessed using /about from the browser 
 //@RequestMapping(value = "/horses", method = RequestMethod.GET) 
 //public String horses() { 
     //Load and return the about view 
    // return "horses"; 
   // }

    // The about page will be accessed using /about from the browser 
 @RequestMapping(value = "/farrier", method = RequestMethod.GET) 
 public String farrier() { 
     //Load and return the about view 
     return "farrier"; 
    }
  // The about page will be accessed using /about from the browser 
  @RequestMapping(value = "/dentist", method = RequestMethod.GET) 
  public String dentist() { 
      //Load and return the about view 
      return "dentist"; 
     }

}

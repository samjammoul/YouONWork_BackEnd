package com.example.YouOnWork;

import org.springframework.web.bind.annotation.*;


import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/book")
public class GreetingController {

   // private RapoUser rapoUser;
/*
    @Autowired
    public GreetingController(RapoUser rapoUser){
    //    this.rapoUser = rapoUser;
    }

 */
 //  @Autowired
 //  private BookService bookService;



/*
    @GetMapping("/1")
    public List<Book> getname() {

    //    return rapoUser.findAll();
       // return bookService.list();
    }

 */

    @PostMapping("/add23")
    public void getna(@RequestParam  String title, String author , float price ) {
     //   userService.add(new com.example.YouOnWork.API.Controller.Model.User("sam", "sam"));
    }


    @PostMapping("/3")
    public List<User> getna2(String sa) {

        return Arrays.asList(
                new User(sa+"2","s")


        );
    }
    @GetMapping("/addsam")
    public String getna( ) {
        return "hey";
    }

}

// @RequestBody => body

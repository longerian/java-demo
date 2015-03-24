package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by huifeng.hxl on 2015/3/8.
 */
@Controller
@RequestMapping(value = {"/","/index.htm", "index.html"})
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap modelMap) {
        return "index";
    }

}

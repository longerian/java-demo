package com.tutorialspoint;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by huifeng.hxl on 2015/3/8.
 */
@Controller
public class WebStudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("student", "command", new WebStudent());
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb")WebStudent student, ModelMap modelMap) {
        if (student.getName().length() < 5) {
            throw new SpringException("Given name is too short");
        } else {
            modelMap.addAttribute("name", student.getName());
        }
        if (student.getAge() < 10) {
            throw new SpringException("Given age is too low");
        } else {
            modelMap.addAttribute("age", student.getAge());
        }
        modelMap.addAttribute("id", student.getId());
        return "result";
    }

}

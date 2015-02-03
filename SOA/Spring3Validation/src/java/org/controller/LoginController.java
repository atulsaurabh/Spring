/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.command.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author atul.saurabh
 */
@Controller
public class LoginController {
    
        
    
    @RequestMapping(method = RequestMethod.POST)
    public ModelAndView login(HttpServletResponse response,@Valid User user,BindingResult result)
    {
        ModelAndView modelAndView=null;
        try {
            PrintWriter o =response.getWriter();           
            if(result.hasErrors())
            modelAndView=new ModelAndView("index");
            else
                modelAndView=new ModelAndView("success");
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     return modelAndView;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.command;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Required;

/**
 *
 * @author atul.saurabh
 */
public class User 
{
   private String uname;
   private String upass;

   @Required
   @NotBlank/*(message = "Please Enter The User Name")*/
   @NotNull
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Required
    @NotBlank/*(message = "Please Enter The Password")*/
    @NotNull    
    @Size(min = 5,message = "Password must be of five charecter long")
    public String getUpass() {
        return upass;
    }

    public void setUpass(String upass) {
        this.upass = upass;
    }
   
   
}

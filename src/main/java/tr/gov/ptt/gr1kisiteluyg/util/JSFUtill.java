/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.gr1kisiteluyg.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


public class JSFUtill {
    
    public static void mesajEkle(String mesaj)
            
    {
        FacesContext.getCurrentInstance().
                 addMessage(null, new FacesMessage(
           FacesMessage.SEVERITY_INFO, "Giriş başarılı.", "Giriş başarılı."));
        
        FacesContext.getCurrentInstance().getExternalContext()
                    .getFlash().setKeepMessages(true);
        
        
        
    }
    
    
       public static void HataMesajiEkle(String mesaj)
            
    {
        FacesContext.getCurrentInstance().
                 addMessage(null, new FacesMessage(
           FacesMessage.SEVERITY_ERROR, "Kullanıcı adı ya da şifre yanlış!", 
                         "Kullanıcı adı ya da şifre yanlış!"));
        
        FacesContext.getCurrentInstance().getExternalContext()
                    .getFlash().setKeepMessages(true);
        
        
        
    }
    
}

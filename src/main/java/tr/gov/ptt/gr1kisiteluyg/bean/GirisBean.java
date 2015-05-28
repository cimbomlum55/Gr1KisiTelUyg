/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tr.gov.ptt.gr1kisiteluyg.bean;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import tr.gov.ptt.gr1kisiteluyg.entity.Giris;
import tr.gov.ptt.gr1kisiteluyg.service.GirisService;
import tr.gov.ptt.gr1kisiteluyg.util.JSFUtill;

/**
 *
 * @author Administrator
 */
@ManagedBean
@RequestScoped
public class GirisBean {
    
    private Giris giris;
    
    @EJB
    private GirisService girisService;

    public GirisBean() {
          giris = new Giris();
    }

    public Giris getGiris() {
        return giris;
    }

    public void setGiris(Giris giris) {
        this.giris = giris;
    }
    
       public String girisKontrol()
    {
       boolean sonuc = girisService.girisKontrol(giris);
       
        if (sonuc) {
            JSFUtill.mesajEkle("Giris Basarılı");
            
            return "menu.xhtml?faces-redirect=true";
        } else {
            JSFUtill.HataMesajiEkle("Kullanıcı adı ya da şifre hatalı");
            return "giris.xhtml?faces-redirect=true";
        }
    }
    

    
}

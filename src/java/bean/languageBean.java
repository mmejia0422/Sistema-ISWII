/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author Mario
 */
@ManagedBean(name="languageBean")
@SessionScoped
public class languageBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private String localeCode;

	private static Map<String,Object> countries;
	static{
		countries = new LinkedHashMap<String,Object>();
                Locale espanol=new Locale("es_ES");
		countries.put("English", Locale.ENGLISH); //label, value
		countries.put("Español", Locale.SIMPLIFIED_CHINESE);
	}

	public Map<String, Object> getCountriesInMap() {
		return countries;
	}


	public String getLocaleCode() {
		return localeCode;
	}


	public void setLocaleCode(String localeCode) {
		this.localeCode = localeCode;
	}

	//value change event listener
	public void countryLocaleCodeChanged(ValueChangeEvent e){

		String newLocaleValue = e.getNewValue().toString();

		//loop country map to compare the locale code
                for (Map.Entry<String, Object> entry : countries.entrySet()) {

        	   if(entry.getValue().toString().equals(newLocaleValue)){

        		FacesContext.getCurrentInstance()
        			.getViewRoot().setLocale((Locale)entry.getValue());

        	  }
               }
	}
}

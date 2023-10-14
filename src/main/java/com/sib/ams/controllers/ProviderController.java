package com.sib.ams.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sib.ams.entities.Provider;


@RequestMapping("/provider")
@Controller
public class ProviderController {

	
	
	
	@RequestMapping("/list")
	
	public String providerListe(Model m) {
		String provider="SAMSUNG" ;
		
		ArrayList<String> array= new ArrayList<>() ;
		array.add("pc") ;
		array.add("Ordinateur") ;
		array.add("DeLL") ;
		array.add("MAC") ;
		array.add("ASUS") ;
      m.addAttribute("p1", array) ;		
      
     ArrayList< Provider>  listes= new ArrayList<>()  ;
     
     listes.add(new Provider("name", "adres", "email")) ;
     listes.add(new Provider("name2", "adres2", "email2")) ;
     listes.add(new Provider("name3", "adres3", "email3")) ;
     
    // m.addAllAttributes("listes",listes) ;
     
     m.addAttribute("listes",listes) ;
     
     
		
		m.addAttribute("pr", provider) ;
		return "provider/listeProvider" ;
	}
	
	@GetMapping("add")
	public String addProviderGet() {
		System.out.println("####entrerrr");
		return "provider/AddProfile" ;
	}
	
	@PostMapping("add")
	@ResponseBody
	public String addProviderPost() {
		System.out.println("###Postr");
		return "PageInsertion" ;
	}
}

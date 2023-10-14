package com.sib.ams.controllers;

import java.util.ArrayList;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sib.ams.entities.Provider;


@RequestMapping("/provider")
@Controller
public class ProviderController {

 static	ArrayList<Provider> listeP=new ArrayList<>();
 static {
	 
	 listeP.add(new Provider("name", "adres", "email")) ;
	 listeP.add(new Provider("name2", "adres2", "email2")) ;
	 listeP.add(new Provider("name3", "adres3", "email3")) ;
	 
 }
	
	
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
     
     m.addAttribute("listes",listeP) ;
     
     
		
		m.addAttribute("pr", provider) ;
		return "provider/listeProvider" ;
	}
	
	@GetMapping("add")
	public String addProviderGet(Model m) {
	System.out.println("kllllllllll");
		
		
		
		m.addAttribute("provider",new Provider()) ;
		System.out.println("####entrerrr");
		return "provider/AddProfile" ;
	}
	
	@PostMapping("add")
   // @ResponseBody
	/*public String addProviderPost(@RequestParam("pname")   String name ,
		                      	  @RequestParam("paddress")   String address ,
		                           @RequestParam("pemail")    String email) {*/
	
	public String addProviderPost( Provider prov ) {
	
		
	    listeP.add(prov);	
		//System.out.println("###Postr"+p.toString());
		//return "PageInsertion" ;
		return "redirect:list" ;
	}
}

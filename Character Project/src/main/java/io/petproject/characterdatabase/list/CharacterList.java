package io.petproject.characterdatabase.list;

import org.springframework.web.bind.annotation.RequestMapping;		//URL Mapping import
import org.springframework.web.bind.annotation.RestController;		//Marks this as controller

@RestController			//Adding this will make this a rest controller--allows URL mapping requests
public class CharacterList {

	@RequestMapping("/characters")	//Ability to call this method when specific URL is called
	public String characterList() {
		
		//System.out.println("Rilayen: Steam-Dancer - Male - Antipath \r\nValkhasio: Steam-Dancer - Male - Celepath");
		//Debugging line: tryingt to figure out why above String wouldn't break with \r\n escape characters 
		
		return  "Rilayen: Steam-Dancer - Male - Antipath<br>"
				+ "Trey: Steam-Dancer - Male - Antipath<br>"
				+ "Valkhasio: Steam-Dancer - Male - Celepath<br>"
				+ "Lachlan: Steam-Dancer - Female - Celepath<br>"
				+ "Quorra: Demon of Promise - Female - Hunter<br>"
				+ "Cammie: Demon of Promise - Female - Hunter<br>"
				+ "Casmir: Demon of Promise - Male - Demon<br>"
				+ "Ceto: Demon of Promise - Female - Demon<br>";
	
	//Literally just a list of characters from books Cody and I have written (either together or separately)
	
		//Discovered that, when using a local host, you need to use HTML/CSS for breaks and whatnot
	}
	
}

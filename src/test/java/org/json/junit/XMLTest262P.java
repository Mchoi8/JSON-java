package org.json.junit;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.function.Function;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONPointer;
import org.json.XML;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class XMLTest262P {

	@Test
	public void taskTwoTest() throws IOException, ParseException {
		
		FileReader filereader = new FileReader("C:\\Users\\Matthew\\Google Drive\\UCI MSWE\\SWE262P\\JSON-java-master\\src\\main\\java\\org\\json\\nutrition.xml");
		
		JSONPointer jsonpointer = new JSONPointer("/nutrition/daily-values");
		
	    JSONObject object = XML.toJSONObject(filereader, jsonpointer);

	    //System.out.println(object);
	    
	    //final result {"carb":{"units":"g","content":300},"sodium":{"units":"mg","content":2400},"fiber":{"units":"g","content":25},"total-fat":{"units":"g","content":65},"protein":{"units":"g","content":50},"cholesterol":{"units":"mg","content":300},"saturated-fat":{"units":"g","content":20}}

	    
	}
	
	
	//Test cases for the second overloaded method
	
	@Test
	public void taskFiveTest() throws IOException {

		FileReader filereader = new FileReader("C:\\Users\\Matthew\\Google Drive\\UCI MSWE\\SWE262P\\JSON-java-master\\src\\main\\java\\org\\json\\hamlet.xml");
		
		JSONPointer jsonpointer = new JSONPointer("/PLAY");
		
		JSONObject obj = new JSONObject();
		obj.put("testing1", "tester");
		
	    JSONObject newobject = XML.toJSONObject(filereader, jsonpointer, obj);

	   	//System.out.println(newobject);
	    // final result {"PLAY":{"testing1":"tester"}}
		
	}
	
	
	@Test
	public void mileston3Test1() throws IOException, ParseException {

		FileReader filereader1 = new FileReader("C:\\Users\\Matthew\\Google Drive\\UCI MSWE\\SWE262P\\JSON-java-master\\src\\main\\java\\org\\json\\nutrition.xml");
				
	    JSONObject newobject1 = XML.toJSONObject(filereader1, XML.keyTransform);

	    //{"swe262_daily-values":{"carb":{"units":"g","content":300},"sodium":{"units":"mg","content":2400},"fiber":{"units":"g","content":25},"total-fat":{"units":"g","content":65},"protein":{"units":"g","content":50},"cholesterol":{"units":"mg","content":300},"saturated-fat":{"units":"g","content":20}},"swe262_saturated-fat":{"units":"g","content":20},"swe262_cholesterol":{"units":"mg","content":300},"swe262_carb":{"units":"g","content":300},"swe262_total-fat":{"units":"g","content":65},"swe262_nutrition":{"daily-values":{"carb":{"units":"g","content":300},"sodium":{"units":"mg","content":2400},"fiber":{"units":"g","content":25},"total-fat":{"units":"g","content":65},"protein":{"units":"g","content":50},"cholesterol":{"units":"mg","content":300},"saturated-fat":{"units":"g","content":20}},"food":[{"carb":2,"minerals":{"ca":0,"fe":0},"fiber":0,"calories":{"total":110,"fat":100},"saturated-fat":3,"serving":{"units":"g","content":29},"sodium":210,"vitamins":{"a":0,"c":0},"total-fat":11,"protein":1,"name":"Avocado Dip","mfr":"Sunnydale","cholesterol":5},{"carb":54,"minerals":{"ca":8,"fe":20},"fiber":3,"calories":{"total":300,"fat":35},"saturated-fat":1,"serving":{"units":"g","content":104},"sodium":510,"vitamins":{"a":0,"c":0},"total-fat":4,"protein":11,"name":"Bagels, New York Style","mfr":"Thompson","cholesterol":0},{"carb":8,"minerals":{"ca":1,"fe":6},"fiber":0,"calories":{"total":370,"fat":290},"saturated-fat":15,"serving":{"units":"g","content":115},"sodium":1100,"vitamins":{"a":0,"c":2},"total-fat":32,"protein":13,"name":"Beef Frankfurter, Quarter Pound","mfr":"Armitage","cholesterol":65},{"carb":42,"minerals":{"ca":2,"fe":10},"fiber":2,"calories":{"total":410,"fat":200},"saturated-fat":9,"serving":{"units":"g","content":198},"sodium":810,"vitamins":{"a":20,"c":2},"total-fat":22,"protein":10,"name":"Chicken Pot Pie","mfr":"Lakeson","cholesterol":25},{"carb":5,"minerals":{"ca":4,"fe":2},"fiber":2,"calories":{"total":20,"fat":0},"saturated-fat":0,"serving":{"units":" cup","content":1.5},"sodium":15,"vitamins":{"a":30,"c":45},"total-fat":0,"protein":1,"name":"Cole Slaw","mfr":"Fresh Quick","cholesterol":0},{"carb":1,"minerals":{"ca":2,"fe":4},"fiber":0,"calories":{"total":70,"fat":40},"saturated-fat":1.5,"serving":{"units":"g","content":50},"sodium":65,"vitamins":{"a":6,"c":0},"total-fat":4.5,"protein":6,"name":"Eggs","mfr":"Goodpath","cholesterol":215},{"carb":23,"minerals":{"ca":6,"fe":4},"fiber":2,"calories":{"total":200,"fat":90},"saturated-fat":2,"serving":{"units":"tbsp","content":2},"sodium":20,"vitamins":{"a":0,"c":0},"total-fat":10,"protein":3,"name":"Hazelnut Spread","mfr":"Ferreira","cholesterol":0},{"carb":15,"minerals":{"ca":0,"fe":0},"fiber":1,"calories":{"total":150,"fat":90},"saturated-fat":3,"serving":{"units":"g","content":28},"sodium":180,"vitamins":{"a":0,"c":10},"total-fat":10,"protein":2,"name":"Potato Chips","mfr":"Lees","cholesterol":0},{"carb":10,"minerals":{"ca":0,"fe":0},"fiber":4,"calories":{"total":160,"fat":45},"saturated-fat":0,"serving":{"units":"g","content":96},"sodium":420,"vitamins":{"a":0,"c":0},"total-fat":5,"protein":9,"name":"Soy Patties, Grilled","mfr":"Gardenproducts","cholesterol":0},{"carb":16,"minerals":{"ca":0,"fe":0},"fiber":1,"calories":{"total":220,"fat":170},"saturated-fat":14,"serving":{"units":"g","content":39},"sodium":10,"vitamins":{"a":0,"c":0},"total-fat":19,"protein":1,"name":"Truffles, Dark Chocolate","mfr":"Lyndon's","cholesterol":25}]},"swe262_protein":{"units":"g","content":50},"swe262_sodium":{"units":"mg","content":2400},"swe262_fiber":{"units":"g","content":25}}
	   	System.out.println("nutrition result " + newobject1);
	   	

	}
	
	@Test
	public void mileston3Test2() throws IOException, ParseException {
		FileReader filereader1 = new FileReader("C:\\Users\\Matthew\\Google Drive\\UCI MSWE\\SWE262P\\JSON-java-master\\src\\main\\java\\org\\json\\hamlet.xml");
								
	    JSONObject newobject1 = XML.toJSONObject(filereader1, XML.keyTransform);
        
	   	System.out.println("hamlet result " + newobject1);
	}
	
	
	@Test
	public void mileston3Test3() throws IOException, ParseException {
		FileReader filereader1 = new FileReader("C:\\Users\\Matthew\\Google Drive\\UCI MSWE\\SWE262P\\JSON-java-master\\src\\main\\java\\org\\json\\books.xml");
								
	    JSONObject newobject1 = XML.toJSONObject(filereader1, XML.keyTransform);
        
	   	System.out.println("books result " + newobject1);
	}
	
	


}

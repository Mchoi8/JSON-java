package org.json.junit;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONPointer;
import org.json.XML;
import org.json.simple.parser.ParseException;
import org.junit.Test;

public class XMLTest262P {

	@Test
	public void taskTwoTest() throws IOException, ParseException {
		
		FileReader filereader = new FileReader("C:\\Users\\Matthew\\Google Drive\\UCI MSWE\\SWE262P\\JSON-java-master\\src\\main\\java\\org\\json\\nutrition.xml");
		
		JSONPointer jsonpointer = new JSONPointer("/nutrition/daily-values");
		
	    JSONObject object = XML.toJSONObject(filereader, jsonpointer);

	    System.out.println(object);
	    
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

	   	System.out.println(newobject);
		
	    // final result {"PLAY":{"testing1":"tester"}}

		
	}

}

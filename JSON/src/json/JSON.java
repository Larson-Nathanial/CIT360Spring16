/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package json;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author nathanlarson
 */
public class JSON {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JSONObject obj = new JSONObject();

        obj.put("name", "foo");
        obj.put("num", new Integer(100));
        obj.put("balance", new Double(1000.21));
        obj.put("is_vip", new Boolean(true));

        System.out.print(obj);
        
        decode d = new decode();
        d.decodeExample();
    }
    
    
    
}

class decode {
    public void decodeExample() {
        
        JSONParser parser = new JSONParser();
      String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
		
      try{
         Object obj = parser.parse(s);
         JSONArray array = (JSONArray)obj;
			
         System.out.println("The 2nd element of array");
         System.out.println(array.get(1));
         System.out.println();

         JSONObject obj2 = (JSONObject)array.get(1);
         System.out.println("Field \"1\"");
         System.out.println(obj2.get("1"));    

         s = "{}";
         obj = parser.parse(s);
         System.out.println(obj);

         s = "[5,]";
         obj = parser.parse(s);
         System.out.println(obj);

         s = "[5,,2]";
         obj = parser.parse(s);
         System.out.println(obj);
      }catch(ParseException pe){
		
         System.out.println("position: " + pe.getPosition());
         System.out.println(pe);
      }
        
    }
}

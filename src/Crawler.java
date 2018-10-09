import java.io.IOException;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;

public class Crawler
{
	int httpRequestCounter = 0;
	int goodHttpRequestCounter = 0;
	int badHttpRequestCounter = 0;
	ArrayList<String> linksFound = new ArrayList<String>();
	
	// Begins the testing of links and prints the final outcomes
    public int[] Crawl(String startingUrl)
    {
    	int[] statistics = new int[3];
    	if (startingUrl == ""){
    		return statistics;
    	}
        linksFound.add(startingUrl);
    	for (int i = 0; i < linksFound.size(); i++) {
    		urlTest(linksFound.get(i));
    	}
    	
		statistics = new int[] {httpRequestCounter, goodHttpRequestCounter, badHttpRequestCounter};
		
		// Resets crawler so it can be reused again
		httpRequestCounter = 0;
		goodHttpRequestCounter = 0;
		badHttpRequestCounter = 0;
		linksFound.clear();
		
		return statistics;
    }
    
    // Checks given url and adds found links to master link list
    // Note: current iteration only covers cases where the link
    // is to a JSON page whose links are in a link section
    private void urlTest(String currentUrl){
    	Response response = null;
    	try{
			response = Jsoup.connect(currentUrl).followRedirects(false).execute();
			goodHttpRequestCounter++;
			
// To Do:
// 		Make the following code more modular so that it can handle situations 
//		where the page is not a JSON object with a field called "links"
//---------------------------------------------------------------------------
			// Convert page to JSON object and parse for the links
            JSONObject root = new JSONObject(response.body());
            JSONArray links = root.getJSONArray("links");
            
            // Add all links on JSON page to master list of links (linksFound)
            for (int i = 0; i < links.length(); i++) {
				if (!linksFound.contains(links.getString(i))){
					linksFound.add(links.getString(i));
				}
			}	
//---------------------------------------------------------------------------
		}catch(IOException ioe){
			badHttpRequestCounter++;
		} catch (JSONException e) {
			// Not a JSON page and contents cannot be converted
		}
		httpRequestCounter++;
    }
}
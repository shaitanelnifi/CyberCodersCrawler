public class Main
{
	public static void main(String[] args)
    {
    	Crawler bug = new Crawler();
    	int[] results = bug.Crawl("https://httpstat.us/100");
    	
    	if (results[0] == 0) System.out.println("No starting url given");
    	else{
	    	System.out.println("End Results:\n");
	        System.out.println("Unique HTTP Requests: " + results[0]);
			System.out.println("Successful Requests: " + results[1]);
			System.out.println("Failed Requests: " + results[2]);
    	}
    }
}
import static org.junit.Assert.*;

import org.junit.Test;

public class CrawlerUnitTests {
	Crawler bug = new Crawler();

	@Test
	public void testCrawlWithDefault() {
		int[] result = bug.Crawl("https://raw.githubusercontent.com/OnAssignment/compass-interview/master/data.json");
		assertTrue(result[0] == 15);
		assertTrue(result[1] == 11);
		assertTrue(result[2] == 4);
	}
	
	@Test
	public void testCrawlWithNothing() {
		int[] result = bug.Crawl("");
		assertTrue(result[0] == 0);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 0);
	}
	
	
	// Needs reworking once program is built to handle non json pages
	@Test
	public void testCrawlWithNonJsonPage() {
		int[] result = bug.Crawl("https://www.google.com");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
		
		result = bug.Crawl("https://httpbin.org/links/7");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithStatusCode100() {
		int[] result = bug.Crawl("https://httpbin.org/status/100");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithStatusCode200() {
		int[] result = bug.Crawl("https://httpbin.org/status/200");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithStatusCode201() {
		int[] result = bug.Crawl("https://httpbin.org/status/201");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithStatusCode204() {
		int[] result = bug.Crawl("https://httpbin.org/status/204");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithStatusCode206() {
		int[] result = bug.Crawl("https://httpbin.org/status/206");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithStatusCode301() {
		int[] result = bug.Crawl("https://httpbin.org/status/301");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithStatusCode302() {
		int[] result = bug.Crawl("https://httpbin.org/status/302");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithStatusCode303() {
		int[] result = bug.Crawl("https://httpbin.org/status/303");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithStatusCode304() {
		int[] result = bug.Crawl("https://httpbin.org/status/304");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithStatusCode307() {
		int[] result = bug.Crawl("https://httpbin.org/status/307");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithStatusCode308() {
		int[] result = bug.Crawl("https://httpbin.org/status/308");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithStatusCode401() {
		int[] result = bug.Crawl("https://httpbin.org/status/401");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithStatusCode403() {
		int[] result = bug.Crawl("https://httpbin.org/status/403");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithStatusCode404() {
		int[] result = bug.Crawl("https://httpbin.org/status/404");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithStatusCode406() {
		int[] result = bug.Crawl("https://httpbin.org/status/406");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithStatusCode407() {
		int[] result = bug.Crawl("https://httpbin.org/status/407");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithStatusCode410() {
		int[] result = bug.Crawl("https://httpbin.org/status/410");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithStatusCode412() {
		int[] result = bug.Crawl("https://httpbin.org/status/412");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithStatusCode416() {
		int[] result = bug.Crawl("https://httpbin.org/status/416");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithStatusCode451() {
		int[] result = bug.Crawl("https://httpbin.org/status/451");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithStatusCode500() {
		int[] result = bug.Crawl("https://httpbin.org/status/500");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithStatusCode501() {
		int[] result = bug.Crawl("https://httpbin.org/status/501");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithStatusCode502() {
		int[] result = bug.Crawl("https://httpbin.org/status/502");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithStatusCode503() {
		int[] result = bug.Crawl("https://httpbin.org/status/503");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithStatusCode504() {
		int[] result = bug.Crawl("https://httpbin.org/status/504");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}

}

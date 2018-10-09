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
	public void testCrawlWithCode100() {
		int[] result = bug.Crawl("https://httpbin.org/status/100");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithCode200() {
		int[] result = bug.Crawl("https://httpbin.org/status/200");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithCode201() {
		int[] result = bug.Crawl("https://httpbin.org/status/201");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithCode204() {
		int[] result = bug.Crawl("https://httpbin.org/status/204");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithCode206() {
		int[] result = bug.Crawl("https://httpbin.org/status/206");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithCode301() {
		int[] result = bug.Crawl("https://httpbin.org/status/301");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithCode302() {
		int[] result = bug.Crawl("https://httpbin.org/status/302");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithCode303() {
		int[] result = bug.Crawl("https://httpbin.org/status/303");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithCode304() {
		int[] result = bug.Crawl("https://httpbin.org/status/304");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithCode307() {
		int[] result = bug.Crawl("https://httpbin.org/status/307");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithCode308() {
		int[] result = bug.Crawl("https://httpbin.org/status/308");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 1);
		assertTrue(result[2] == 0);
	}
	
	@Test
	public void testCrawlWithCode401() {
		int[] result = bug.Crawl("https://httpbin.org/status/401");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithCode403() {
		int[] result = bug.Crawl("https://httpbin.org/status/403");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithCode404() {
		int[] result = bug.Crawl("https://httpbin.org/status/404");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithCode406() {
		int[] result = bug.Crawl("https://httpbin.org/status/406");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithCode407() {
		int[] result = bug.Crawl("https://httpbin.org/status/407");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithCode410() {
		int[] result = bug.Crawl("https://httpbin.org/status/410");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithCode412() {
		int[] result = bug.Crawl("https://httpbin.org/status/412");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithCode416() {
		int[] result = bug.Crawl("https://httpbin.org/status/416");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithCode451() {
		int[] result = bug.Crawl("https://httpbin.org/status/451");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithCode500() {
		int[] result = bug.Crawl("https://httpbin.org/status/500");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithCode501() {
		int[] result = bug.Crawl("https://httpbin.org/status/501");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithCode502() {
		int[] result = bug.Crawl("https://httpbin.org/status/502");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithCode503() {
		int[] result = bug.Crawl("https://httpbin.org/status/503");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}
	
	@Test
	public void testCrawlWithCode504() {
		int[] result = bug.Crawl("https://httpbin.org/status/504");
		assertTrue(result[0] == 1);
		assertTrue(result[1] == 0);
		assertTrue(result[2] == 1);
	}

}

/**
 * Copyright (C) 2015 BITPlan GmbH
 *
 * Pater-Delp-Str. 1
 * D-47877 Willich-Schiefbahn
 *
 * http://www.bitplan.com
 * 
 */
package com.bitplan.mediawiki.japi;

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.junit.Test;

import com.bitplan.mediawiki.japi.ExampleWiki.ExamplePage;
import com.bitplan.mediawiki.japi.Mediawiki.TokenResult;
import com.bitplan.mediawiki.japi.api.Edit;

/**
 * test https://www.mediawiki.org/wiki/API:Upload
 * 
 * @author wf
 *
 */
public class TestAPI_Upload extends APITestbase {

	/**
	 * test uploading a file
	 * 
	 * @throws Exception
	 */
	@Test
	public void TestUpload() throws Exception {
    ExampleWiki lwiki=ewm.get("mediawiki-japi-test1_24");
    lwiki.login();
    fail("not implemented yet");
    // lwiki.upload(file, filename, contents, reason);
	  
	}
	
	// FIXME need TestEditNoLogin - should throw an Exception with Message Action 'edit' is not allowed for
	// current user
	
	/**
	 * test copying a page from a source Wiki to a target Wiki
	 * @throws Exception
	 */
	@Test
	public void TestCopy() throws Exception {
		ExampleWiki sourceWiki = ewm.get("sourceWiki");
		// sourceWiki.setDebug(true);
		ExampleWiki targetWiki = ewm.get("targetWiki");
		targetWiki.login();
		// targetWiki.setDebug(true);
		List<ExamplePage> examplePages = sourceWiki.getExamplePages("testCopy");
		// List<String> titles=sourceWiki.getTitleList(examplePages);
		for (ExamplePage examplePage:examplePages) {
			String summary="created/edited by TestAPI_Edit at "+sourceWiki.wiki.getIsoTimeStamp();
			String sourceContent=sourceWiki.wiki.getPageContent(examplePage.getTitle());
			// FIXME add to interface
			sourceWiki.getMediaWikiJapi().copyToWiki(targetWiki.wiki,examplePage.getTitle(), summary);
			String targetContent=targetWiki.wiki.getPageContent(examplePage.getTitle());
			assertEquals(sourceContent,targetContent);
		}
	}
	
}
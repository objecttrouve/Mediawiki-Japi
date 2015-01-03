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

import org.junit.Test;

import com.bitplan.mediawiki.japi.api.Api;
import com.bitplan.mediawiki.japi.api.Login;
import com.bitplan.mediawiki.japi.user.WikiUser;

/**
 * Test http://www.mediawiki.org/wiki/API:Login
 * 
 * @author wf
 *
 */
public class TestAPI_Login extends TestAPI {

	/**
	 * test secret access to user data
	 * 
	 * @throws Exception
	 */
	@Test
	public void testGetUser() throws Exception {
		WikiUser wuser = wiki.getWikiUser();
		check("email",wuser.getEmail());
		assertNotNull(wuser.getPassword());
	}

	/**
	 * http://www.mediawiki.org/wiki/API:Login
	 * 
	 * @author wf
	 *
	 */
	@Test
	public void testLoginToken() throws Exception {
		for (ExampleWiki lwiki : wikis) {
			WikiUser wuser = lwiki.getWikiUser();
			// do not keep uncommented - password will be visible in log
			// lwiki.setDebug(true);
			Api api = lwiki
					.getActionResult("login", "&lgname=" + wuser.getUsername());
			Login login = api.getLogin();
			assertNotNull(login);
			assertEquals("NeedToken", login.getResult());
			assertNotNull(login.getToken());
			assertNotNull(login.getSessionid());
		}
	}

	/**
	 * test Login and logout see <a
	 * href='http://www.mediawiki.org/wiki/API:Login'>API:Login</a>
	 * 
	 * @throws Exception
	 */
	@Test
	public void testLogin() throws Exception {
		for (ExampleWiki lwiki : wikis) {
			WikiUser wuser = lwiki.getWikiUser();
			if (wuser==null) {
				fail(WikiUser.help(lwiki.wikiId,lwiki.siteurl));
			}
			// avoid uncommenting - will show password information ...
			// lwiki.debug = true;
			Login login = lwiki.login(wuser.getUsername(), wuser.getPassword());
			assertNotNull(login.getLguserid());
			assertEquals(wuser.getUsername(), login.getLgusername());
			assertNotNull(login.getLgtoken());
			// make sure logout also works
			lwiki.logout();
			// FIXME - test effect of logout
		}
	}

	@Test
	public void testLoginNotExists() throws Exception {
		for (ExampleWiki lwiki : wikis) {
			Login login = lwiki.login("someUserThatDoesNotExist", "somePassword");
			assertEquals("NotExists", login.getResult());
		}
	}

}

package org.cdp.mail.service;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Mykhaylo_Hrytsiv 3/25/2016.
 */
public class MailServiceAppTest {

    @Test
    public void testApp() {
        final String myTest = "myTest";
        final MailServiceApp mailServiceApp = new MailServiceApp(myTest);
        Assert.assertEquals(myTest, mailServiceApp.getTest());
    }
}

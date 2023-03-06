package org.swt.account.management;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.swt.account.management.dto.MockHttpServletRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author Triệu
 */
public class SessionTest {

    //Test case 1
    //Add an attribute to session
    @Test
    public void testSession() {
        HttpServletRequest request = new MockHttpServletRequest() {};
        HttpSession session = request.getSession();
        session.setAttribute("username", "testuser");
        String username = (String) session.getAttribute("username");
        Assert.assertEquals(username, "testuser");
    }
    
    //Test case 2
    //Test invalidate session with time out session time
    @Test
    public void testSessionTimeout() throws InterruptedException {
        HttpServletRequest request = new MockHttpServletRequest();
        HttpSession session = request.getSession();
        session.setAttribute("username", "testuser");
        int sessionTime=3500;
        Thread.sleep(sessionTime);
        if (sessionTime>session.getMaxInactiveInterval()*1000) {
            session.invalidate();
        }
        String username = (String) session.getAttribute("username");
        Assert.assertNull(username);
    }
}

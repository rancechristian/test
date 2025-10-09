package com.jenard.challenge;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.servlet.http.*;
import java.io.*;

public class HelloServletTest {
    @Test
    public void testServletResponse() throws Exception {
        HelloServlet servlet = new HelloServlet();
        HttpServletRequest request = org.mockito.Mockito.mock(HttpServletRequest.class);
        HttpServletResponse response = org.mockito.Mockito.mock(HttpServletResponse.class);
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        org.mockito.Mockito.when(response.getWriter()).thenReturn(writer);
        servlet.doGet(request, response);
        writer.flush();
        String output = stringWriter.toString();
        assertTrue(output.contains("Jenard - Rance Maven challenge 2"));
    }
}

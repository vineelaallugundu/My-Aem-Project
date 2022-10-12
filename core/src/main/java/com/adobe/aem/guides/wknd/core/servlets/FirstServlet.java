package com.adobe.aem.guides.wknd.core.servlets;

import com.adobe.aem.guides.wknd.core.models.FirstService;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.Servlet;

@Component(service = Servlet.class, property = {
        "sling.servlet.paths" + "=" + "/bin/first",
        "sling.servlet.methods" + "=" + HttpConstants.METHOD_GET})
public class FirstServlet extends SlingSafeMethodsServlet {

        @Reference
        FirstService service;

        private static final Logger log = LoggerFactory.getLogger(FirstServlet.class);

        @Override
        protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) {
            log.error("im inside first servlet");
            log.error("Is this a publish mode" + service.isPublishMode());
            log.error("bin first execute successful");
        }
}

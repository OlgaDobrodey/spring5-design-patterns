/**
 *
 */
package main.com.itrex.bankapp.web;

import main.com.itrex.bankapp.config.AppConfig;
import main.com.itrex.bankapp.web.mvc.SpringMvcConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Dinesh.Rajput
 * like as web.xml
 * AbstractAnnotationConfigDispatcherServletInitializer - internally configured DispatcherServlet
 */
public class SpringApplicationInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //ApplicationContext
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{AppConfig.class};
    }

    //WebApplicationContext
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{SpringMvcConfig.class};
    }

    //This method responsible for URL pattern as like in web.xml file <url-pattern>/</url-pattern>
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}

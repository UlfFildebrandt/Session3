package arch.datadisplay.ui;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.http.HttpContext;
import org.osgi.service.http.HttpService;

import arch.dataaggregatorinterface.IDataAggregator;

public class RegisterComponent {
	private HttpService httpService = null;
	private DisplayServlet servlet = null;
	private Map<String, IDataAggregator> map = new HashMap<String, IDataAggregator>();
	
    protected void setHttpService(HttpService httpService) {
    	this.httpService = httpService;
    }

    protected void unsetHttpService(HttpService httpService) {
        httpService.unregister("/");
        httpService.unregister("/display");
    }
    
    protected void setServlet(DisplayServlet servlet) {
    	this.servlet = servlet;
    }
    
    protected void unsetServlet(DisplayServlet servlet) {
    }
    
    protected void setAggregatorService(IDataAggregator aggregator) {
    	map.put(aggregator.getType(), aggregator);
    }
    
    protected void unsetAggregatorService(IDataAggregator aggregator) {
    	map.remove(aggregator.getType());
    }
    
    protected void activate(ComponentContext context) {
		servlet.setMap(map);
		servlet.setContext(context.getBundleContext());
    	
		if ( httpService != null ) {
			HttpContext httpcontext = httpService.createDefaultHttpContext();
	        try {
	            httpService.registerServlet("/display", servlet, new Properties(), httpcontext);
	            httpService.registerResources("/", "/html", httpcontext);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }   	
		}
    }
}

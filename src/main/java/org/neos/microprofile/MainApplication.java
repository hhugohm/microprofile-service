package org.neos.microprofile;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
@ApplicationScoped
@ApplicationPath("/")
public class MainApplication extends Application {

}

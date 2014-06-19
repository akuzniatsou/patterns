package org.java.design.patterns.builder.example02;

import org.java.design.patterns.domain.Route;

/**
 * Created by Mpak on 19.06.14.
 */
public abstract class RouteBuilder {

    protected Route route;

    public Route getRoute() {
        return route;
    }

    public void createRouteBuilder() {
        route = new Route();
    }

    public abstract void buildId();

    public abstract void buildDescription();

    public abstract void buildDirection();

    public abstract void buildTransportType();

}

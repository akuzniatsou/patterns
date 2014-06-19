package org.java.design.patterns.domain;

import org.java.design.patterns.abstractfactory.example01.ConcreteTransformerFactory;
import org.java.design.patterns.builder.example02.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Mpak on 20.06.14.
 */
public class Dispatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteTransformerFactory.class);
    private RouteBuilder routeBuilder;

    public Dispatcher(RouteBuilder routeBuilder) {
        this.routeBuilder = routeBuilder;
    }

    public Route getRoute() {
        return routeBuilder.getRoute();
    }

    public void prepareRoute() {
        routeBuilder.createRouteBuilder();
        routeBuilder.buildId();
        routeBuilder.buildDescription();
        routeBuilder.buildDirection();
        routeBuilder.buildTransportType();
        LOGGER.debug("Route has been prepared with {}. {}", routeBuilder.getClass().getSimpleName(), routeBuilder.getRoute());
    }
}

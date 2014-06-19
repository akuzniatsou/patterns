package org.java.design.patterns.abstractfactory.example01;

import org.java.design.patterns.domain.Route;

/**
 * Created by Mpak on 19.06.14.
 */
public class ConcreteRouteTransformer extends RouteTransformer {

    public static final String ID = "ConcreteRouteTransformerId";

    @Override
    public Route transform(Route route) {
        System.out.println("Route has been transformed with ConcreteRouteTransformer");
        route.setId(ID);
        return route;
    }
}

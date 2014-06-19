package org.java.design.patterns.abstractfactory.example01;

import org.java.design.patterns.domain.Route;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Mpak on 19.06.14.
 */
public class DefaultRouteTransformer extends RouteTransformer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteTransformerFactory.class);
    public static final String ID = "DefaultRouteTransformerId";

    @Override
    public Route transform(Route route) {
        LOGGER.debug("Route has been transformed with DefaultRouteTransformer");
        route.setId(ID);
        return route;
    }
}

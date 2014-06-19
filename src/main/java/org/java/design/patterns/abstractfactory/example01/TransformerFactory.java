package org.java.design.patterns.abstractfactory.example01;

/**
 * Created by Mpak on 19.06.14.
 */
public abstract class TransformerFactory {

    public abstract RouteTransformer getRouteTransformer();
    public abstract TransportTransformer getTransportTransformer();
}

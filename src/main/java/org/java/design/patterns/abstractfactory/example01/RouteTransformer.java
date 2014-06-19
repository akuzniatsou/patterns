package org.java.design.patterns.abstractfactory.example01;

import org.java.design.patterns.domain.Route;

/**
 * Created by Mpak on 19.06.14.
 */
public abstract class RouteTransformer {

    abstract Route transform(Route route);
}

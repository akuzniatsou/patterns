package org.java.design.patterns.abstractfactory.example01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Mpak on 19.06.14.
 */
@Service("transformer.factory")
public class ConcreteTransformerFactory extends TransformerFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteTransformerFactory.class);

    @Override
    public RouteTransformer getRouteTransformer() {
        LOGGER.debug("ConcreteRouteTransformer has been initialized");
        return new ConcreteRouteTransformer();
    }

    @Override
    public TransportTransformer getTransportTransformer() {
        LOGGER.debug("ConcreteTransportTransformer has been initialized");
        return new ConcreteTransportTransformer();
    }
}

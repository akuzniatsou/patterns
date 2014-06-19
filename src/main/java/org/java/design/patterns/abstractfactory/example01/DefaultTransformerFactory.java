package org.java.design.patterns.abstractfactory.example01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by Mpak on 19.06.14.
 */
@Service("default.transformer.factory")
public class DefaultTransformerFactory extends TransformerFactory {

    private static final Logger LOGGER = LoggerFactory.getLogger(DefaultTransformerFactory.class);

    @Override
    public RouteTransformer getRouteTransformer() {
        LOGGER.debug("DefaultRouteTransformer has been initialized");
        return new DefaultRouteTransformer();
    }

    @Override
    public TransportTransformer getTransportTransformer() {
        LOGGER.debug("DefaultTransportTransformer has been initialized");
        return new DefaultTransportTransformer();
    }
}

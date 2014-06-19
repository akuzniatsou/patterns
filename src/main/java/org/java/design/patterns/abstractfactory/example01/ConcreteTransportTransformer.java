package org.java.design.patterns.abstractfactory.example01;

import org.java.design.patterns.domain.Transport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Mpak on 19.06.14.
 */
public class ConcreteTransportTransformer extends TransportTransformer {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteTransformerFactory.class);
    public static final String ID = "ConcreteTransportTransformerId";

    @Override
    public Transport transform(Transport transport) {
        LOGGER.debug("Transport has been transformed with ConcreteTransportTransformer");
        transport.setId(ID);
        return transport;
    }
}

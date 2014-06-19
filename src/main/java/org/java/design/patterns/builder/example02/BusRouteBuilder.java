package org.java.design.patterns.builder.example02;

import org.java.design.patterns.abstractfactory.example01.ConcreteTransformerFactory;
import org.java.design.patterns.domain.Direction;
import org.java.design.patterns.domain.TransportType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * Created by Mpak on 20.06.14.
 */
@Service("bus.builder")
public class BusRouteBuilder extends RouteBuilder {

    private static final Logger LOGGER = LoggerFactory.getLogger(ConcreteTransformerFactory.class);
    public static final String DESCRIPTION = "24. Bus";

    @Override
    public void buildId() {
        route.setId(UUID.randomUUID().toString());
        LOGGER.debug("Id has been set");
    }

    @Override
    public void buildDescription() {
        route.setDescription(DESCRIPTION);
        LOGGER.debug("Description has been set");
    }

    @Override
    public void buildDirection() {
        route.setDirection(Direction.FORWARD);
        LOGGER.debug("Direction has been set");

    }

    @Override
    public void buildTransportType() {
        route.setType(TransportType.BUS);
        LOGGER.debug("TransportType has been set");

    }
}

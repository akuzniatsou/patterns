package org.java.design.patterns.builder.example02;

import org.java.design.patterns.domain.Direction;
import org.java.design.patterns.domain.Dispatcher;
import org.java.design.patterns.domain.Route;
import org.java.design.patterns.domain.TransportType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mpak on 20.06.14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/org/java/design/patterns/example02-context.xml")
public class BuilderTest {

    @Resource(name = "bus.builder")
    private RouteBuilder builder;

    @Test
    public void testBusRouteBuilder() {
        Dispatcher dispatcher = new Dispatcher(builder);
        dispatcher.prepareRoute();
        Route route = dispatcher.getRoute();
        assertEquals(TransportType.BUS, route.getType());
        assertEquals(Direction.FORWARD, route.getDirection());
        String description = (String) ReflectionTestUtils.getField(new BusRouteBuilder(), "DESCRIPTION");
        assertEquals(description, route.getDescription());
    }
}

package org.java.design.patterns.abstractfactory.example01;

import org.java.design.patterns.domain.Route;
import org.java.design.patterns.domain.Transport;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.util.ReflectionTestUtils;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;

/**
 * Created by Mpak on 19.06.14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/org/java/design/patterns/example01-context.xml")
public class TransformerFactoryTest {

    @Resource(name = "transformer.factory")
    private TransformerFactory concreteTransformer;

    @Resource(name = "default.transformer.factory")
    private TransformerFactory defaultTransformer;

    @Test
    public void testGetConcreteRouteTransformer() {
        assertEquals(ConcreteRouteTransformer.class, concreteTransformer.getRouteTransformer().getClass());
    }

    @Test
    public void testGetConcreteTransportTransformer() {
        assertEquals(ConcreteTransportTransformer.class, concreteTransformer.getTransportTransformer().getClass());
    }

    @Test
    public void testGetDefaultRouteTransformer() {
        assertEquals(DefaultRouteTransformer.class, defaultTransformer.getRouteTransformer().getClass());
    }

    @Test
    public void testGetDefaultTransportTransformer() {
        assertEquals(DefaultTransportTransformer.class, defaultTransformer.getTransportTransformer().getClass());
    }

    @Test
    public void testConcreteRouteTransformer() {
        String id = (String) ReflectionTestUtils.getField(new ConcreteRouteTransformer(), "ID");
        RouteTransformer transformer = concreteTransformer.getRouteTransformer();
        assertEquals(id, transformer.transform(new Route()).getId());
    }

    @Test
    public void testConcreteTransportTransformer() {
        String id = (String) ReflectionTestUtils.getField(new ConcreteTransportTransformer(), "ID");
        TransportTransformer transformer = concreteTransformer.getTransportTransformer();
        assertEquals(id, transformer.transform(new Transport()).getId());
    }

    @Test
    public void testDefaultRouteTransformer() {
        String id = (String) ReflectionTestUtils.getField(new DefaultRouteTransformer(), "ID");
        RouteTransformer transformer = defaultTransformer.getRouteTransformer();
        assertEquals(id, transformer.transform(new Route()).getId());
    }

    @Test
    public void testDefaultTransportTransformer() {
        String id = (String) ReflectionTestUtils.getField(new DefaultTransportTransformer(), "ID");
        TransportTransformer transformer = defaultTransformer.getTransportTransformer();
        assertEquals(id, transformer.transform(new Transport()).getId());
    }
}

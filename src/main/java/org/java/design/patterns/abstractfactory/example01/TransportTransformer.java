package org.java.design.patterns.abstractfactory.example01;

import org.java.design.patterns.domain.Transport;

/**
 * Created by Mpak on 19.06.14.
 */
public abstract class TransportTransformer {

    abstract Transport transform(Transport transport);
}

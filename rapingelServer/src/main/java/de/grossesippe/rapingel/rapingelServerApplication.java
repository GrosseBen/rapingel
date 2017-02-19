package de.grossesippe.rapingel;

import de.grossesippe.rapingel.resources.Hello;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class rapingelServerApplication extends Application<rapingelServerConfiguration> {

    public static void main(final String[] args) throws Exception {
        new rapingelServerApplication().run(args);
    }

    @Override
    public String getName() {
        return "rapingelServer";
    }

    @Override
    public void initialize(final Bootstrap<rapingelServerConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final rapingelServerConfiguration configuration,
                    final Environment environment) {
        final Hello resource = new Hello();
        environment.jersey().register(resource);
    }

}

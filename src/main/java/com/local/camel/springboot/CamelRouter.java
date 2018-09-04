package com.local.camel.springboot;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * A simple Camel route that triggers from a timer and calls a bean and prints to system out.
 * <p/>
 * Use <tt>@Component</tt> to make Camel auto detect this route when starting.
 */
@Component
public class CamelRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:hello?period={{timer.period}}").routeId("hello").group("hello-group")
                .transform().method("sampleBean", "saySomething")
                .filter(simple("${body} contains 'foo'"))
                    .to("log:foo")
                .end()
                .to("stream:out");
    }

}
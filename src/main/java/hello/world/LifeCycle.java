package hello.world;

import io.micronaut.context.annotation.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Singleton;

@Context
@Singleton
public class LifeCycle {
    public static final String COPYRIGHT = "Copyright (c) 2020  Pegasystems Inc.";
    private static final Logger LOGGER = LoggerFactory.getLogger("ServiceLifeCycle");
    @PostConstruct
    public void startUp(){
        System.out.println("in start up");
    }
    @PreDestroy
    public void shutDown(){
        System.out.println("in shut down");
        LOGGER.info(" ************ Datagrid application shutting down !! ************ ");
    }
}

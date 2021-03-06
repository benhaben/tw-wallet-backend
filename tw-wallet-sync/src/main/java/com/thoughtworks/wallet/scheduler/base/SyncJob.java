package com.thoughtworks.wallet.scheduler.base;

import org.springframework.stereotype.Component;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * engine will load SyncJobs and execute them
 */
@Retention(RetentionPolicy.RUNTIME)
@Component
public @interface SyncJob {
}

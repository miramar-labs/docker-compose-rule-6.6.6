/*
 * Copyright 2016 Palantir Technologies, Inc. All rights reserved.
 */

package com.palantir.docker.compose.execution;

import com.palantir.docker.compose.DockerComposeRule;
import com.palantir.docker.compose.configuration.ShutdownStrategy;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Send SIGTERM to containers first, allowing them up to 10 seconds to
 * terminate before killing and rm-ing them.
 */
public class GracefulShutdownStrategy implements ShutdownStrategy {

    private static final Logger log = LoggerFactory.getLogger(GracefulShutdownStrategy.class);

    @Override
    public void shutdown(DockerComposeRule rule) throws IOException, InterruptedException {
        log.debug("Killing docker-compose cluster");
        rule.dockerCompose().down();
        rule.dockerCompose().kill();
        rule.dockerCompose().rm();
    }

}

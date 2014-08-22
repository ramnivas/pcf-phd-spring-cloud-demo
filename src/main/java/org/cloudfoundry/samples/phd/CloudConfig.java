package org.cloudfoundry.samples.phd;

import org.springframework.cloud.config.java.CloudScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("cloud")
@CloudScan
public class CloudConfig {

}

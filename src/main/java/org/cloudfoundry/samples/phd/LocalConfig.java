package org.cloudfoundry.samples.phd;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("hadoop-context.xml")
public class LocalConfig {

}

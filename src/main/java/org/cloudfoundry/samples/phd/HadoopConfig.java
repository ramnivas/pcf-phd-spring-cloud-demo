package org.cloudfoundry.samples.phd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.hadoop.fs.FsShell;

@Configuration
public class HadoopConfig {

	@Autowired org.apache.hadoop.conf.Configuration hadoopConfiguration;

	@Bean
	FsShell fsShell() {
		return new FsShell(hadoopConfiguration);
	}

}

package com.tito.karate.api.test.api;

import com.intuit.karate.KarateOptions;
import com.intuit.karate.junit5.Karate;

//@KarateOptions(tags = {"~@ignore"})
public class TitoHelloWorldRestApi {
	
	@Karate.Test
	Karate testSample() {
		return Karate.run("titoHelloWorldRestApi").relativeTo(getClass());
	}
}

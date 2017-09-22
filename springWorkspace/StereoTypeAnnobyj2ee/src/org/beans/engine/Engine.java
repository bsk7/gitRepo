package org.beans.engine;

import org.springframework.stereotype.Component;

@Component  //@Named
public class Engine {
	
	private String engineName;
	
	public void setEngineName(String engineName) {
		this.engineName = engineName;
	}
	
	public String getEngineName() {
		return engineName;
	}
	
	

}

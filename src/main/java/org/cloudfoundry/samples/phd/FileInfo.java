package org.cloudfoundry.samples.phd;

public class FileInfo {
	private String path;
	private String name;

	public FileInfo(String path, String name) {
		this.path = path;
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public String getName() {
		return name;
	}
}

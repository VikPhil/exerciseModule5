package by.practice.basics_of_oop01.main;

public class MyFile {
	private String pathFile;

	public MyFile() {

	}

	public MyFile(String pathFile) {
		this.setPathFile(pathFile);
	}

	public String getPathFile() {
		return pathFile;
	}

	public void setPathFile(String pathFile) {
		this.pathFile = pathFile;
	}

}

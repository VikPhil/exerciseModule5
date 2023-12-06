/*
 * Создать объект класса Текстовый файл, используя классы Файл, Директория. 
 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
 * */
package by.practice.basics_of_oop01.main;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Directory directory = new Directory("src/myDirectory");
		MyFile myFile = new MyFile(directory.getPath() + "/file.txt");
		TextFile txtFile = new TextFile(directory, myFile);
		
		txtFile.createDirectory();
		txtFile.createFile();
		txtFile.renameFile();
		txtFile.addAFile();
		txtFile.outputToConsole();
		txtFile.deleteText();
		txtFile.deleteFile();
		
	}
}
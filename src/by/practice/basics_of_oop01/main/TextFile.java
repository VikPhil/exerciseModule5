package by.practice.basics_of_oop01.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextFile {

	private Directory dir;
	private MyFile file;

	public Scanner sc = new Scanner(System.in);

	public TextFile() {

	}

	public TextFile(Directory dir, MyFile file) {
		this.setDirectory(dir);
		this.setFile(file);
	};

	/*
	 * Создаем папку
	 */
	public void createDirectory() {

		File f = new File(dir.getPath());
		if (!f.exists()) {

			System.out.println("Папка " + (f.mkdir() ? "создана." : "не создана."));

		} else
			System.out.println("Такая папка уже существует.");

	}

	/*
	 * Создаем файл
	 */
	public void createFile() {

		File f = new File(file.getPathFile());

		try {
			boolean success = f.createNewFile();
			System.out.println("Файл " + (success ? "создан" : "уже существует"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Имя по умолчанию - " + f.getName());

	}

	/*
	 * Меняем имя файла
	 */
	public void renameFile() {

		try {
			System.out.print("Введите новое имя файла: ");
			String newName = sc.nextLine();

			// Для изменения имени файла, перемещаем файл с его содержимым по другому пути,
			// меняем путь
			Files.move(Paths.get(file.getPathFile()), Paths.get(dir.getPath() + "/" + newName + ".txt"));
			file.setPathFile(dir.getPath() + "/" + newName + ".txt");

			System.out.println("Файл переименован");
			System.out.println("Новое имя - " + newName + ".txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/*
	 * Добавляем текст
	 */
	public void addAFile() throws IOException {

		FileWriter fw = new FileWriter(file.getPathFile(), true);

		System.out.println("Добавьте текст. Для выхода введите 'ext'");

		String str = null;

		do {
			str = sc.nextLine();
			fw.write(str + "\n");
		} while (!str.equalsIgnoreCase("ext"));

		fw.close();
	}

	/*
	 * Вывести в консоль
	 */
	public void outputToConsole() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file.getPathFile()));
		System.out.println("ТЕКСТ ИЗ ФАЙЛА");
		try {
			while (br.ready()) {
				System.out.println(br.readLine());
			}
		} finally {
			br.close();
		}
	}

	/*
	 * Удаляем текст
	 */
	public void deleteText() {
		try {
			Files.writeString(Paths.get(file.getPathFile()), "");
			System.out.println("Текст удален.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Удаляем файл
	 */
	public void deleteFile() {
		try {
			Files.delete(Paths.get(file.getPathFile()));
			System.out.println("Файл удален.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public MyFile getFile() {
		return file;
	}

	public void setFile(MyFile file) {
		this.file = file;
	}

	public Directory getDirectory() {
		return dir;
	}

	public void setDirectory(Directory dir) {
		this.dir = dir;
	}
}

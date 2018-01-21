package com.luv2code.springdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private Random myRandom = new Random();
	String[] fortunes;
	
	public FileFortuneService() {
		Scanner sc;
		try {
			File file = new File("src/fileFortunes.txt");
			//System.out.println(new File(".").getAbsoluteFile());
			//System.out.println(file.canRead());
			sc = new Scanner(file);
			List<String> lines = new ArrayList<String>();
			while (sc.hasNextLine()) {
			  lines.add(sc.nextLine());
			}

			fortunes = lines.toArray(new String[0]);
			

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//read the fortunes from the file system
	@PostConstruct
	public void readFortunes() {
		System.out.println(">> FileFortuneService: inside of readFortunes():");
		
		for(int i = 0; i < fortunes.length; i++) {
			System.out.println(fortunes[i]);
		}
	}
	
	@Override
	public String getFortune() {
		String fortune = "";
		
		
		//Read a random line from the array
		int index = myRandom.nextInt(fortunes.length);
		fortune = fortunes[index];
		
		return fortune;
	}

}

package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class ScoreDisplay extends PApplet
{
	ArrayList<Note> notes = new ArrayList<Note>();

	String score = "DEFGABcd";
	//String score = "D2E2F2G2A2B2c2d2";
	//String score = "DEF2F2F2EFA2A2B2AFD2E2D2D2D2";
	
	public void settings()
	{
		size(1000, 500);

		// How to convert a character to a number
		char c = '7'; // c holds the character 7 (55)
		int i = c - '0'; // i holds the number 7 (55 - 48) 
		println(i);
	}

	public void loadScore(){

		char a;
		int d;

		for(int i = 0; i < score.length(); i++){

			a = score.charAt(i);

			if(Character.isDigit(score.charAt(i + 1)) == true)
			{
				d = 2;
				i++;
			}else{
				d = 1;
			}

			Note n = new Note(a, d);
			notes.add(n);

		}
	}

	public void printScore()
	{
		String nt;
		
		for (Note n:notes)
		{
			if (n.getDuration() == 1){

				nt = "Quaver";
				
			}else{

				nt = "Crotchet";
			}
			println(n.getNote() + "    " + n.getDuration()+ "    " + nt);						
		}
	}

	public void setup() 
	{
		printScore();
	}

	public void draw()
	{
		background(255);
		stavelines();
	}

	public void stavelines(){

		float range = 75;

		for(float i = 15; i<= range; i = i + 15){

			float line = map (i, 0, 100, 450, 50);
			strokeWeight(3);
			line(100, line, 900, line);
		}
	}

	void drawNotes()
	{
	}
}

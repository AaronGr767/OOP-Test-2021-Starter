package ie.tudublin;

public class Note{

	private char note;
	private int duration;

	public Note(char note, int duration){
		this.note = note;
		this.duration = duration;	
	}

	public char getNote(){
		return note;
	}

	public int getDuration() {
		return duration;
	}

	public void setNote(char note){
		this.note = note;
	}

	public void setDuration(int duration){
		this.duration = duration;
	}

	public String toString(){
		return "Note [note = " + note + "note duration = " + duration +"]";
	}
}
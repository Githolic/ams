package gapp.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Academic {

	@Column(name = "toefl_score")
	private String toeflscore;

	@Column(name = "gre_score")
	private String grescore;

	private String gpa;

	private String transcript;

	public String getToeflscore() {
		return toeflscore;
	}

	public void setToeflscore(String toeflscore) {
		this.toeflscore = toeflscore;
	}

	public String getGrescore() {
		return grescore;
	}

	public void setGrescore(String grescore) {
		this.grescore = grescore;
	}

	public String getGpa() {
		return gpa;
	}

	public void setGpa(String gpa) {
		this.gpa = gpa;
	}

	public String getTranscript() {
		return transcript;
	}

	public void setTranscript(String transcript) {
		this.transcript = transcript;
	}

}

package DVD;

import java.util.Date;

public class dvdInfo
{
	int dvdUPC;
	String dvdTitle;
	String dvdComposer;
	String dvdDirector;
	String dvdLeadActor;
	String dvdSupportingActor;
	Date dvdYear;
	int dvdCopies;
	float dvdPrice;
	
	public dvdInfo(int dvdUPC, String dvdTitle, String dvdComposer,
			String dvdDirector, String dvdLeadActor, String dvdSupportingActor,
			Date dvdYear, int dvdCopies, float dvdPrice) {
		this.dvdUPC = dvdUPC;
		this.dvdTitle = dvdTitle;
		this.dvdComposer = dvdComposer;
		this.dvdDirector = dvdDirector;
		this.dvdLeadActor = dvdLeadActor;
		this.dvdSupportingActor = dvdSupportingActor;
		this.dvdYear = dvdYear;
		this.dvdCopies = dvdCopies;
		this.dvdPrice = dvdPrice;
	}

	public int getDvdUPC() {
		return dvdUPC;
	}

	public void setDvdUPC(int dvdUPC) {
		this.dvdUPC = dvdUPC;
	}

	public String getDvdTitle() {
		return dvdTitle;
	}

	public void setDvdTitle(String dvdTitle) {
		this.dvdTitle = dvdTitle;
	}

	public String getDvdComposer() {
		return dvdComposer;
	}

	public void setDvdComposer(String dvdComposer) {
		this.dvdComposer = dvdComposer;
	}

	public String getDvdDirector() {
		return dvdDirector;
	}

	public void setDvdDirector(String dvdDirector) {
		this.dvdDirector = dvdDirector;
	}

	public String getDvdLeadActor() {
		return dvdLeadActor;
	}

	public void setDvdLeadActor(String dvdLeadActor) {
		this.dvdLeadActor = dvdLeadActor;
	}

	public String getDvdSupportingActor() {
		return dvdSupportingActor;
	}

	public void setDvdSupportingActor(String dvdSupportingActor) {
		this.dvdSupportingActor = dvdSupportingActor;
	}

	public Date getDvdYear() {
		return dvdYear;
	}

	public void setDvdYear(Date dvdYear) {
		this.dvdYear = dvdYear;
	}

	public int getDvdCopies() {
		return dvdCopies;
	}

	public void setDvdCopies(int dvdCopies) {
		this.dvdCopies = dvdCopies;
	}

	public float getDvdPrice() {
		return dvdPrice;
	}

	public void setDvdPrice(float dvdPrice) {
		this.dvdPrice = dvdPrice;
	}
}

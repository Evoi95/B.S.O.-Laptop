package database;

import java.awt.Image;
import java.io.File;
import java.util.List;

public class Images {
	private List<File> image;
	private List<Image> img;
	private boolean notValid;

	public Images() {
		notValid = true;
	}

	public Images(List<File> im) {
		image = im;
		notValid = false;
	}
	
	public Images(List<Image> img ,boolean notValid) {
		this.img = img;
		this.notValid = notValid;
	}

	public void addImage(File im) {
		image.add(im);
	}

	public List<File> getImages() {
		return image;
	}

	public boolean isNotValid() {
		return notValid;
	}

}


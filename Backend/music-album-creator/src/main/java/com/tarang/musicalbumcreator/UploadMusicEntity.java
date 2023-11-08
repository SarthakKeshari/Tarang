package com.tarang.musicalbumcreator;
import javax.persistence.*;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;




public class UploadMusicEntity {

  private String title;
  private String description;
  public String getTitle() {
		// TODO Auto-generated method stub
		return this.title;
	}
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}
}

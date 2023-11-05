package com.tarang.musicalbumcreator;
import javax.persistence.*;

import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.AllArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UploadMusicEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;
}

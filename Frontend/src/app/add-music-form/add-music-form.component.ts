import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-add-music-form',
  templateUrl: './add-music-form.component.html',
  styleUrls: ['./add-music-form.component.css']
})
export class AddMusicFormComponent {
    visible: boolean = false;

    showDialog() {
        this.visible = true;
    }
    /*music: AddMusicFormComponent = {
      songTitle: '',
      songDescription: '',
    };
  
    constructor(private http: HttpClient) {}
  
    submitForm() {
      this.http.post('http://localhost:8080/api/music/add', this.music).subscribe(
        (response) => {
          console.log('Music added successfully', response);
        },
        (error) => {
          console.error('Error adding music', error);
        }
      );
    }*/
    value: string | undefined;


}



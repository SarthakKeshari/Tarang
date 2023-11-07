import { Component } from '@angular/core';
import { HttpClient, HttpParams, HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-music-card',
  templateUrl: './music-card.component.html',
  styleUrls: ['./music-card.component.css']
})
export class MusicCardComponent {
  constructor(private http: HttpClient) {
  }

  testget() {
    this.http.get("http://127.0.0.1:8080/get").subscribe(
      (response) => {                           
        console.log(response)
      })
  }
}

import { Component } from '@angular/core';

@Component({
  selector: 'app-add-music-form',
  templateUrl: './add-music-form.component.html',
  styleUrls: ['./add-music-form.component.css']
})
export class AddMusicFormComponent {
    visible: boolean = true;

    showDialog() {
        this.visible = true;
    }

    value: string | undefined;
}

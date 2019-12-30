import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'DEVICE DETAIL';
  isShow = true;
  dow = true;
  toggleDisplay() {
    this.dow = true;
    this.isShow = false;
  }

  toggleDisplay_1(){
    this.isShow = true;
    this.dow = false
  }
}

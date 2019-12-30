import { Component, OnInit } from '@angular/core';
import {DeviceService} from '../device.service';
import {ActivatedRoute, Router} from '@angular/router';
import {Devices} from '../device.service';



@Component({
  selector: 'app-device-detail',
  templateUrl: './device-detail.component.html',
  styleUrls: ['./device-detail.component.css']
})
export class DeviceDetailComponent implements OnInit {

  Device: Devices[];
  interval: any;
  constructor(private route: ActivatedRoute, private router: Router,
              private deviceSevice: DeviceService) { }

  ngOnInit() {

    this.refreshData();
    if (this.interval) {
      clearInterval(this.interval);
    }
    this.interval = setInterval(() => {
      this.refreshData();
    }, 5000);
  }
  refreshData()
  {
    this.deviceSevice.getDevice()
      .subscribe(data => {
        this.Device = data;
      })
  }
}



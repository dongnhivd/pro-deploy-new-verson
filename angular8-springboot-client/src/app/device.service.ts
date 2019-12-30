import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

export class Devices {
  constructor(
    public id_device: number,
    public device_name: string,
    public status: string,
    public command: number,
    public check_alive: number
) {}
}
@Injectable({
  providedIn: 'root'
})
export class DeviceService {

  constructor(private http: HttpClient) { }
  private baseUrl = 'http://localhost:8080/device';

  getDevice(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}

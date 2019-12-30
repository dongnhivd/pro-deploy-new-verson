import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {DeviceDetailComponent} from './device-detail/device-detail.component';
import {AppComponent} from './app.component';


const routes: Routes = [
  { path: '', redirectTo: 'device', pathMatch: 'full' },
  { path: 'main', component: AppComponent },
  //{ path: 'device', component: DeviceDetailComponent },
];

@NgModule ({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

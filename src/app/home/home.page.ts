import { Component } from '@angular/core';
import { IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/angular/standalone';



@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
  standalone: true,
  imports: [IonHeader, IonToolbar, IonTitle, IonContent],
})
export class HomePage {

  constructor() {}
  sendEmail() {
    console.log('Send Email');
 }

 generateReport() {
    console.log('Generate Report');
 }

 manageUsers() {
    console.log('Manage Users');
 }

 viewNotifications() {
    console.log('View Notifications');
 }

 adminSettings() {
    console.log('Admin Settings');
 }

 accessAdminFeatures() {
    console.log('Access Admin Features');
 }
}

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { IonicModule } from '@ionic/angular';
import { routes } from "src/app/app.routes";
import { AppComponent } from './app.component';
import { IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/angular';
import { HomePage } from './home/home.page';
import { CommonModule } from '@angular/common';
import { RouteReuseStrategy } from '@angular/router';
import { IonicRouteStrategy } from '@ionic/angular';

@NgModule({
 declarations: [
    AppComponent,
    IonHeader,
    IonToolbar,
    IonTitle,
    IonContent,
    HomePage
 ],
 imports: [
    BrowserModule,
    IonicModule.forRoot(),
    routes,
    CommonModule
 ],
 providers: [{ provide: RouteReuseStrategy, useClass: IonicRouteStrategy }],
 bootstrap: [AppComponent]
 
})
export class AppModule {}
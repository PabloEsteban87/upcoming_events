import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PastEventsComponent } from './Events/components/past-events/past-events.component';
import { CreateEventComponent } from './Events/components/create-event/create-event.component';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './Events/views/home/home.component';
import { FooterComponent } from './shared/footer/footer.component';
import { LoginregisterComponent } from './Events/components/loginregister/loginregister.component';
import { PageregisterComponent } from './Events/components/pageregister/pageregister.component';
import { UpcomingEventsComponent } from '../app/Events/components/upcoming-events/upcoming-events.component';
import { SliderComponent } from './Events/components/slider/slider.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatPaginatorModule } from '@angular/material/paginator';
import { EventDetailComponent } from './events/components/event-detail/event-detail.component';
import { HeaderComponent } from './shared/header/header.component';
import { EditEventComponent } from './Events/components/edit-event/edit-event.component';



@NgModule({
  declarations: [
    AppComponent,
    PastEventsComponent,
    HomeComponent,
    LoginregisterComponent,
    FooterComponent,
    PageregisterComponent,
    UpcomingEventsComponent,
    EditEventComponent,
    CreateEventComponent,
    SliderComponent,
    HeaderComponent,
    EventDetailComponent

  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatPaginatorModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

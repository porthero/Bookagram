// src/app/app.module.ts

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { SharedModule } from './shared/shared.module';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';

// Import PrimeNG modules
import { TableModule } from 'primeng/table'; // Import TableModule
import { NgbModule } from '@ng-bootstrap/ng-bootstrap'; // Import NgbModule from '@ng-bootstrap/ng-bootstrap'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TableComponent } from './table/table.component';
import { BookService } from './book.service';
import { HomeComponent } from './home/home.component';

@NgModule({
  declarations: [
    AppComponent,
    TableComponent,
    HomeComponent,
  ],
  imports: [
    NgbModule,
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    TableModule,
    SharedModule
  ],
  providers: [BookService],
  bootstrap: [AppComponent],
})
export class AppModule {}

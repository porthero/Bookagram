// src/app/app.module.ts

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

// Import PrimeNG modules
import { TableModule } from 'primeng/table'; // Import TableModule

import { NgbModule } from '@ng-bootstrap/ng-bootstrap'; // Import NgbModule from '@ng-bootstrap/ng-bootstrap'

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TableComponent } from './table/table.component';
import { BookService } from './book.service';

@NgModule({
  declarations: [
    AppComponent,
    TableComponent,
  ],
  imports: [
    NgbModule,
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    TableModule,

    // Add PrimeNG modules to the imports
    TableModule, // Import the TableModule
  ],
  providers: [BookService],
  bootstrap: [AppComponent],
})
export class AppModule {}

// src/app/app.module.ts

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { CommonModule } from '@angular/common';
import { TableComponent } from './table/table.component'; // Import the TableComponent
import { BookService } from './book.service'; // Import the BookService


@NgModule({
  declarations: [
    TableComponent, // Make sure TableComponent is included here
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    CommonModule,
    AppRoutingModule,
  ],
  providers: [BookService], // Add BookService to the providers
  bootstrap: [TableComponent],
})
export class AppModule {}

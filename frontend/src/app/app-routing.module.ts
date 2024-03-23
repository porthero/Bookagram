// src/app/app-routing.module.ts

import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TableComponent } from './table/table.component';
import { HomeComponent } from './home/home.component';
import { BookDetailComponent } from './book-detail/book-detail.component';

const routes: Routes = [
  { path: 'table', component: TableComponent },
  { path: 'home', component: HomeComponent },
  { path: 'books/:id', loadComponent: () => import('./book-detail/book-detail.component').then(m => m.BookDetailComponent)},
  { path: '', redirectTo: '/home', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

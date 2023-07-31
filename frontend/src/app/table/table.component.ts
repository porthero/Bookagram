// src/app/table/table.component.ts

import { Component, OnInit } from '@angular/core';
import { BookService } from '../book.service';
import { Book } from '../book.interface';

@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent implements OnInit {
  books: Book[] = [];

  constructor(private bookService: BookService) { }

  ngOnInit(): void {
    this.loadBooks();
  }

  loadBooks(): void {
    this.bookService.getAllBooks().subscribe((data: Book[]) => {
      this.books = data;
      console.log(this.books);
    });
  }
}

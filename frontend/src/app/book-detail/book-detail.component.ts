import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BookService } from '../book.service';
import { CommonModule } from '@angular/common';
import { Book } from '../book.interface';
import { FormsModule } from '@angular/forms'

@Component({
  selector: 'app-book-detail',
  templateUrl: './book-detail.component.html',
  styleUrls: ['./book-detail.component.css'],
  standalone: true,
  imports: [ FormsModule, CommonModule ]
})
export class BookDetailComponent implements OnInit {
  book: Book | undefined;

  constructor(private bookService: BookService, private route: ActivatedRoute) {}

  ngOnInit(): void {
    this.route.params.subscribe(params => {
      const bookId = +params['id'];
      if (bookId) {
        this.bookService.getBookById(bookId).subscribe(book => {
          this.book = book;
          console.log(this.book);
        });
      }
    });
  }
}

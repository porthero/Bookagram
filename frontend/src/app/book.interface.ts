// src/app/book.interface.ts

export interface Book {
  id: number;
  title: string;
  isbn: string;
  publisher: string;
  pages: number;
  year?: number; // Optional property, add this
  isRead?: boolean; // Optional property, add this
}

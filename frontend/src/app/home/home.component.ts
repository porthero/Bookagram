import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { faBook, faBookOpen } from '@fortawesome/free-solid-svg-icons';
import { trigger, state, style, transition, animate } from '@angular/animations';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  animations: [
    trigger('fadeZoomOut', [
      transition(':leave', [ // :leave is alias for '* => void'
        style({ opacity: 1, transform: 'scale(1)' }),
        animate('0.5s', style({ opacity: 0, transform: 'scale(1.5)' }))
      ])
    ])
  ]
})
export class HomeComponent {

faBook = faBook;
faBookOpen = faBookOpen;
isBookOpen: boolean = false;

constructor(private router: Router) {}

toggleBook() {
    this.isBookOpen = !this.isBookOpen;
    this.navigateToTable();
  }

navigateToTable() {
    setTimeout(() => this.router.navigateByUrl('/table'), 1000); // Adjust timing if needed
    }
}

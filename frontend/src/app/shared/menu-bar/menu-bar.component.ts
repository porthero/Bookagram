// src/app/shared/menu-bar/menu-bar.component.ts

import { Component } from '@angular/core';
import { MenuItem } from 'primeng/api';

@Component({
  selector: 'app-menu-bar',
  templateUrl: './menu-bar.component.html',
  styleUrls: ['./menu-bar.component.css']
})
export class MenuBarComponent {

  items: MenuItem[] = [];

  ngOnInit() {
    this.items = [
      {
        label: 'Home',
        icon: 'pi pi-fw pi-home',
        routerLink: ['/home']
      },
      {
        label: 'Books',
        icon: 'pi pi-fw pi-book',
        routerLink: ['/books']
      },
      // Add more menu items as needed
    ];
  }

}

// src/app/shared/shared.module.ts

import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MenubarModule } from 'primeng/menubar';
import { MenuBarComponent } from './menu-bar/menu-bar.component'; // Import MenuBarComponent

@NgModule({
  declarations: [
    MenuBarComponent // Declare MenuBarComponent
  ],
  imports: [
    CommonModule,
    MenubarModule
  ],
  exports: [
    MenuBarComponent // Export MenuBarComponent so it can be used in other modules
  ]
})
export class SharedModule { }

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ProductListComponent } from './components/product-list/product-list.component';
import { HttpClientModule } from '@angular/common/http';
import { ProductService } from './services/product.service';

import { Routes, RouterModule } from '@angular/router';
import { ProductCategoryMenuComponent } from './components/product-category-menu/product-category-menu.component';
import { SearchComponent } from './components/search/search.component';
import { ProductDetailsComponent } from './components/product-details/product-details.component';
import { CurrencyPipe } from '@angular/common';

const routes: Routes = [

  { path: 'search/:keyword', component: ProductListComponent },
  { path: 'category/:id', component: ProductListComponent },
  { path: 'category', component: ProductListComponent },
  { path: 'product/:id', component: ProductDetailsComponent },
  { path: 'product', component: ProductListComponent },
  { path: '', redirectTo: '/product', pathMatch: 'full' },
  { path: '**', redirectTo: '/product', pathMatch: 'full' }
];

@NgModule({
  declarations: [

    AppComponent,
    ProductListComponent,
    ProductCategoryMenuComponent,
    SearchComponent,
    ProductDetailsComponent,
  ],
  imports: [
    RouterModule.forRoot(routes),
    BrowserModule,
    HttpClientModule,
  ],
  providers: [ProductService, CurrencyPipe],
  bootstrap: [AppComponent]
})
export class AppModule { }

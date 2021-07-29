import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Product } from '../common/product';
import { Observable } from 'rxjs';
import { map } from 'rxjs/operators';
import { ProductCategory } from '../common/product-category';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  // rest resource
  private baseUrl = 'http://localhost:1997/api/products';

  constructor(private httpClient: HttpClient) { }

  getProductList(theCategoryId: number): Observable<Product[]> {

    // need to build URL based on category id
    const searchUrl = `${this.baseUrl}/search/findByCategoryId?id=${theCategoryId}`;
    return this.httpClient.get<GetResponse>(searchUrl).pipe(
      map(response => response._embedded.products)
    );
  }

  private categoryUrl = 'http://localhost:1997/api/product-category';

  getProductCategories(): Observable<ProductCategory[]> {
    // return this.httpClient.get<GetResponseProductCategory>(this.categoryUrl).pipe(
    //   map(response => response._embedded));
    return this.httpClient.get<ProductCategory[]>(this.categoryUrl);
  }


  searchProducts(theKeyword: string): Observable<Product[]> {
    // need to build URL based on the keyword

    //const searchUrl = `${this.baseUrl}/search/findByNameContaining?name=${theKeyword}`;
    // return this.httpClient.get<GetResponseProduct>(searchUrl).pipe(

    //   map(response => response._embedded.products)

    // );

    // -> using rest controller
    const searchUrl = `http://localhost:1997/api/product/search/findByNameContaining?name=${theKeyword}`
    return this.httpClient.get<any>(searchUrl);

  }

}

interface GetResponse {
  _embedded: {
    products: Product[];
  }
}

interface GetResponseProduct {
  _embedded: {
    products: Product[];
  }
}

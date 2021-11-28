import { Product } from "./product.model";

export class Wishes {
    id?: number;
    product: Product;
    amount: number;

    constructor() { 
        // Initialization inside the constructor
        this.product = new Product;
        this.amount = 0;
     }
}

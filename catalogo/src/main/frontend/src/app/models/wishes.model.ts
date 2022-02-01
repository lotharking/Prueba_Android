import { Product } from "./product.model";
import { User } from "./user.module";

export class Wishes {
    id?: number;
    product: Product;
    amount: number;
    user:User;

    constructor() { 
        // Initialization inside the constructor
        this.product = new Product;
        this.amount = 0;
        this.user = new User();
     }
}

import { Product } from "./product.model";
import { User } from "./user.module";

export class Wishes {
    id?: number;
    product: Product;
    amount: number;
    user:User;
}

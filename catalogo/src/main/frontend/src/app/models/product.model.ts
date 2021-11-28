export class Product {
    id?: number;
    name: string;
    price: number;
    stock: number;

    constructor() { 
        // Initialization inside the constructor
        this.name = "";
        this.price = 0;
        this.stock = 0;
     }
}

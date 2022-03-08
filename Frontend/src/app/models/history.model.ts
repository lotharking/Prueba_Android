import { Wishes } from "./wishes.model";

export class History {
    id?: number;
    wish: Wishes;

    constructor() { 
        // Initialization inside the constructor
        this.wish = new Wishes;
     }
}

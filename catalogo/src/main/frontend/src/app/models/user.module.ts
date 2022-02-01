import { Wishes } from "./wishes.model";

export class User {
  id?: number;
  first_name:String;
  last_name:String;
  username: string;
  password: string;
  wish:Wishes;

  constructor() { 
      // Initialization inside the constructor
      this.first_name = "";
      this.last_name = "";
      this.username = "";
      this.password = "";
      this.wish = new Wishes();
   }
}

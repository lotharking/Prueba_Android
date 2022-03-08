import { Wishes } from "./wishes.model";

export class User {
  id?: number;
  first_name!:String;
  last_name!:String;
  username!: string;
  password!: string;
  wish!: Wishes;
  token: String;
}

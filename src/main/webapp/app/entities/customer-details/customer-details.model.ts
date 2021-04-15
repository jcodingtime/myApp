import { IUser } from 'app/entities/user/user.model';
import { IShoppingCart } from 'app/entities/shopping-cart/shopping-cart.model';
import { Gender } from 'app/entities/enumerations/gender.model';

export interface ICustomerDetails {
  id?: number;
  gender?: Gender;
  phone?: string;
  addressLine1?: string;
  numberAddressLine1?: number | null;
  addressLine2?: string | null;
  city?: string;
  country?: string;
  age?: number | null;
  user?: IUser;
  carts?: IShoppingCart[] | null;
}

export class CustomerDetails implements ICustomerDetails {
  constructor(
    public id?: number,
    public gender?: Gender,
    public phone?: string,
    public addressLine1?: string,
    public numberAddressLine1?: number | null,
    public addressLine2?: string | null,
    public city?: string,
    public country?: string,
    public age?: number | null,
    public user?: IUser,
    public carts?: IShoppingCart[] | null
  ) {}
}

export function getCustomerDetailsIdentifier(customerDetails: ICustomerDetails): number | undefined {
  return customerDetails.id;
}

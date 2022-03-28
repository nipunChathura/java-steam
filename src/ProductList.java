/*
 *
 *  *  *  * ---------------------------------------------------------------------------------------------
 *  *  *  *  *  Copyright (c) IJSE-intern. All rights reserved.
 *  *  *  *  *  Licensed under the MIT License. See License.txt in the project root for license information.
 *  *  *  *  --------------------------------------------------------------------------------------------/
 *
 */

import java.util.ArrayList;

/**
 * @author : Nipun Chathuranga <nipunc1999@gmail.com>
 * @since : 9/19/2021
 **/

public class ProductList {
    private ArrayList<ItemList> itemLists;

    public ProductList() {
    }

    public ProductList(ArrayList<ItemList> itemLists) {
        this.itemLists = itemLists;
    }

    public ArrayList<ItemList> getItemLists() {
        return itemLists;
    }

    public void setItemLists(ArrayList<ItemList> itemLists) {
        this.itemLists = itemLists;
    }

    @Override
    public String toString() {
        return "ProductList{" +
                "itemLists=" + itemLists +
                '}';
    }
}


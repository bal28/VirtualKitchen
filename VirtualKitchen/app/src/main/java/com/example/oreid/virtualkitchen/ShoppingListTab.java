package com.example.oreid.virtualkitchen;

import android.os.Bundle;

import static com.example.oreid.virtualkitchen.StorageArea.FRIDGE;
import static com.example.oreid.virtualkitchen.StorageArea.SHOPPINGLIST;

/**
 * Fridge view in kitchen view
 *
 * Created by Dan on 22/02/2017.
 */

public class ShoppingListTab extends KitchenTab {

    public static final String TAG = "A_TO_Z_TAB";

    public void onCreate(Bundle savedInstanceState) {
        setTabName("Shopping List");
        super.onCreate(savedInstanceState);
        super.setStorageArea(SHOPPINGLIST);

<<<<<<< HEAD
//        setListData(db.get(SHOPPINGLIST));
=======
        setListData(db.get(SHOPPINGLIST));
>>>>>>> parent of 4aeeb8c... Hollie's Stuff
        updateUI();
    }


}

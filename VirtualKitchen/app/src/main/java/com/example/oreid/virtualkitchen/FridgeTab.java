package com.example.oreid.virtualkitchen;

import android.os.Bundle;

import static com.example.oreid.virtualkitchen.StorageArea.FRIDGE;

/**
 * Fridge view in kitchen view
 *
 * Created by hollie on 22/02/2017.
 */

public class FridgeTab extends KitchenTab {

    public static final String TAG = "A_TO_Z_TAB";

    public void onCreate(Bundle savedInstanceState) {
        setTabName("Fridge");
        super.onCreate(savedInstanceState);
        super.setStorageArea(FRIDGE);

        setListData(db.get(FRIDGE));
        updateUI();
    }


}

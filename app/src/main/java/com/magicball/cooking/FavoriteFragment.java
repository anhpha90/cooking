package com.magicball.cooking;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by long on 12/01/2017.
 */

public class FavoriteFragment extends Fragment {
View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
myView = inflater.inflate(R.layout.favorite,container,false);
return myView;
    }
}

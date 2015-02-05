package io.postach.willowcheng.rotation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

public class SuperAwesomeCardFragment extends Fragment {

    private static final String ARG_POSITION = "position";

    private int position;

    public static SuperAwesomeCardFragment newInstance(int position) {
        SuperAwesomeCardFragment f = new SuperAwesomeCardFragment();
        Bundle b = new Bundle();
        b.putInt(ARG_POSITION, position);
        f.setArguments(b);
        return f;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        position = getArguments().getInt(ARG_POSITION);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView;
        switch (position){
            case 0: rootView = inflater.inflate(R.layout.fragment_android,container,false);break;
            case 1: rootView = inflater.inflate(R.layout.fragment_ipad,container,false);break;
            case 2: rootView = inflater.inflate(R.layout.fragment_desktop,container,false);break;
            default: rootView = inflater.inflate(R.layout.fragment_desktop,container,false);break;
        }
        ButterKnife.inject(this, rootView);
        ViewCompat.setElevation(rootView,50);
        return rootView;
    }
}
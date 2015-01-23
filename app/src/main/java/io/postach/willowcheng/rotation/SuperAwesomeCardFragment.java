package io.postach.willowcheng.rotation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewCompat;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class SuperAwesomeCardFragment extends Fragment {

    private static final String ARG_POSITION = "position";

    @InjectView(R.id.textView)
    TextView textView;

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
        View rootView = inflater.inflate(R.layout.fragment_card,container,false);
        ButterKnife.inject(this, rootView);
        ViewCompat.setElevation(rootView,50);
        textView.setText("CARD "+position);
        return rootView;
    }
}
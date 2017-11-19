package nyc.c4q.java1119.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import nyc.c4q.java1119.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RandomFragment extends Fragment {

    private View rootView;
    public RandomFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_random, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.random_textview);

        Bundle bundle = getArguments();
        String fromPreviousFragment = bundle.getString("random");

        textView.setText(fromPreviousFragment);

        return rootView;
    }

}

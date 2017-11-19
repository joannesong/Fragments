package nyc.c4q.java1119.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import nyc.c4q.java1119.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PictureFragment extends Fragment {


    private View rootView;

    public PictureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_picture, container, false);
        ImageView imageView = rootView.findViewById(R.id.picture_imageview);
        imageView.setImageResource(R.mipmap.ic_launcher);
        return rootView;
    }

}






















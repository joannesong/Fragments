package nyc.c4q.java1119;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nyc.c4q.java1119.fragments.ButtonFragment;
import nyc.c4q.java1119.fragments.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonFragment buttonFragment = new ButtonFragment();
        MainFragment mainFragment = new MainFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.bottom_container, buttonFragment).addToBackStack("top");
        fragmentTransaction.replace(R.id.top_container, mainFragment).addToBackStack("bottom"); // main_container is where it holds all of our fragments
        fragmentTransaction.commit();

    }
}

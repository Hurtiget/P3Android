package com.example.dennis.p3;


import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.dennis.p3.APIConnections.MainActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class SpotifyFragment extends Fragment {
private MainActivity mainactivty;
    private Button buttonPlay;
    private Button buttonStop;
    private TextView artist;
    private TextView title;

    public SpotifyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_spotify, container, false);
        buttonPlay = (Button) view.findViewById(R.id.buttonplay);
        buttonStop = (Button) view.findViewById(R.id.buttonstop);

        artist = (TextView) view.findViewById(R.id.textViewArtist);
        title = (TextView) view.findViewById(R.id.textViewTitle);

        buttonPlay.setOnClickListener(new ButtonListener());
        buttonStop.setOnClickListener(new ButtonListener2());
        return view;
    }

    public void setMainactivty(MainActivity mainactivty) {
        this.mainactivty = mainactivty;
    }

    private class ButtonListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            mainactivty.startSong();

        }
    }
        private class ButtonListener2 implements View.OnClickListener {
            @Override
            public void onClick(View view) {
                mainactivty.stopSong();
            }
        }

        public void setArtist(String artist1) {
            artist.setText(artist1);
        }


        public void setTitle(String title1) {
            title.setText(title1);
        }
}

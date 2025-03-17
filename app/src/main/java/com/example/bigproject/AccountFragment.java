package com.example.bigproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AccountFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_account, container, false);

        Button exitinsystem = (Button)rootView.findViewById(R.id.exitinsystem);
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

        exitinsystem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AccountFragment.this.isInLayout();
            }
        });

        return rootView;
    }
}
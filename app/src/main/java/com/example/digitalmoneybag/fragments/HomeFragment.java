package com.example.digitalmoneybag.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.digitalmoneybag.ExampleDiolog;
import com.example.digitalmoneybag.R;


public class HomeFragment extends Fragment implements View.OnClickListener {

    private Button butTotalEarn,butTotalSpend;
    private RelativeLayout rl_earn, rl_spend;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        //----------------------------- Find View by Id ---------------------------------//
        butTotalEarn = view.findViewById(R.id.mbutTotalEarn);
        butTotalSpend = view.findViewById(R.id.mbutTotalSpend);
        rl_earn = view.findViewById(R.id.rl_earn);
        rl_spend = view.findViewById(R.id.rl_spend);

        //------------------------------ set OnClick Listener -----------------------------//
        butTotalEarn.setOnClickListener(this);
        butTotalSpend.setOnClickListener(this);
        rl_earn.setOnClickListener(this);
        rl_spend.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        int position = v.getId();
        switch (position){
            case R.id.mbutTotalEarn:
                Toast.makeText(getContext(), "total earn but is clicked", Toast.LENGTH_SHORT).show();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new TotalEarnFragment()).commit();
                break;
            case R.id.mbutTotalSpend:
                Toast.makeText(getContext(), "total Spend but is clicked", Toast.LENGTH_SHORT).show();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new TotalSpendFragment()).commit();
                break;
            case R.id.rl_earn:
                Toast.makeText(getContext(), "earn but is clicked", Toast.LENGTH_SHORT).show();
                openDiolog();
                break;
            case R.id.rl_spend:
                Toast.makeText(getContext(), "spend but is clicked", Toast.LENGTH_SHORT).show();
                openDiolog();
                break;
        }
    }

    public void openDiolog(){
        ExampleDiolog exampleDiolog = new ExampleDiolog();
        exampleDiolog.show(getFragmentManager(), "example diolog");

    }

}
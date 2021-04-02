package com.example.studentroombooking.ui.gallery;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.studentroombooking.R;

public  class GalleryFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    View root;
   Spinner spinner;
    private static final String[] paths = {"user", "staff","abs"};


    String utype;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

         root = inflater.inflate(R.layout.fragment_gallery, container, false);
         init();


        return root;



    }

    private void init() {

        spinner=root.findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,paths);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        utype = adapterView.getItemAtPosition(position).toString();

        Log.e("usertype",utype);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
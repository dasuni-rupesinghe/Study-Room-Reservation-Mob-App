package com.example.studentroombooking.ui.booking;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.studentroombooking.R;

public  class BookingFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    View root;
   Spinner spinner,spinner2;
    private static final String[] paths = {"user", "staff","abs"};
    private static final String[] room = {"001","002","003"};

    String utype;
    String rtype;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

         root = inflater.inflate(R.layout.fragment_booking, container, false);
         init();
         initt();

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

    private void initt(){
        spinner2=root.findViewById(R.id.spinner2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_item,room);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);
        spinner2.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
        utype = adapterView.getItemAtPosition(position).toString();

        Log.e("usertype",utype);
    }
    public void onIdSelected(AdapterView<?> adapterView, View view, int id, long l) {
        rtype = adapterView.getItemAtPosition(id).toString();

        Log.e("idtype",rtype);
    }


    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
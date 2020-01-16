package com.example.finalproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ProfileFragment extends Fragment {

    EditText txtName, txtContact, txtBio, txtVenmo;
    Button save;
    DatabaseReference reff;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        txtName = (EditText) view.findViewById(R.id.editText);
        txtBio = (EditText) view.findViewById(R.id.editText2);
        txtContact = (EditText) view.findViewById(R.id.editText3);
        txtVenmo = (EditText) view.findViewById(R.id.editText4);
        save =(Button) view.findViewById(R.id.button);

        reff = FirebaseDatabase.getInstance().getReference().child("member");

        return view;
    }
}

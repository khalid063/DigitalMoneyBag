package com.example.digitalmoneybag;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

public class ExampleDiolog extends AppCompatDialogFragment {

    private EditText editTextUserName,editTextPassword;

    @NonNull
    @Override   // Ctrl + o for overWrite the mathod
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.layout_diolog, null);

        builder.setView(view)
                .setTitle("Login")
                .setCancelable(false)
                .setNegativeButton("cencel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Submit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String name = editTextUserName.getText().toString();
                        String pass = editTextPassword.getText().toString();

                        Log.d("test","name "+ name);
                    }
                });


        editTextUserName = view.findViewById(R.id.et_username);
        editTextPassword = view.findViewById(R.id.et_pass);

        return builder.create();

    }

}

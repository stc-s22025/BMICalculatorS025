package com.example.bmicalculators025;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class Dialog extends DialogFragment {
    @NonNull
    @Override
    public android.app.Dialog onCreateDialog(@NonNull Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("警告");
        builder.setMessage("適切な肥満度を求めるためには６差未満にはカプウ関数が、６差から１５歳まではローレル関数が使われています。");
        builder.setPositiveButton("確認",new DialogButtonClickListener());

        AlertDialog dialog = builder.create();
        return dialog;
    }

    public  class DialogButtonClickListener implements DialogInterface.OnClickListener{
        @Override
        public  void onClick(DialogInterface dialog,int which){

        }
    }
}

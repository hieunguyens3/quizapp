package com.app.quiz.quizapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.quiz.quizapp.R;
import com.app.quiz.quizapp.activity.ScoreActivity;

public class MainFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.ansBtn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),ScoreActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        view.findViewById(R.id.ansBtn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),ScoreActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        view.findViewById(R.id.ansBtn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),ScoreActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });

        view.findViewById(R.id.ansBtn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getActivity(),ScoreActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
    }
}

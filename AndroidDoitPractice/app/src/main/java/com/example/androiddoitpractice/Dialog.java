package com.example.androiddoitpractice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Dialog extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        textView = findViewById(R.id.dialogtext);

        Button DialogAction = findViewById(R.id.dialogAction);
        DialogAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showMessage();
            }
        });
    }

    private void showMessage(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this); //대화상자 빌더 객체 생성
        builder.setTitle("안내"); // 대화상자의 제목
        builder.setMessage("종료하시겠습니까?"); // 대화상자의 메시지
        builder.setIcon(android.R.drawable.ic_dialog_alert); // 제목 옆에 아이콘 설정

        builder.setPositiveButton("예", new DialogInterface.OnClickListener() { //예 버튼 추가
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String message = "예 버튼이 눌렸습니다.";
                textView.setText(message);
            }
        });
        builder.setNeutralButton("취소", new DialogInterface.OnClickListener() { //취소 버튼 추가
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String message = "취소 버튼이 눌렸습니다.";
                textView.setText(message);
            }
        });
        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() { // 아니오 버튼 추가
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String message = "아니오 버튼이 눌렸습니다.";
                textView.setText(message);
            }
        });

        AlertDialog dialog = builder.create(); //대화상자 객체 생성
        dialog.show(); // 보여주기
    }
}

package ru.ogorodnik.homework121;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView exampleText = (TextView) findViewById(R.id.textView2);
        final EditText userNameText = (EditText) findViewById(R.id.editusername);
        final EditText userMailText = (EditText) findViewById(R.id.editemail);
        final Button buttonOk = (Button) findViewById(R.id.okbutton);
        final Button buttonClear = (Button) findViewById(R.id.clearbutton);

        // Нажимаем на кнопку ОК
        buttonOk.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    exampleText.setText("Подписка на рассылку успешно оформлена для пользователя " + userNameText.getText() +
                            " на электронный адрес " + userMailText.getText());
                }
        });
        // Нажимаем на кнопку ОЧИСТИТЬ
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exampleText.setText("");
            }
        });
    }
}

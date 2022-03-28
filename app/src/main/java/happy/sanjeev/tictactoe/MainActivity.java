package happy.sanjeev.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    String be1, be2, be3, be4, be5, be6, be7, be8, be9;
    int flag = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        b1 = findViewById(R.id.button1);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);
        b7 = findViewById(R.id.button7);
        b8 = findViewById(R.id.button8);
        b9 = findViewById(R.id.button9);
    }

    public void check(View view) {
        Button buttonCurrent = (Button) view;

        if (buttonCurrent.getText().toString().equals("")) {

            count++;
            if (flag == 0) {
                buttonCurrent.setText("X");
                flag = 1;
            } else {
                buttonCurrent.setText("O");
                flag = 0;
            }
            if (count > 4) {
                be1 = b1.getText().toString();
                be2 = b2.getText().toString();
                be3 = b3.getText().toString();
                be4 = b4.getText().toString();
                be5 = b5.getText().toString();
                be6 = b6.getText().toString();
                be7 = b7.getText().toString();
                be8 = b8.getText().toString();
                be9 = b9.getText().toString();

                if (be1.equals(be2) && be2.equals(be3) && !be1.equals("")) {
                    Toast.makeText(this, "Winner is: " + be1, Toast.LENGTH_SHORT).show();
                    newGame();

                } else if (be4.equals(be5) && be5.equals(be6) && !be4.equals("")) {
                    Toast.makeText(this, "Winner is: " + be4, Toast.LENGTH_SHORT).show();
                    newGame();

                } else if (be7.equals(be8) && be8.equals(be9) && !be7.equals("")) {
                    Toast.makeText(this, "Winner is: " + be7, Toast.LENGTH_SHORT).show();
                    newGame();

                } else if (be1.equals(be4) && be4.equals(be7) && !be1.equals("")) {
                    Toast.makeText(this, "Winner is: " + be1, Toast.LENGTH_SHORT).show();
                    newGame();

                } else if (be2.equals(be5) && be5.equals(be8) && !be2.equals("")) {
                    Toast.makeText(this, "Winner is: " + be2, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (be3.equals(be6) && be6.equals(be9) && !be3.equals("")) {
                    Toast.makeText(this, "Winner is: " + be3, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (be1.equals(be5) && be5.equals(be9) && !be1.equals("")) {
                    Toast.makeText(this, "Winner is: " + be1, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (be3.equals(be5) && be5.equals(be7) && !be3.equals("")) {
                    Toast.makeText(this, "Winner is: " + be3, Toast.LENGTH_SHORT).show();
                    newGame();
                } else if (!be1.equals("") && !be2.equals("") && !be3.equals("")
                        && !be4.equals("") && !be5.equals("") && !be6.equals("")
                        && !be7.equals("") && !be8.equals("") && !be9.equals("")) {

                    Toast.makeText(this,"Game is Drawn",Toast.LENGTH_SHORT).show();
                    newGame();
                }
            }
        }

    }

    public void newGame() {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
        count = 0;
        flag = 0;
    }
}
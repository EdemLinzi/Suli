package hu.ppke.itk.linad.myfirstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //ESETEK
    //1.Elindítjuk az appot
    //2.Bezárjuk az appot
    //3.A háttérben futó alkalmazások listáját szeretnénk megnyitni miközben meg van nyitva az app
    //4.A háttérben fútó alkalmazások közül nyitjuk meg
    //5.Lezárjuk a telefont (Ez teljesen azt váltja ki mint a 3.)
    //6.Feloldjuk a telefont, a lázárás pillanatában meg volt nyitva az app (Ez teljesen azt váltja ki mint a 4.)
    //6.Több ablakos mód



    //1 eset 1.lépés meghívódik a Create metódus
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("MainActivity","Create Activity");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn  = (Button) findViewById(R.id.exit_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity","Exit button pressed");
                finish();
            }
        });
    }

    // 1. eset 2.lépés onStart metódus meghívása
    // 4. eset 2.lépés elindul az app
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MainActivity","Start Activity");
    }

    // 1. eset 3.lépés onResume metódus meghívása
    // 4. eset 3.lépés újra láthatjuk az appot
    // 6.eset 2.lépés ha többablakos módban az alkalmazásunkra koppintunk
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("MainActivity","Resume Activity");
    }

    // 2. eset 1.lépés onPause metódus meghívása
    // 3. eset 1.lépés onPause metóst vált ki amiből utána a Stop metódusba kell mennie
    // 6.eset 1.lépés ezt váltja ki ha többablakos módban a másik alkalmazásra koppintunk
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("MainActivity","Pause Activity");
    }

    // 2. eset 2.lépés onStop metódus meghívása
    // 3. eset 2.lépés onStop metósba lép mivel nem látható az app
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("MainActivity","Stop Activity");
    }

    //4. eset 1.lépés újra el kell indítani az appot így Restart metódus
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("MainActivity","Restart Activity");
    }

    // 2. eset 3.lépés onDestroy metódus meghívása
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i("MainActivity","Destroy Activity");
    }



}

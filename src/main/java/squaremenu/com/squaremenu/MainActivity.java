package squaremenu.com.squaremenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.devs.squaremenu.OnMenuClickListener;
import com.devs.squaremenu.SquareMenu;
import com.kassisdion.lib.toolbar.AnimatedToolbar;
import com.kassisdion.lib.toolbarAnimator.ToolbarAnimator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*AnimatedToolbar toolbar = (AnimatedToolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
        final int duration = 2 * 1000; //animation duration in ms
        //toolbar.getAnimator().startAnimation(duration, ToolbarAnimator.AnimationType.FADE_IN);
        SquareMenu mSquareMenu = (SquareMenu) findViewById(R.id.square_menu);
        mSquareMenu.setOnMenuClickListener(new OnMenuClickListener() {
            @Override
            public void onMenuOpen() {
                Toast.makeText(MainActivity.this, "Menu Opened", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onMenuClose() {
                Toast.makeText(MainActivity.this, "Menu Closed", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onClickMenu1() {
                Toast.makeText(MainActivity.this, "First Menu Clicked", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onClickMenu2() {
                Toast.makeText(MainActivity.this, "Second Menu Clicked", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onClickMenu3() {
                Toast.makeText(MainActivity.this, "Third Menu Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

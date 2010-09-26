package org.ale.krasha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class StackOverflow extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        }
    
    public void onResume(){
    	super.onResume();
    	endless();
    }
    
    public static void endless() {
        endless();
    }

}
    

package org.ale.krasha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SuperNotCalled extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        }
    
    public void onResume(){
    	//This will never happen.
        Intent thissa = new Intent(SuperNotCalled.this,SuperNotCalled.class); 
        startActivity(thissa);
    }
}
    
